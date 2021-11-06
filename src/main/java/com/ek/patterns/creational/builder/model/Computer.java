package com.ek.patterns.creational.builder.model;

import com.ek.patterns.creational.builder.model.common.*;
import lombok.Setter;
import lombok.ToString;

// setter is used to update existing object.
@Setter
@ToString
public class Computer {

    private Cpu cpu;
    private MotherBoard motherBoard;
    private Memory memory;
    private VideoCard videoCard;
    private Case aCase;
    private PowerSupply powerSupply;
    private Storage storage;

    private Computer(Cpu cpu, MotherBoard motherBoard, Memory memory, VideoCard videoCard, Case aCase, PowerSupply powerSupply, Storage storage) {
        this.cpu = cpu;
        this.motherBoard = motherBoard;
        this.memory = memory;
        this.videoCard = videoCard;
        this.aCase = aCase;
        this.powerSupply = powerSupply;
        this.storage = storage;
    }

    public static Builder builder() {
        return new Builder();
    }




    public static class Builder {

        private String cpu;
        private String motherBoard;
        private String memory;
        private String videoCard;
        private String aCase;
        private String powerSupply;
        private String storage;

        public Builder cpu(String cpuValue) {
            this.cpu = cpuValue;
            return this;
        }

        public Builder motherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder videoCard(String videoCard) {
            this.videoCard = videoCard;
            return this;
        }

        public Builder aCase(String aCase) {
            this.aCase = aCase;
            return this;
        }

        public Builder powerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(
                    new Cpu(this.cpu),
                    new MotherBoard(this.motherBoard),
                    new Memory(this.memory),
                    new VideoCard(this.videoCard),
                    new Case(this.aCase),
                    new PowerSupply(this.powerSupply),
                    new Storage(this.storage));
        }
    }
}
