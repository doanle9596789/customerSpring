package com.doan.service;

import com.doan.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllCustomer();
    public void createCustomer( Customer customer);
    public void updateCustomer(Customer customer,int id);


    public void deleteCustomer(int id);
    public Customer findById(int id);
    void save(Customer customer);
}
