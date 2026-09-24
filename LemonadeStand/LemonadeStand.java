//LemonadeStand.java
import java.util.Scanner;

public class LemonadeStand{
	double cashOnHand;
	// Lemon, Sugar, Ice, Cup
	double[] prices = {1.50, 2.00, 1.00, 1.50};
	int[] amounts = new int[3];
	int[] using = new int[3];
	String[] names = {"Lemons","Sugar","Ice","Cups"};
	
	Scanner lemonscan = new Scanner(System.in);
	
	public void setup() {
			System.out.println("Welcome");
			//instructions
	}
	
	public void buy(){
		for(int i = 1; i <= 4; i++){
			System.out.println("How many " + names[i-1] + " do you want?");
			Number ald = lemonscan.nextDouble();
		}
	}
}
