package com.reservation_system.roomService.Repositories;

import com.reservation_system.roomService.Entities.Room;
import com.reservation_system.roomService.Entities.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<com.reservation_system.roomService.Entities.Room, Long> {

    List<Room> findByType(RoomType type);

    List<Room> findByCapacityGreaterThanEqual(Integer capacity);

    Optional<Room> findByName(String name);

    List<Room> findByCreatedByUserId(Long userId);
}