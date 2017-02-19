package passingformula;
import java.util.Scanner;


public class PasserRating {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("How many passes were attempted?");
		double Attempts = sc.nextInt();
		System.out.println("How many passes were completed?");
		double Completions = sc.nextInt();
		System.out.println("How many yards did the QB throw for?");
		double Yards = sc.nextInt();
		System.out.println("How many touchdowns did the QB throw?");
		double Touchdowns = sc.nextInt();
		System.out.println("How many interceptions did the QB throw?");
		double Interceptions = sc.nextInt();
		double A = ((Completions/Attempts)-.3)*5;
		double B = ((Yards/Attempts)-3)*.25;
		double C = (Touchdowns/Attempts)*20;
		double D = (2.375-(Interceptions/Attempts)*25);
		double PasserRating = ((A+B+C+D)/6)*100;
		if (PasserRating > 158.3){
			System.out.println(158.3);
		}
		else {
			System.out.printf("%.1f",PasserRating);
		}
	}
}