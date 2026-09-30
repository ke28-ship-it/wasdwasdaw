//LemonadeStand.java
import java.util.Scanner;

public class LemonadeStand{
	double cashOnHand;
	// Lemon, Sugar, Ice, Cup
	double[] prices = {1.50, 2.00, 1.00, 1.50};
	int[] amounts ={0, 0, 0, 0};
	int[] using = {0, 0, 0, 0};
	String[] names = {"lemons","bags of sugar","ice cubes","cups"};
	
	Scanner lemonscan = new Scanner(System.in);
	
	public void dash() {
		for (int dash = 0; dash < 10; dash++) {
			System.out.print("---");
		}
		System.out.println("");
	}
	
	public void setup() {
			System.out.println("WELCOME TO THE STORE");
			LemonadeStand.dash();
			cashOnHand = 20;
			//instructions
	}
	
	public void buy(){
		System.out.println("You have $"+cashOnHand+" to spend\nLemon - $1.50\nBag of sugar - $2.00\nIce Cubes - $1.00\nCups - $1.50");
		for(int i = 1; i <= 4; i++){
			System.out.println("How many " + names[i-1] + " do you want?");
			int amountBought = lemonscan.nextInt();
			amounts[i-1] = amountBought;
			cashOnHand = cashOnHand - (amounts[i-1]*prices[i-1]);
			if(cashOnHand <= 0){
				System.out.println("BANKRUPT!");
				return;}
			System.out.println("You now have " + amounts[i-1] + " " + names[i-1] + "!");
			System.out.println("You now have $" + cashOnHand);
		}
	}
}
