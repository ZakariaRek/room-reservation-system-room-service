package com.reservation_system.roomService.Repositories;

import com.reservation_system.roomService.Entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    List<Equipment> findByRoomId(Long roomId);

    List<Equipment> findByNameContaining(String keyword);
}