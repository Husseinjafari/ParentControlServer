package com.example.parentcontrol.repository;

import com.example.parentcontrol.entity.DevicePairing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DevicePairingRepository extends JpaRepository<DevicePairing, Long> {

    Optional<DevicePairing> findByDeviceUniqueCodeAndPairedFalse(String deviceUniqueCode);

}

