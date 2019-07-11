import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
	String name;
	int d1,d2;
	Random r=new Random();

	d1=r.nextInt(6)+1;
	d2=r.nextInt(6)+1;

        System.out.println("Rolling the dice...");

        System.out.println("Die 1:"+d1);
        System.out.println("Die 2:"+d2);
        System.out.println("Total value:"+(d1+d2));

	if((d1+d2)>7) System.out.println("You won");
	else System.out.println("You lost");

    }
}