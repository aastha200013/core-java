class Calculator {

        String brandname;
		int prize;
		String type;
		
		
    Calculator ()
       {
	   this.brandname = brandname;
	   this.prize = prize;
	   this.type = type;
      }	 

     int subtraction(int a,int b,int c){  
            int sub = a-b-c;
            return sub;
	 
	 }
			
     int subtraction(int a,int b){
		     int total = a - b ;
			 return total ;
	 }
	 double subtraction (int u, double v){
		     double total  = u- v;
			 return total  ;
		
	 }	
					
      public static void main(String [] args){
		  
		  Calculator c = new Calculator();
	       int as = 70;
		   int bs = 5;
		   int cs = 3;
		  int result= c.subtraction(as,bs,cs);
		  System.out.println(result);
		  
		  int mn = 70;
		  int op = 20;
		  int total  = c.subtraction(mn,op);
		   System.out.println(total );
		   
		  int n = 90;
		  double p = 72;
		  double subtract = c.subtraction(n,p);
		   System.out.println(subtract);
		  

         }	  
		 
	 
}	 