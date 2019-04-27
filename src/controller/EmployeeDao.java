package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		Date releavingDate = p.getRelievingDate();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		  String utilDate = formatter.format(releavingDate);
		System.out.println("utilDate in dao class is:-" + utilDate);
	
		String sql = "insert into EmployeeDetails(name,dob,joiningDate,relievingDate,designation,addressLine1,addressLine2,city,state,pincode,gender,skill,mobile,email,password,description) values('"
				+ p.getName()
				+ "','"
				+ p.getDob()
				+ "','"
				+ p.getJoiningDate()
				+ "','"
				+ utilDate 
				+ "','"
				+ p.getDesignation()
				+ "','"
				+ p.getAddressLine1()
				+ "','"
				+ p.getAddressLine2()
				+ "','"
				+ p.getCity()
				+ "','"
				+ p.getState()
				+ "','"
				+ p.getPincode()
				+ "','"
				+ p.getGender()
				+ "','"+ p.getSkill()+ "','"
				+ p.getMobile()
				+ "','"
				+ p.getEmail()
				+ "','"
				+ p.getPassword()
				+ "','"
				+ p.getDescription() + "')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update EmployeeDetails set  name='" + p.getName()
				+ "', dob='" + p.getDob() + "',joiningDate='"
				+ p.getJoiningDate() + "',relievingDate='"
				+ p.getRelievingDate()+ "',designation='" + p.getDesignation()
				+ "',addressline1='" + p.getAddressLine1() + "',addressline2='"
				+ p.getAddressLine2() + "',city='" + p.getCity() + "',state='"
				+ p.getState() + "',pincode='" + p.getPincode() + "',gender='"
				+ p.getGender() + "',skill='" + p.getSkill() + "',mobile='"
				+ p.getMobile() + "',email='" + p.getEmail() + "',password='"
				+ p.getPassword() + "',description='" + p.getDescription()
				+ "'  where id=" + p.getId() + "";
		return template.update(sql);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from EmployeeDetails where id=?";
		return template.queryForObject(sql, new Object[] { id },
				new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public int delete(int id) {
		String sql = "delete from EmployeeDetails where id=" + id + "";
		return template.update(sql);
	}

	public Emp employeeLogin(String email, String password) {
		System.out.println("email" + email);
		System.out.println("password" + password);
		String sql = "select * from EmployeeDetails where email = ? and password = ?";
		System.out.println("employee login" + sql);
		Emp emp = null;
		try {
			emp = template.queryForObject(sql,
					new Object[] { email, password },
					new BeanPropertyRowMapper<Emp>(Emp.class));
		} catch (EmptyResultDataAccessException e) {
			System.out.println("No result found");
		}
		System.out.println("The employee details after successful login:- "
				+ emp);
		return emp;
	}

	public List<Emp> getEmployees() {
		return template.query("select * from EmployeeDetails",
				new RowMapper<Emp>() {
					public Emp mapRow(ResultSet rs, int row)
							throws SQLException {
						Emp e = new Emp();
						e.setId(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setDob(rs.getString(3));
//						e.setRelievingDate(rs.getDate(4));
//				        e.setRelievingDate(rs.getString(4));
//						e.setRelievingDate(rs.getDate(4));
						//	System.out.println(rs.getDate(4));
						System.out.println(rs.getString(4));
						// System.out.println(rs.getString(3));
						e.setJoiningDate(rs.getString(5));
						e.setDesignation(rs.getString(6));
						e.setAddressLine1(rs.getString(7));
						e.setAddressLine2(rs.getString(8));
						e.setCity(rs.getString(9));
						e.setState(rs.getString(10));
						e.setPincode(rs.getInt(11));
						e.setGender(GenderType.valueOf(rs.getString(12)));
						e.setSkill(rs.getString(13));
						e.setMobile(rs.getString(14));
						e.setEmail(rs.getString(15));
						e.setPassword(rs.getString(16));
						e.setDescription(rs.getString(17));
						return e;
					}
				});
	}
}
