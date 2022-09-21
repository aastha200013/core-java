class TestTv {

     public static void main (String [] args){
		 
	 Tv t = new Tv ("Sony");
			  t.print();
			
			  
	         String [] features = {"pixel","Dynamic Backlight"};
			 
			 Tv tv = new Tv("java","X1 Bravia",(byte)55,'B',750000,"SmartTv","Led",features);
			 tv.print();
			 
            
    }
}