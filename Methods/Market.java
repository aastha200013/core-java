class Market {

        String place;
		String vegetables;
		int length;
		int area; 
		
		 Market (){
			 System.out.println("inside constructor");
		 }
		static void showVeggiesandFruits(){
		        System.out.println("Potato and Apple");
				
	    String words = "hello-how-you-doing";
		String [] word = words.split("-");
		
		for (int i=0;i<word.length;i++){
			System.out.println(word[i]);
		 }
	}
		
		public static void main(String [] args){
			
			Market market = new Market();
		     Market.showVeggiesandFruits();
			 
		
			
		}
	}
		
	
	