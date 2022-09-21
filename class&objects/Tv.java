class Tv {

       String brandName ;
	   String modelName;
	   byte size;
	   char colour;
	   int prize;
	   String [] features;
	   String typeOfTv;
	   String screenType;
	   
	   Tv(String brandName){
	   this.brandName=brandName;
	   }
	   Tv(String brandName,String modelName,byte size,char colour,int prize,String typeOfTv,
	   String screenType,String []features){ 
		   this.brandName = brandName;
		   this.modelName = modelName;
		   this.size=size;
		   this.colour = colour;
		   this.prize = prize;
		   this.typeOfTv=typeOfTv;
		   this.screenType = screenType;
		   this.features = features;
        }
	  void print (){
	  System.out.println(brandName+"\t"+modelName+"\t"+screenType+"\t"+size+"\t"+colour +"\t"+prize+"\t"+typeOfTv+"\t"+features);
	  if (features != null){
		  for(int i=0;i<features.length;i++){
			  System.out.println(features[i]);
	  }
	  } 
	  }
 }
	   
	   