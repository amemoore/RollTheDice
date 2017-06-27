package rtd;
import java.util.Scanner;

public class DiceRollerApp {
		private static PairOfDice pairs;
		private static int sides;
		private static Scanner sc;
		
	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller Application!");
		sc = new Scanner(System.in);
		String choice = "y";
		int i = 0;
		while (choice.equalsIgnoreCase("y")){
			sides = Validator.getInt(sc, "How many sides does each die have? ");
			i++;
			System.out.println("Roll " + i + ":");
			pairs = getDicePairValues();
			System.out.println(pairs.getValueOne() + "\n" + pairs.getValueTwo());
			
			if (sides==6){
				if (pairs.getSum()==7){
					System.out.println("Craps!");
				}
				else if (pairs.getValueOne()==1 && pairs.getValueTwo()==1){
					System.out.println("Snake Eyes!");
				}
				else if (pairs.getSum()==12){
					System.out.println("Box Cars!");
				}
			}
			choice = Validator.getString(sc, "Roll again? (y/n)");	
		}
		System.out.println("Bye-Bye!");
	}
		public static PairOfDice getDicePairValues(){
			int firstRoll = 0;
			int secondRoll = 0;
			int sumOfRolls = 0;
			firstRoll = getRoll();
			secondRoll = getRoll();
			sumOfRolls = firstRoll + secondRoll;
			pairs = new PairOfDice(firstRoll, secondRoll, sumOfRolls);
			return pairs;

	}
		public static int getRoll(){
			int roll = 0;
			roll = (int) (Math.random() * sides);
			return roll;
		}
}