package com.vinodv.componentscanning.dao;

import com.vinodv.componentscanning.model.Customer;

import java.util.List;

public interface CustomerDAO {

    List<Customer> findAll();

}
