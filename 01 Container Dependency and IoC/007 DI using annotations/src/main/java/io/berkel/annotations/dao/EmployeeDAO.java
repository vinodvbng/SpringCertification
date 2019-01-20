package com.vinodv.annotations.dao;

import com.vinodv.annotations.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
