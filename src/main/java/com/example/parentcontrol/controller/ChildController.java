package com.example.parentcontrol.controller;


import com.example.parentcontrol.entity.DevicePairing;
import com.example.parentcontrol.entity.User;
import com.example.parentcontrol.model.DeviceInfoRequest;
import com.example.parentcontrol.model.DeviceRegistrationRequest;
import com.example.parentcontrol.model.PairRequest;
import com.example.parentcontrol.repository.DevicePairingRepository;
import com.example.parentcontrol.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/device")
public class ChildController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DevicePairingRepository devicePairingRepository;

    @PostMapping("/register")
    public ResponseEntity<?> registerDevice(@RequestBody DeviceRegistrationRequest request) {
        System.out.println("📱 دستگاه جدید ثبت نام کرد:");
        System.out.println("   Device ID: " +  request.getDeviceId());
        System.out.println("   Child Name: " + request.getChildName());
        System.out.println("   Device Model: " +  request.getDeviceName());

        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "دستگاه با موفقیت ثبت شد");
        response.put("code", 200);

        // برگردوندن یه توکن تستی
        return ResponseEntity.ok()
                .header("Authorization", "Bearer test-token-12345")
                .body(response);
    }


    // ۱. گرفتن کد یکتا برای دستگاه فرزند
    @PostMapping("/generate-code")
    public ResponseEntity<?> generateDeviceCode(@RequestBody DeviceInfoRequest request) {
        String uniqueCode = generateRandomCode(); // مثلاً "A7F3B9"

        // ذخیره در دیتابیس با status = UNPAIRED
        DevicePairing pairing = new DevicePairing();
        pairing.setDeviceUniqueCode(uniqueCode);
        pairing.setDeviceId(request.getDeviceId());
        pairing.setCreatedAt(LocalDateTime.now());
        pairing.setPaired(false);

        devicePairingRepository.save(pairing);

//        return ResponseEntity.ok(new CodeResponse(uniqueCode));
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "successfully generate code ");
        response.put("code", 200);
        return ResponseEntity.ok().body(response);
    }

    // ۲. جفت کردن توسط والد
    @PostMapping("/pair")
    public ResponseEntity<?> pairDevice(@RequestBody PairRequest request) {
        // request شامل: parentId, deviceUniqueCode

        DevicePairing pairing = devicePairingRepository
                .findByDeviceUniqueCodeAndPairedFalse(request.getDeviceUniqueCode())
                .orElseThrow(() -> new RuntimeException("کد نامعتبر است"));

        // پیدا کردن والد
        User parent = userRepository.findById(request.getParentId()).get();

        // جفت کردن
        pairing.setParent(parent);
        pairing.setPaired(true);
        pairing.setPairedAt(LocalDateTime.now());
        devicePairingRepository.save(pairing);

//        return ResponseEntity.ok(new PairResponse("دستگاه با موفقیت متصل شد"));
        Map<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("message", "successfully pair device ");
        response.put("code", 200);
        return ResponseEntity.ok().body(response);
    }

    private String generateRandomCode() {
        // ۶ کاراکتر تصادفی: اعداد و حروف بزرگ
        String chars = "ABCDEFGHJKLMNPQRSTUVWXYZ23456789";
        StringBuilder code = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            code.append(chars.charAt(rnd.nextInt(chars.length())));
        }
        return code.toString();
    }

}
