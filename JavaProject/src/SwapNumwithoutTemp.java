
public class SwapNumwithoutTemp {

	public void swap(int a, int b){
		System.out.println("-- Before swap :: x = "+a+" y = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("-- After swap :: x = "+a+" y = "+b);
	}
	
	public static void main(String args[]){
		
		SwapNumwithoutTemp s = new SwapNumwithoutTemp();
		s.swap(1, 2);
	}
}
