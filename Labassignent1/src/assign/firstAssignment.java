package assign;

import java.util.Scanner;

public class firstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("Enter a number: ");
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		 
		    for(int i=1;i<=n;i++) {
		      for(int j=i;j<=n-1;j++) {
		        System.out.print(" ");
		      }
		      for(int j=1;j<=i;j++) {
		        System.out.print(j);
		      }
		      for(int j=i-1;j>=1;j--) {
		        System.out.print(j);
		      }
		      System.out.println();
		    }
			

	}

}
