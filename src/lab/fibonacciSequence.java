package lab;

public class fibonacciSequence {
	
   public static void main(String[] args) {

		  int n=10;
	      int a=0;
	      int b=1;
	      int temp=0;
	      System.out.println("enter  n number");
	      for(int i=1;i<=n;i++) {
	    	  
	    	  System.out.println(a);
	    	  temp=a+b;
	    	  a=b;
	    	  b=temp;
	      }
	    	  
	      }
	}


