package demo;
import java.util.Scanner;
public class exercise_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		boolean bool=true;
		int right=0;
		int total=0;
		do{
			total++;
			int number1 = (int)(Math.random()*100);
			int number2 = (int)(Math.random()*100);
			if(Math.random()>0.5)//随机进行加法或减法
			{
			System.out.print(number1+"+"+number2+"= ");
			int answer = input.nextInt();
			if(number1+number2==answer)
				{
				right++;
				System.out.println("回答正确! (✧◡✧)  	目前回答正确"+right+"道题，一共答题"+total+"道");
				}
			else
				{
				System.out.println("回答错误! o(╥﹏╥)o	目前回答正确"+right+"道题，一共答题"+total+"道");
				}
			}
			else
			{
				if(number1<number2)//确保被减数>=减数
				{
					int temp=number1;
					number1=number2;
					number2=temp;
				}
				System.out.print(number1+"-"+number2+"= ");
				int answer = input.nextInt();
				if(number1-number2==answer)
					{
					right++;
					System.out.println("回答正确! (✧◡✧)  	目前回答正确"+right+"道题，一共答题"+total+"道");
					}
				else
					{
					System.out.println("回答错误! o(╥﹏╥)o	目前回答正确"+right+"道题，一共答题"+total+"道");
					}
			}
			System.out.println("是否进入下一题?输入空字符则进入下一题,输入任意字符退出:");
			input.nextLine();//使用nextLine时会直接读取上次回车，这里加入一个nextLine
			bool=input.nextLine().trim().isEmpty();//trim()消去首尾空格
		}while(bool);
		System.out.println("end");
		input.close();
	}

}
