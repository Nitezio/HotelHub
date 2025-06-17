package com.example.hotelhub.controller;

import com.example.hotelhub.model.Booking;
import com.example.hotelhub.service.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/booking")
    public String showBookingForm(Model model) {
        model.addAttribute("booking", new Booking());
        return "booking"; // This will return the booking.html template
    }

    @PostMapping("/booking")
    public String bookRoom(Booking booking) {
        bookingService.save(booking);
        return "redirect:/customer/dashboard"; // Redirect to the customer dashboard after booking
    }
}
