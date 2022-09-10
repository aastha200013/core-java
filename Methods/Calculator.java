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

        
     int addition(int a,int b,int c){  
            int add = a+b+c;   
            return add; 
	 }
			
     int addition(int a,int b){
		     int sum = a + b ;
			 return sum ;                   
	 }

     double addition (int u, double v){
		     double sum  = u+ v;
			 return sum  ;	
	 }	
     
    int multiplication(int a,int b,int c){  
            int multiply = a*b*c;   
            return  multiply; 
	 }
			
     int multiplication(int a,int b){
		     int mul = a * b ;
			 return mul;                   
	 }

     double multiplication(int u, double v){
		     double mul= u * v;
			 return mul ;	
	 }


					
      public static void main(String [] args){
		  
		  Calculator c = new Calculator();
	       int as = 70;
		   int bs = 5;
		   int cs = 3;
		  int result= c.subtraction(as,bs,cs);
                  int result1= c. addition(as,bs,cs);
                  int result3= c. multiplication(as,bs,cs);
		  System.out.println(result);
                   System.out.println(result1);
                   System.out.println(result3);
		  
		  int mn = 70;
		  int op = 20;
		  int total  = c.subtraction(mn,op);
                  int total2  = c. addition(mn,op);
                  int total3  = c. multiplication(mn,op);
		   System.out.println(total );
		    System.out.println(total2 );
                      System.out.println(total3 );

		  int n = 90;
		  double p = 72;
		  double subtract = c.subtraction(n,p);
                  double subtract2 = c. addition(n,p);
                  double subtract3 = c.multiplication(n,p);
		   System.out.println(subtract);
                    System.out.println(subtract2);
                     System.out.println(subtract3);
		  

         }	  
		 
	 
}	 