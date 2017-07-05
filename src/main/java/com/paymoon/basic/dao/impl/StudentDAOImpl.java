package com.paymoon.basic.dao.impl;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.paymoon.basic.dao.IStudentDAO;
import com.paymoon.basic.po.Student;
@Repository("studentDAOImpl")
@Scope("prototype")
public class StudentDAOImpl extends InputDAOImpl<Student> implements IStudentDAO {

	@Override
	public Student avertRedund(String original) {
		// TODO Auto-generated method stub
		return this.findUnique("from Student t where t.id ='" + original+ "'");

	}



	@Override
	public void deleteById(String id) {
		this.bulkUpdate("delete from Student t where t.id = ?",
				new Object[] { id });
		
	}


	@Override
	public List<Student> getList(int rowStartIdx, int rowTotal) {
		// TODO Auto-generated method stub
		return this.findPaged("from Student t where 1=1 ", rowStartIdx, rowTotal);
	}

	@Override
	public long getPageTotal() {
		// TODO Auto-generated method stub
		return this
				.findPagedConut("select count(*) from Student t where 1=1 "
						);
	}

	@Override
	public List<Student> getList(String searchCondition, int rowStartIdx, int rowTotal) {
		// TODO Auto-generated method stub
		return this.findPaged("from Student t where 1=1 " + searchCondition, rowStartIdx, rowTotal);
	}

	@Override
	public long getPageTotal(String searchCondition) {
		// TODO Auto-generated method stub
		return this
				.findPagedConut("select count(*) from Student t where 1=1 "
						+ searchCondition);
	}

	@Override
	public List<Student> getAllList() {
		List<Student> list = this
				.find(" from Student t ");
		return list;
	}

	@Override
	public Student getEntityById(String entityId) {
		// TODO Auto-generated method stub
		return this.findUnique("from Student t where t.id ='" + entityId
				+ "'");
	}

}