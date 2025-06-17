package com.example.hotelhub.controller;

import com.example.hotelhub.model.Package;
import com.example.hotelhub.service.PackageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StaffController {
    private final PackageService packageService;

    public StaffController(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping("/staff/packages")
    public String viewPackages(Model model) {
        model.addAttribute("packages", packageService.findAll());
        return "staff_dashboard"; // Ensure this matches your staff_dashboard.html file
    }

    @PostMapping("/staff/packages/new")
    public String addPackage(Package hotelPackage) {
        packageService.save(hotelPackage);
        return "redirect:/staff/packages"; // Redirect to the packages view after adding
    }
}
