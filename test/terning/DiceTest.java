package terning;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class DiceTest {

    Dice Dtest = new Dice();

    @org.junit.Test
    public void roll() {

        // Bestem antal slag
        int antal = 6000000;

        // Define amount of allowable deviation
        int upperBound = (int) ( (antal / 6) * 1.04 );  // Allows roughly 4% deviation in the upperBound
        int lowerBound = (int) ( (antal / 6) *  0.96 ); // Allows roughly 4% deviation in the lowerBound

        // Create array to count the occurrences of values
        int[] rollArray = new int[6];


        for (int i=0; i<antal; i++) { // kører en løkke hvori, der en counter

            /*
            --------------------------------------------------------------------------------
            Slå med terningen "antal" gange og opdatér "rollArray" hvert loop
            */
            int roll = Dtest.roll();
            rollArray[roll-1]=rollArray[roll-1]+1;      // Update "rollArray"
            /*
            --------------------------------------------------------------------------------
             */

            /*
            --------------------------------------------------------------------------------
            Tests
            */
            // Tjek at værdierne holder sig mellem 1 og 6 inklusiv
            assertTrue(roll<7 && roll>0);
            /*
            --------------------------------------------------------------------------------
             */
        }

        /*
        --------------------------------------------------------------------------------
        Looper igennem hvert array element og tester
        om værdien holder sig indenfor 4%.
        */
        for (int j : rollArray) {
            System.out.println(j);      // Printer hvert elements værdi i rollArray
            assertTrue(j <= upperBound && j >= lowerBound);    // Tjekker om værdien ligger indenfor en afvigelse på 400
        }
        /*
        --------------------------------------------------------------------------------
        */
    }

    @org.junit.Test
    public void getTotalRolls() {
        // Antal slag med terning
        int antal = 20;

        // Slå "antal" gange
        for ( int i=0 ; i < antal ; i++ ) {
            Dtest.roll();
        }

        // Test
        assertEquals(antal, Dtest.getTotalRolls());
    }

    @org.junit.Test
    public void rollMultiple() {
    }
}