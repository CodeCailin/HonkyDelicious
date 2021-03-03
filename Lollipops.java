import java.util.*;

public class Lollipops{
public static void main (String [] args){

	System.out.println("Hello");


	final double LOLLYCOST;
	final double ICECREAMCOST;
	final double CRISPSCOST;
	int lollyAmount;
	int icecreamAmount;
	int crispsAmount;
	double totalCost;



	//
	LOLLYCOST=1.22;
	ICECREAMCOST=1.50;
	CRISPSCOST=2.00;
	lollyAmount=0;
	icecreamAmount=0;
	crispsAmount=0;
	totalCost=0;

	//Object Declare, then assign

	Scanner keyboard;
	keyboard = new Scanner(System.in);

	System.out.println("How many lollypops do you want");
	lollyAmount = keyboard.nextInt();

	System.out.println("How many icecreams do you want");
	icecreamAmount = keyboard.nextInt();


	System.out.println("How many crisps do you want");
	crispsAmount = keyboard.nextInt();

	//Process

	totalCost = (LOLLYCOST * lollyAmount  ) + ( ICECREAMCOST * icecreamAmount) + (CRISPSCOST * crispsAmount);

	System.out.println("The total of your shopping is:" + totalCost);


}




}