package qbrating;

import java.util.Scanner;

public class QBRating {

	public static void main(String[] args) {
		int comp;
		int att;
		int yards;
		int TD;
		int inte;
		double QB;
		double a;
		double b;
		double c;
		double d;
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Please enter # of completions");
		comp = user_input.nextInt();
		System.out.println("You entered: "+comp);
		
		System.out.println("Please enter # of attempts");
		att = user_input.nextInt();
		System.out.println("You entered: "+att);
		
		System.out.println("Please enter # of yards");
		yards = user_input.nextInt();
		System.out.println("You entered: "+yards);
		
		System.out.println("Please enter # of TD passes");
		TD = user_input.nextInt();
		System.out.println("You entered: "+TD);
		
		System.out.println("Please enter # of interceptions");
		inte = user_input.nextInt();
		System.out.println("You entered: "+inte);
		
		a = ((comp/att) - .3)*5;
		b = ((yards/att) - 3 )*.25;
		c = ((TD/att))*20;
		d = 2.375 - ((inte/att)*25);
		
		QB = ((a+b+c+d)/6)*100;
		System.out.println("The QB rating is: "+QB);
		
		

	}

}
