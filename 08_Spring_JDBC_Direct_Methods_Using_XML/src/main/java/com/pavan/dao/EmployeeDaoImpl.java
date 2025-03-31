package com.pavan.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String SQL_SELECT_QUERY = "SELECT COUNT(*) FROM EMPLOYEE";


	private static final String SELECT_NAME_BY_ID = "SELECT ENAME FROM EMPLOYEE WHERE EID = ?";


	private static final String GET_EMPLOYEE_DETAILS_BY_ID 	= "SELECT EID, ENAME, Eaddress, ESALARY FROM EMPLOYEE WHERE EID = ? ";


	private static final String GET_EMPLOYEES_BY_ADDRESS 	= "SELECT EID, ENAME, EADDRESS, ESALARY FROM EMPLOYEE WHERE EAddress IN (?,?)";
	
	
	private JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

	


	@Override
	public int getEmpsCount() {
		return jdbcTemplate.queryForObject(SQL_SELECT_QUERY, Integer.class);
	}

	@Override
	public String getEmployeeNameByNo(int eno) {
		return jdbcTemplate.queryForObject(SELECT_NAME_BY_ID, String.class, eno);
	}

	@Override
	public Map<String, Object> getEmployeeDetailsByNo(int eno) {
		Map<String, Object> map = jdbcTemplate.queryForMap(GET_EMPLOYEE_DETAILS_BY_ID, eno);
		return map;
	}

	@Override
	public List<Map<String, Object>> getEmployeeDeatilsByAddress(String addr1, String addr2) {
		List<Map<String, Object>> list = jdbcTemplate.queryForList(GET_EMPLOYEES_BY_ADDRESS, addr1, addr2);
		return list;
	}

	@Override
	public int insertEmp(String ename, String eaddress,int salary) {
		return 0;
	}

	@Override
	public int addBonusToEmpByAddress(String desg, int bonus) {
		return 0;
	}

}
