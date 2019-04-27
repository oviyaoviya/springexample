package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {
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

	/*
	 * @RequestMapping("/viewEmployee") public String Form(){ return
	 * "viewEmployee"; }
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("emp") Emp emp) {
		System.out.println("print name:" + emp.toString());
		System.out.println("Date is :" +emp.getRelievingDate());
		employeeDao.save(emp);
		return "redirect:viewEmployee";
	}

	@RequestMapping(value = "/editemp/{id}")
	public String edit(@PathVariable int id, Model m) {
		Emp emp = employeeDao.getEmpById(id);
		System.out.println("print Edit Values:" + emp.toString());
		m.addAttribute("employee", emp);
		return "empeditform";
	}

	@RequestMapping(value = "/editsave", method = RequestMethod.POST)
	public String editsave(@ModelAttribute("emp") Emp emp) {
		System.out.println("print Editsave Values:" + emp.toString());
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
		System.out.println("print view Values:" + emp.toString());
		m.addAttribute("employee", emp);
		return "viewEmployeeDetails";
	}
	@RequestMapping("/login")
	public String showForm2() {
		return "login";
	}

	/*
	 * @RequestMapping(value = "/loginSubmit", method = RequestMethod.POST)
	 * public String loginSubmit(@ModelAttribute("emp") Emp emp) {
	 * System.out.println("print name:" + emp.toString());
	 * employeeDao.save(emp); return "redirect:viewEmployee"; }
	 */

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public String loginDetails(@RequestParam("email") String email,
			@RequestParam("password") String password, HttpSession session,
			ModelMap modelMap) {
		Emp emp = employeeDao.employeeLogin(email, password);
		System.out.println("employee details:" + emp);
		System.out.println("employee email"+emp.getEmail());

		if (emp != null) {
			modelMap.put("email", emp.getEmail());
			return "success";
		} else {
			modelMap.put("error", "Invalid Account");
			return "login";
		}
	}

	/*
	 * if(email.equalsIgnoreCase("oviya") && password.equalsIgnoreCase("123")) {
	 * session.setAttribute("email", email); return "success"; } else {
	 * modelMap.put("error", "Invalid Account"); return "login"; } }
	 */

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
