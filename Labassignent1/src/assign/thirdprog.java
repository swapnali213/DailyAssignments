package assign;

import java.util.Scanner;

public class thirdprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter value of a:");
	  		int a = sc.nextInt();
	  		System.out.println("Enter value of b:");
	  		int b = sc.nextInt();
	  		System.out.println("Enter value of c:");
	  		int c = sc.nextInt();
	  	    if (a+b+c == 180)
	  	    {	
	  	    	if (a<90 || b<90 || c<90 )
	          	{
	          		System.out.println("Prize1");
	          	
	          		}
	          	
	  	    }
	   		
	      	else if (a==90||b==90||c==90)
	      	{
	      		System.out.println("Prize 2");
	      	}
	      	else if (a==60||b==60||c==60)
	      	{
	      		System.out.println("Prize 3");
	      	}
	      	else 
	      	{
	      		System.out.println("No Prize");
	  }}


	}


