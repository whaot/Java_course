package demo;
import java.util.Scanner;
public class exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB:");
		double rate=input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int key=input.nextInt();
		if(key==0) 
			{
			System.out.print("Enter the dollar amount:");
			double dollar=input.nextDouble();
			double RMB=dollar*rate;
			System.out.println("$"+dollar+" is "+RMB+" yuan");
			}
		else
		{
			System.out.print("Enter the RMB amount:");
			double RMB=input.nextDouble();
			double dollar=RMB/rate;
			dollar = (double) Math.round(dollar * 100) / 100;//保留2位小数
			System.out.println(RMB+" yuan is $"+dollar);
		}
		input.close();
	}
	}

