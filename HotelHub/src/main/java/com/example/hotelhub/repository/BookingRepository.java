package com.example.hotelhub.repository;

import com.example.hotelhub.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}