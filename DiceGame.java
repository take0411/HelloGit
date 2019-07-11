import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
	int d1,d2,d3;
	Random r=new Random();

	System.out.println("What is your name?");
	Scanner scan=new Scanner(System.in);
	String name=scan.nextLine();
	System.out.println("Hello, "+name+"!");
	scan.close();

	d1=r.nextInt(6)+1;
	d2=r.nextInt(6)+1;
	d3=r.nextInt(6)+1;

        System.out.println("Rolling the dice...");

        System.out.println("Die 1:"+d1);
        System.out.println("Die 2:"+d2);
	System.out.println("Die 3:"+d3);
        System.out.println("Total value:"+(d1+d2+d3));

	if((d1+d2+d3)>10) System.out.println(name+" won!");
	else System.out.println(name+" lost!");

    }
}