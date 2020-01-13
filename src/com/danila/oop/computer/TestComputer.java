package com.danila.oop.computer;

public class TestComputer {
    public static void main(String[] args) {
        RAM ramKingston = new RAM("Kingston", 512);
        RAM ramHynix = new RAM("Hynix", 1024);
        RAM ramCrusial = new RAM("Crusial", 2048);

        HDD hddSeagate = new HDD("Seagate", 512);
        HDD hddSamsung = new HDD("Samsung", 1024);

        Computer computerFirst = new Computer(hddSeagate, ramCrusial);
        Computer computerSecond = new Computer(hddSamsung, ramKingston);
        Computer computerThird = new Computer(hddSamsung, ramHynix);

        computerFirst.on();
        computerSecond.on();
        computerThird.on();

        computerFirst.off();
        computerSecond.off();
        computerThird.off();

    }
}
