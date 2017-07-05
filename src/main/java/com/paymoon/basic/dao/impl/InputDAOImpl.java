package com.paymoon.basic.dao.impl;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.paymoon.basic.dao.IInputDAO;
/**
 * 实现一般录入的常用方法
 * @author lzq
 *
 * @param <T>
 */
@Scope("prototype")
@Component
public abstract class InputDAOImpl<T> extends GenericHibernateDao<T> implements
		IInputDAO<T> {


	@Override
	public List<T> getList(int rowStartIdx, int rowTotal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getPageTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasPrivilege(String OperateId, String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> avertRedundList(String original) {
		// TODO Auto-generated method stub
		return null;
	}
}