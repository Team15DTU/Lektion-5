/**
 *
 */

package terning;

public class Dice {

	/*
	////////////////////////// Fields //////////////////////////
	 */

	// Statistic counters
    int totalRolls;

	/*
	////////////////////////// Constructors //////////////////////////
	 */

    /**
     * Primary Constructor
     */
	public Dice () {
	    // Initialize variables
	    totalRolls = 0;
    }

	/*
	////////////////////////// Properties //////////////////////////
	 */

	/*
	////////////////////////// Public Methods //////////////////////////
	 */
	/**
	 * roll the die and return the value (1-6)
	 * @return
	 */
	public int roll() {
	    // Roll logic
		float d1=(float)Math.random();     // 0-1
		float d2=d1*119;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		int d4 = d3/20;

		// Update statistic counter

        // Return the random value + 1
		return d4 + 1;                     // 1-6
	}

	/**
	 * roll the die n times and print the values
	 * @param n
	 */
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(roll() + " ");

		}
	}

	/*
	////////////////////////// Support Methods //////////////////////////
	 */

    /**
     * This method increases the counter "totalRolls"
     */
	private void increaseRollCount () {
	    // Add 1 to totalRolls
        totalRolls++;
    }
}
