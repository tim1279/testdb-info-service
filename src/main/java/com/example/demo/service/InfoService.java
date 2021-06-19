package com.example.demo.service;

import com.example.demo.entity.Info;
import com.example.demo.repository.InfoRepository;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InfoService {
    private final InfoRepository infoRepository;

    @Transactional
    public Info givePromoFor(Long userId) {
        List<Info> infoList =infoRepository.findByUserIdIsNull();
        Info info = infoList.stream().findFirst().get();
        info.setUserId(userId);
        infoRepository.save(info);
        return info;
    }

}