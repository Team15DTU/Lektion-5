package terning;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class DiceTest {

    Dice Dtest = new Dice();

    @org.junit.Test
    public void roll() {


        int antal = 60000; // Beder den slå 60000
        for (int i=0; i<antal; i++) { // kører en løkke hvori, der en counter

            int roll = Dtest.roll();
            assertTrue(roll<7 && roll>0); //de forhold som skal til for at den består
        }

        int[] rollArray = new int[6];
        for (int i=0; i<antal; i++){
            int roll = Dtest.roll();
            rollArray[roll-1]=rollArray[roll-1]+1;
        }

        /*
        Looper igennem hvert array element og tester
        om værdien er mellem 9600 og 10400.
        */
        for (int i : rollArray) {
            System.out.println(i);      // Printer hvert elements værdi i rollArray
            assertTrue(i <= 10400 && i >= 9600);    // Tjekker om værdien ligger indenfor en afvigelse på 400
        }

    }

    @org.junit.Test
    public void rollMultiple() {
    }
}