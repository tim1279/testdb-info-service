package com.example.demo.controller;

import com.example.demo.entity.Info;
import com.example.demo.service.InfoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping
public class InfoController {
    private final InfoService infoService;

    @GetMapping("/promo")
    ResponseEntity<Info> get(@RequestParam Long userId) {
        Info info = infoService.givePromoFor(userId);
        return ResponseEntity.ok(info);
    }
}
