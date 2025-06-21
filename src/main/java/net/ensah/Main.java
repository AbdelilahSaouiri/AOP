package net.ensah;

import net.ensah.utils.Calculate;
import net.ensah.utils.Opertaion;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main Method");
        Calculate calculate=new Calculate(4,5);
        calculate.calculate(Opertaion.MULTIPLICATION);

    }
}