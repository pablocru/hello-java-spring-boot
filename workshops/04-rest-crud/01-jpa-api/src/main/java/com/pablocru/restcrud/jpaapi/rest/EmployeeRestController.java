package com.pablocru.restcrud.jpaapi.rest;

import com.pablocru.restcrud.jpaapi.entity.Employee;
import com.pablocru.restcrud.jpaapi.service.EmployeeService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    // ATTRIBUTES

    private EmployeeService employeeService;

    // CONSTRUCTORS

    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // METHODS

    @GetMapping("")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        return employeeService.findById(employeeId);
    }

    @PostMapping("")
    public Employee postEmployee(@RequestBody Employee theEmployee) {
        /*
         * Just in case they pass an id in JSON, set id to 0.
         * This is to force a save instead of update.
         */
        theEmployee.setId(0);

        return employeeService.save(theEmployee);
    }

    @PutMapping("/{employeeId}")
    public Employee putEmployee(
            @PathVariable int employeeId,
            @RequestBody Employee theEmployee) {
        /*
         * To ensure that the target employee is the expected.
         * This is to force a update instead of a save.
         */
        theEmployee.setId(employeeId);

        return employeeService.save(theEmployee);
    }

    @DeleteMapping("/{employeeId}")
    public Employee deleteEmployee(@PathVariable int employeeId) {
        return employeeService.deleteById(employeeId);
    }

}
