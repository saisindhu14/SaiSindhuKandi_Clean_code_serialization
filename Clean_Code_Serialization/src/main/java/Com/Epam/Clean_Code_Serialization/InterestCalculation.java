package Com.Epam.Clean_Code_Serialization;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InterestCalculation {
	public static void Interest() {
		Scanner sc = new Scanner(System.in);
		PrintStream p = new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println("Time");
		int time = sc.nextInt();
		p.println("Principle");
		float principle = sc.nextInt();
		p.println("rate");
		int rate = sc.nextInt();
		p.println("n");
		int n= sc.nextInt();
		float simple = (principle*time*rate)/100;
		double amount = principle * Math.pow(1 + (rate / n), n * time);
		double cinterest = amount - principle;
	}
}