package com.pavan.service;

import java.util.List;
import java.util.Map;

import com.pavan.dao.IEmployeeDao;

public class EmployeeMgmtServiceImpl implements IEmployeeMangementService {

	private IEmployeeDao dao;
	
	public EmployeeMgmtServiceImpl(IEmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public int fetchEmpsCount() {
		return dao.getEmpsCount();
	}

	@Override
	public String getEmployeeNameByNo(int eno) {
		return null;
	}

	@Override
	public Map<String, Object> getEmployeeDetailsByNo(int eno) {
		return null;
	}

	@Override
	public List<Map<String, Object>> getEmployeeDeatilsByDesignation(String desg1, String desg2) {
		return null;
	}

	@Override
	public int insertEmp(String ename, int eage, String eaddress, String desg, int salary) {
		return 0;
	}

	@Override
	public int addBonusToEmpByDesg(String desg, int bonus) {
		return 0;
	}

}
