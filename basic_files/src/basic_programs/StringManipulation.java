package basic_programs;

public class StringManipulation {

	public static void main(String[] args) {
		/*String[] wordListOne = {"24/7","multi-tier","30,000 foot","B-TO-B","win-win"};
		int oneLength = wordListOne.length;
		
		for(int i=0;i<5;i++){
			System.out.println((int) (Math.random()*oneLength));
			
		}*/
		
		/*int x=3;
		while(x>0)
		{
			if(x>2)
			{
				System.out.print("a");
			}
			x=x-1;
			System.out.print("-");
			if(x==2)
			{
				System.out.print("b c");
			}
			if(x==1)
			{
				System.out.print("d");
				x=x-1;
			}
		}*/
		
		int x=0;
		while(x<4)
		{
			System.out.print("a");
			
			if(x<1)
			{
				System.out.print(" ");
			}
			System.out.print("n");
			
			if(x>1)
			{
				System.out.print(" oyster");
				x=x+2;
			}
			
			
			if(x==1)
			{
				System.out.print("noys");
			}
			if(x<1)
			{
				System.out.print("oise");
			}
			
			System.out.println("");
			x=x+1;
		}
		
		
		
	}

}
