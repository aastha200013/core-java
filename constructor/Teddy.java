class Teddy{

       String Teddycolor;
	   String Teddyname;
	   int Weight;
	   byte Length;
	   
	  Teddy(){
             System.out.println("creating object");
             
            System.out.println("object created");
		}
		
	  Teddy(String tname){
             System.out.println("creating object");
             Teddyname = tname;
             System.out.println("object created");
        }

      Teddy (String tcolor ,int wei){
             System.out.println("creating object");
             Teddycolor = tcolor;
             Weight = wei ;
             System.out.println("object created");
        }
	}	