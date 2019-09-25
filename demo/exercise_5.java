package demo;
import java.util.Scanner;
public class exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一段字符串:");
		String str=input.next();
		byte[] temp=str.getBytes();
		boolean b=true;
		for(int i=0;i<temp.length;i++)
		{
			if (temp[i]==temp[temp.length-1-i])
				b=true;
			else
				{
				b=false;
				break;
				}
		}
		if(b)
			System.out.print(str+"是回文字符串");
		else
			System.out.print(str+"不是回文字符串");
		input.close();
	}
}