class Character{

       public static void main(String args []){
	   
	       String name = "AGARWAL";
		   
		   char[] ch = new char[name.length()];
		   
		   for (int i=0;i< name.length();i=i+1){
		   ch[i] = name.charAt(i);
		   }
		   
		   for (char c : ch)
		   {
		      System.out.println(c);
			}  
		}
	}	