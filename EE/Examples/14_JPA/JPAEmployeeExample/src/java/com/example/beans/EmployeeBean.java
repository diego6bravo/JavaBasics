/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.beans;

import com.example.entity.Employee;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.ejb.EJBException;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

@Named(value = "eBean")
@RequestScoped
public class EmployeeBean implements Serializable {

    @Inject
    private EmployeeEJB ejb;
    @Inject
    private BirthdateBean birthBean;
    private int id;
    private String first;
    private String last;
    private Date birthDate;
    private float salary;

    public EmployeeBean() {
    }

    public String addEmployee() {
        birthDate = birthBean.getDate();
        Employee emp = new Employee(id, first, last, birthDate, salary);
        try {
            ejb.addEmployee(emp);
        } catch (EJBException ex) {
            Throwable t = ex;
            List<String> cause = new ArrayList<>();
            boolean constraintViolation = false;
            while ((t = t.getCause()) != null) {
                if (t instanceof ConstraintViolationException) {
                    constraintViolation = true;
                    ConstraintViolationException cv = (ConstraintViolationException) t;
                    Set<ConstraintViolation<?>> violations = cv.getConstraintViolations();
                    for (ConstraintViolation violation : violations) {
                        cause.add(violation.getMessage());
                        System.out.println(violation.getMessage());
                    }
                }
            }
            for (String s : cause) {
                FacesContext.getCurrentInstance().addMessage("addForm:add", new FacesMessage(s));
            }
            return null;
        } catch (EmployeeException e) {
            FacesContext.getCurrentInstance().addMessage("addForm:add", new FacesMessage(e.getMessage()));
            return null;
        }
        return "index";
    }

    public String deleteEmployee(int id) {
        try {
            ejb.deleteEmployee(id);
        } catch (EmployeeException e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(e.getMessage()));
        }
        return "index";
    }

    public String updateEmployee() {
        birthDate = birthBean.getDate();
        Employee emp = new Employee(id, first, last, birthDate, salary);
        ejb.updateEmployee(emp);
        return "index";
    }

    public List<Employee> getAllEmployees() {
        return ejb.getAllEmployees();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        Employee emp = ejb.findEmployee(id);
        if (emp != null) {
            this.first = emp.getFirstName();
            this.last = emp.getLastName();
            this.birthDate = emp.getBirthDate();
            this.salary = emp.getSalary();
        }

    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getBirthDate() {
        return DateFormat.getDateInstance().format(birthDate).toString();
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
