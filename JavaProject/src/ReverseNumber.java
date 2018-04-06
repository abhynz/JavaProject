import java.util.Scanner;

public class ReverseNumber {

	public int revNum(int num)
	{
		int rev = 0;
		while (num!=0)
		{
			rev = (rev*10)+(num%10);
			num = num/10;
		}
		return rev;
	}
	
	public static void main(String args[])
	{
		ReverseNumber rn = new ReverseNumber();
		System.out.println(rn.revNum(123));
		
	}
}
