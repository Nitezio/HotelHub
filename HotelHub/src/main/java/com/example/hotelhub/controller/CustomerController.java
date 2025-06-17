package com.example.hotelhub.controller;

import com.example.hotelhub.model.Customer;
import com.example.hotelhub.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "registration"; // Ensure this matches your registration.html file
    }

    @PostMapping("/signup")
    public String registerCustomer(Customer customer) {
        customerService.save(customer);
        return "redirect:/login"; // Redirect to login after sign up
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Ensure this matches your login.html file
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // Ensure this matches your about.html file
    }

    // Remove this method to avoid conflict
    // @GetMapping("/booking")
    // public String showBookingPage() {
    //     return "booking"; // This is causing the conflict
    // }
}
