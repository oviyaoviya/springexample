package controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
	private static final Logger logger = Logger.getAnonymousLogger();
	@Autowired
	EmployeeDao employeeDao;

	@RequestMapping("/index")
	public String showform() {
		return "index";
	}

	@RequestMapping("/employeeForm")
	public String showForm() {
		return "employeeForm";
	}

	@RequestMapping("/success")
	public String showFormDetail() {
		return "success";
	}

	@InitBinder
	public void iProblemsnitBinder(WebDataBinder binder) {
		System.out.println("Loading init binder...");
		binder.registerCustomEditor(Timestamp.class, new CustomDateEditor(
				new SimpleDateFormat("yyyy-MM-dd"), true, 10));
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Emp emp, HttpSession session,
			ModelMap modelMap, Model m) {

		String email = emp.getEmail();
		logger.info("coming into controller...");
		Emp employee = employeeDao.getEmpByEmail(email);
		logger.info("Employee details " + employee);
		if (employee == null) {
			modelMap.put("email", emp.getEmail());
			System.out.println("before view details :"+emp);
			employeeDao.save(emp);
			return "employeeList";
		} else {
			// modelMap.put("error", "Invalid Account");
			m.addAttribute("employee", emp);
			modelMap.put("error", emp.getEmail()+" email is already exist");
			logger.info("already exist");
			return "employeeForm";
		}
	}

	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m) {
		Emp emp = employeeDao.getEmpById(id);
		logger.info("print Edit Values:" + emp.toString());
		m.addAttribute("employee", emp);
		return "empeditform";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("emp") Emp emp) {
		logger.info("print Editsave Values:" + emp.toString());
		employeeDao.update(emp);
		return "redirect:/employeeList";
	}

	@RequestMapping(value = "/deleteemp/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		employeeDao.delete(id);
		return "redirect:/employeeList";
	}

	@RequestMapping(value = "/viewemp/{id}")
	public String view(@PathVariable int id, Model m) {
		Emp emp = employeeDao.getEmpById(id);
		logger.info("print view Values:" + emp.toString());
		m.addAttribute("employee", emp);
		return "viewEmployeeDetails";
	}

	@RequestMapping("/login")
	public String showForm2() {
		return "login";
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginDetails(@RequestParam("email") String email,
			@RequestParam("password") String password, HttpSession session,
			ModelMap modelMap) {
		Emp emp = employeeDao.employeeLogin(email, password);
		// logger.info("employee details:" + emp);
		// logger.info("employee email"+emp.getEmail());

		if (emp != null) {
			modelMap.put("email", emp.getEmail());
			return "success";
		} else {
			modelMap.put("error", "Invalid Account");
			return "login";
		}
	}
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("email");
		return "login";
	}

	@RequestMapping("/viewEmployee")
	public String viewemp(Model m) {
		/* System.out.println("view Employee Details"); */
		List<Emp> list = employeeDao.getEmployees();
		/* System.out.println("total number of employees:"+list.size()); */
		m.addAttribute("list", list);
		return "employeeList";
	}

}

/*
 * @RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
 * public String loginSubmit(@ModelAttribute("emp") Emp emp) {
 * System.out.println("print name:" + emp.toString());
 * employeeDao.save(emp); return "redirect:viewEmployee"; }
 */

/*
 * if(email.equalsIgnoreCase("oviya") && password.equalsIgnoreCase("123")) {
 * session.setAttribute("email", email); return "success"; } else {
 * modelMap.put("error", "Invalid Account"); return "login"; } }
 */