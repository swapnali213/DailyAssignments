
public class prime_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0;
		System.out.println("the prime between 100 to 200 are");
				for(int n =100;n<=200;n++) {
				
				for (int i=2;i<n;i++)
				{
					if(n%i==0)
					{
						temp=temp+1;
					}
				}
				if(temp==0)
				{
					System.out.println(n);
				}
				else
				{
					temp=0;
				}
				}	
			}
		
	}


