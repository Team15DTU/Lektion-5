package terning;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class DiceTest {

    Dice Dtest = new Dice();

    @org.junit.Test
    public void roll() {


        int antal = 60000; // Beder den slå 60000

        /*
        Test at værdierne holder sig mellem 1 og 6 inklusiv
         */
        for (int i=0; i<antal; i++) { // kører en løkke hvori, der en counter

            int roll = Dtest.roll();
            assertTrue(roll<7 && roll>0); //de forhold som skal til for at den består

        }

        /*
        Slå med terningen "antal" gange og opdatér "rollArray" hvert loop
         */
        int[] rollArray = new int[6];
        for (int i=0; i<antal; i++){
            int roll = Dtest.roll();
            rollArray[roll-1]=rollArray[roll-1]+1;
        }

        /*
        Looper igennem hvert array element og tester
        om værdien holder sig indenfor 4%.
        */
        int upperBound = (int) ( (antal / 6) * 1.04 );  // Allows roughly 4% deviation in the upperBound
        int lowerBound = (int) ( (antal / 6) *  0.96 ); // Allows roughly 4% deviation in the lowerBound
        for (int i : rollArray) {
            System.out.println(i);      // Printer hvert elements værdi i rollArray
            assertTrue(i <= upperBound && i >= lowerBound);    // Tjekker om værdien ligger indenfor en afvigelse på 400
        }



    }

    @org.junit.Test
    public void rollMultiple() {
    }
}