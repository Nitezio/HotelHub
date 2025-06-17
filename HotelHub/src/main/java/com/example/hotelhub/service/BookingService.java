package com.example.hotelhub.service;

import com.example.hotelhub.model.Booking;
import java.util.List;

public interface BookingService {
    List<Booking> findAll();
    Booking save(Booking booking);
    Booking findById(Long id);
}
