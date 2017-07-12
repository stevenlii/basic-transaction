package com.paymoon.basic.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.paymoon.basic.commons.core.JsonUtil;
import com.paymoon.basic.commons.core.RedisUtilSimple;
import com.paymoon.basic.commons.web.DataResponse;
import com.paymoon.basic.commons.web.WebParam;
import com.paymoon.basic.po.Student;
import com.paymoon.basic.service.StudentService;

@Controller
@RequestMapping("/stu")
public class StudentController {
	private static Logger logger = LogManager.getLogger();
	@Autowired
	private StudentService studentServiceimpl;

	/**
	 * 测试页面跳转是否正常
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
	public String testPage(Model model) {
		System.out.println("success!!!!");
		model.addAttribute("result", "project is running successfully!!!");
		return "/index";
	}

	@RequestMapping(value = "/getstudent", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public @ResponseBody String getUiList(@PathVariable String userName, HttpServletRequest req,
			HttpServletResponse resp) {
		if (logger.isInfoEnabled()) {
			logger.info("start to query in '" + userName + "' param:" + WebParam.getParameterMap(req));
		}
		DataResponse result = new DataResponse();
		try {
				String data = RedisUtilSimple.get("UI_LIST_" + userName);
			if (StringUtils.isBlank(data)) {
				Student student = studentServiceimpl.getStudentByUserName(userName);
				data = JsonUtil.writeValueAsString(student);
				RedisUtilSimple.set("UI_LIST_" + userName, data);
			}
			result.setResult(DataResponse.R_SUCESS);
			result.setCode("200");
			result.setData(data);
			if (logger.isInfoEnabled())
				logger.info("success to query table:" + userName);
			return result.toString();
		} catch (Exception e) {
			logger.error("failed to list table:" + userName + "error message:" + e.getMessage());
			result.setCode("404");
			result.setResult(DataResponse.R_FAILED);
			result.setMessage("failed to list table:" + userName + "error message:" + e.getMessage());
		}
		return result.toString();
	}

}
