package com.example.hotelhub.service;

import com.example.hotelhub.model.Room;
import java.util.List;

public interface RoomService {
    List<Room> findAll();
    Room save(Room room);
    Room findById(Long id);
}
