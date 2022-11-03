package assign;
import java.lang.*;
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String str1="this is easiest example";
		java.lang.String num="11#22#33#44#55";
        java.lang.String[] result=str1.split("  ");
        
        System.out.println(str1.substring(0,4));
        System.out.println(str1.substring(5,7));
        System.out.println(str1.substring(8,15));
        System.out.println(str1.substring(16,23));
        
        for(java.lang.String i:result)
        {
        	System.out.println(i);
        }
		

       
		
		
	}

}
