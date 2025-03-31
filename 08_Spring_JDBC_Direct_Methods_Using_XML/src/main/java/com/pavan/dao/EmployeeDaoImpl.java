package com.pavan.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String SQL_SELECT_QUERY = "SELECT COUNT(*) FROM STUDENT";
	
	
	private JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	public EmployeeDaoImpl() {
	}



	@Override
	public int getEmpsCount() {
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY, Integer.class);
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
