
public class FabanocciSeries {

	public void fabNum(int num)
	{
		int feb[] = new int[num];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<=num;i++)
		{
			feb[i]= feb[i-1] + feb[i-2];
			System.out.println(feb[i]);
		}	
	}
	
	public static void main(String args[])
	{
		FabanocciSeries f = new FabanocciSeries();
		f.fabNum(15);
	}
}
