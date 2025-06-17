package com.example.hotelhub.service;

import com.example.hotelhub.model.Room;
import com.example.hotelhub.repository.RoomRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }
    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }
    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

}