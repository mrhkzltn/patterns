package com.ek.patterns.creational.builder.driver;

import com.ek.patterns.creational.builder.model.Computer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BuilderPatternDriver {


    public void run() {
        Computer computer = Computer.builder()
                .cpu("cpu")
                .powerSupply("700WSupply")
                .videoCard("6gbGPU")
                .aCase("aCase")
                .memory("memory")
                .videoCard("videoCard")
                .build();

        log.info(computer.toString());

    }
}
