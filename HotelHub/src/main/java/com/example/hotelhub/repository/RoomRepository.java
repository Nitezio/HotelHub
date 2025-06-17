package com.example.hotelhub.repository;

import com.example.hotelhub.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
