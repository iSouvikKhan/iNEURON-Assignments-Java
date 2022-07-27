package Assignment_1;

public class Question_1 {

	public static void main(String[] args) {

		int n = 10;

	     for(int i=0;i<n;i++) {
	    	 // I
	  	   for(int j=0;j<n;j++) {
	  		   
	  		   // space
	  		   if(j==0) {
	  			   System.out.print("   ");
	  		   }
	  		   
	  		   if(j==0) {
	  			   System.out.print("|");
	  		   }
	  		   
	  		   // space
	  		   if(j==1) {
	  			   System.out.print("   ");
	  		   }
	  	   }
	  	   
	  	   // N
	  	 for(int j=0;j<n;j++) {
  		   if(j==0 || j==n-1 || i==j) {
  			   System.out.print("|");
  		   }else {
  			   System.out.print(" ");
  		   }
  		   
  		   // space
  		   if(j==n-1) {
  			   System.out.print("   ");
  		   }
  	   }
	  	 
	  	 // E
	  	for(int j=0;j<n;j++) {
 		   if(i==0 || j==0 || i==n-1 || i==(n-1)/2 && j<=(n-1)/2) {
 			   System.out.print("|");
 		   }else {
 			   System.out.print(" ");
 		   }
 		   
 		   // space
  		   if(j==n-1) {
  			   System.out.print("   ");
  		   }
 	   }
	  	
	  	// U
	  	for(int j=0;j<n;j++) {
 		   if(j==0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i!=n-1) {
 			   System.out.print("|");
 		   }else {
 			   System.out.print(" ");
 		   }
 		   
 		   // space
  		   if(j==n-1) {
  			   System.out.print("   ");
  		   }
 	   }
	  	
	  	// R
	  	for(int j=0;j<n;j++) {
 		   if(i==0 && j!=n-1 || i==(n-1)/2 && j!=n-1 || j==0 || j==n-1 && i!=0 && i<(n-1)/2 || i==(n-1)/2 && j!=n-1 || i-j==2) {
 			   if(i==3 && j==1) System.out.print(" ");
 			   else System.out.print("|");
 		   }else {
 			   System.out.print(" ");
 		   }
 		   
 		   // space
  		   if(j==n-1) {
  			   System.out.print("   ");
  		   }
 	   }
	  	
	  	// O
	  	for(int j=0;j<n;j++) {
 		   if(j==0 && i!=0 && i!=n-1 || i==0 && j!=0 && j!=n-1 || j==n-1 && i!=0 && i!=n-1 || i==n-1 && j!=0 && j!=n-1) {
 			   System.out.print("|");
 		   }else {
 			   System.out.print(" ");
 		   }
 		   
 		   // space
  		   if(j==n-1) {
  			   System.out.print("   ");
  		   }
 	   }
	  	
	  	// N
	  	for(int j=0;j<n;j++) {
		   if(j==0 || j==n-1 || i==j) {
			   System.out.print("|");
		   }else {
			   System.out.print(" ");
		   }
		   
		   // space
  		   if(j==n-1) {
  			   System.out.print("   ");
  		   }
	   }
	  	   
	  	   System.out.println();
	     }
		
		
	}
	
}
