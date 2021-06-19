package com.example.demo;

import com.example.demo.entity.Info;
import com.example.demo.repository.InfoRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class DataLoader implements ApplicationRunner {

    private final InfoRepository infoRepository;

    public void run(ApplicationArguments args) throws Exception {
        Info info = new Info();
        info.setInfo("test1");
        for (int i = 0; i < 1000; i++) {
            Info info1 = new Info();
            info1.setInfo("info - " + i);
            infoRepository.save(info1);
        }
    }
}
