import java.util.Scanner;
import java.util.Random;

public class dice{
    public static void main(String areas[]){
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name?");
	String userName = scanner.nextLine();
	System.out.println("Hello, " + userName + "!");
	System.out.println("Rolling dice...");
        Random ranNum = new Random();
	int randomNumber = 0;
	int total = 0;
	for(int i = 1; i <= 2; i++){
	    System.out.print("Dice "+ i +": ");
	    randomNumber = ranNum.nextInt(6) + 1;
	    total = total + randomNumber;
	    System.out.println(randomNumber);
	}
	System.out.println("Total value: "+ total);
	if(total>7) System.out.println("won!");
	else System.out.println("lost!");
    }
}

	    
	   
	    
