import java.util.Scanner;

class SI{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter Principal");
	float P = input.nextFloat();

	System.out.println("Enter Rate");
	float R = input.nextFloat();

    System.out.println("Enter Time");
	float T = input.nextFloat();

	 
	float SI=(P*T*R)/100;
	System.out.println("The Standard interest is"+ SI);

	input.close();
	}
	
}