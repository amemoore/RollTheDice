package rtd;

public class PairOfDice {
	
	private int sum = 0;
	private int valueOne = 0;
	private int valueTwo = 0;
	private int sides = 0;
	
	public PairOfDice(){
	}
	
	public PairOfDice(int valueOneIn, int valueTwoIn, int sumIn){
		valueOne = valueOneIn;
		valueTwo = valueTwoIn;
		sum = sumIn;
	}
	
	public int getSum() {
		return sum;
	}
	public int getValueOne() {
		return valueOne;
	}
	public int getValueTwo() {
		return valueTwo;
	}
	public int getSides() {
		return sides;
	}
}
