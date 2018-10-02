package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*119;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		int d4 = d3/20;
		return d4 + 1;                     // 1-6
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(roll() + " ");

		}
	}
}
