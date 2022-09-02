class student {
            public static void main (String [] ar)
          
              {
            
             byte []rupees ={10,50,67,34,56,87,28};
              System .out.println("size of the array"+rupees.length );
             for (byte j=0; j<=6; j++)
             {

                  if ( rupees[j] <40){
                        System .out.println(rupees[j]+"is even");
                   }
                  else {                 
                         System .out.println(rupees [j]+"is odd");
                  }  
               
              {
                if( rupees[j]%2 ==0){
                }
                else{
                     System .out.println("print the odd number:"+rupees[j]);
                 }
               }   

                if( rupees[j]%2 ==0){
                     System .out.println("print the even number:"+rupees[j]);
                 }
                



               {
                int [] toy = { 10,5,4,9,7,2,1,3};  
                int toyE =0 ;
                int toyO =0 ;
                
                 System .out.println("size of the array"+toy.length);
                    for (int i=0;i<=7 ;i++)
                       {
                         if ( toy [i] %2 ==0)
                          { 
                            toyE = toyE + toy [i];
                           }
                          else{
                             toyO = toyO + toy [i];
                          }
                        }
                System .out.println ("sum of even numbers:"+toyE);
                System .out.println ("sum of 0dd numbers:"+toyO);
             }
           }
        }

}