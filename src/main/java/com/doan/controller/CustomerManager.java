package com.doan.controller;

import com.doan.model.Customer;
import com.doan.service.CustomerIpl;
import com.doan.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
    @RequestMapping("/customer")
    public class CustomerManager{
    private final CustomerService customerService=new CustomerIpl();
    @GetMapping("")
    public String index(Model model){
        List<Customer>list=customerService.findAllCustomer();
        model.addAttribute("customers",list);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        return "redirect:/customer";
    }
}


