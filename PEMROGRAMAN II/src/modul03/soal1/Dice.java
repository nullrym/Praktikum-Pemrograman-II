package modul03.soal1;

import java.util.Random;

public class Dice {
    private int number;

    public Dice() {
        this.number = this.rollNumber();
    }

    public int getNumber() {
        return number;
    }
    private int rollNumber() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
