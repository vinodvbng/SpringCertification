package com.vinodv.componentscanning.service;

import com.vinodv.componentscanning.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService") // It can be @Component as well
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public void printCustomers() {
        System.out.println(customerDAO.findAll());
    }

}
