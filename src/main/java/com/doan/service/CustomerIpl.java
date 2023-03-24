package com.doan.service;

import com.doan.model.Customer;

import java.util.*;

public class CustomerIpl implements CustomerService{
    private static final Map<Integer, Customer> customers;

    static {

        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }
    @Override
    public List<Customer> findAllCustomer() {
      return new ArrayList<>(customers.values());
    }

    @Override
    public void createCustomer(Customer customer) {
customers.put(customer.getId(),customer);
    }

    @Override
    public void updateCustomer(Customer customer, int id) {
        customers.put(id,customer);
    }

    @Override
    public void deleteCustomer(int id) {
        customers.remove(id);
    }

    @Override
    public Customer findById(int id) {
        customers.get(id);
        return null;
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }
}