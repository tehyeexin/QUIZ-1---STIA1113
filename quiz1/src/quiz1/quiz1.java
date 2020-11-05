package quiz1;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
			
		System.out.print("Input your weight in kg (female) : ");
		int wF = in.nextInt();
		
		System.out.print("Input your height in feet (female) : ");
		int hFeetF = in.nextInt();
		
		System.out.print("\t\t in inches (female) : ");
		int hInchF = in.nextInt();
		
		System.out.print("Input your weight in kg (male) : ");
		int wM = in.nextInt();
		
		System.out.print("Input your height in feet (male) : ");
		int hFeetM = in.nextInt();
		
		System.out.print("\t\t in inches (male) : ");
		int hInchM = in.nextInt();
		
		int totalInchesF = ((hFeetF-5) * 12) + hInchF;
		int totalInchesM = ((hFeetM-5) * 12) + hInchM;
		int idealweightF = wF + (totalInchesF * 5);
		int idealweightM = wM + (totalInchesM * 6);
		
		System.out.println("The ideal weight for female is " + idealweightF + "kg.");
		System.out.println("The ideal weight for male is " + idealweightM + "kg.");
	
	}

}
