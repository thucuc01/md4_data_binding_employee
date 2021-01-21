package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmployeeController {
    @GetMapping("/home")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }
    @PostMapping("/addEmployee")
    public String submitEmployee(@ModelAttribute("employee") Employee employee,Model model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactNumber",employee.getContactNumber());
        model.addAttribute("id",employee.getId());
        return "info";
    }


}
