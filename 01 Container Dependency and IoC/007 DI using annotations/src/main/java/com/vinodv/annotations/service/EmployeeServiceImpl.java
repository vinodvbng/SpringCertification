package com.vinodv.annotations.service;

import com.vinodv.annotations.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void listEmployees() {
        System.out.println(employeeDAO.findAll());
    }

}
