package assign;

public class transposemetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a ={{1,2},{4,5},{8,9}};
		int[][]transpose= new int[2][2];
		int[][]res= {};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				transpose[i][j]=a[j][i];  
				res[i][j]=a[i][j]-transpose[i][j];
			}
			
		}
		System.out.println(" Matrix After Transpose:");  
		for(int i=0;i<2;i++){    
		for(int j=0;j<2;j++){  
			System.out.print(transpose[i][j]+" ");    
	}
		System.out.println();   
		
}}}
