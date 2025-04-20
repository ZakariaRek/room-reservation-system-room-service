package com.reservation_system.roomService.services;


import com.reservation_system.roomService.models.Room;
import com.reservation_system.roomService.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Long id, Room roomDetails) {
        return roomRepository.findById(id).map(room -> {
            room.setName(roomDetails.getName());
            room.setCapacity(roomDetails.getCapacity());
            room.setType(roomDetails.getType());
            room.setEquipments(roomDetails.getEquipments());
            return roomRepository.save(room);
        }).orElse(null);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
