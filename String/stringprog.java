class information {
             public static void main (String [] args) {
             String name = "AASTHA";

             int charsize = name.length();
             System.out.println("size of the string" +charsize);
             
             String name1 = "Handsome";
             String name2 = "Beautiful";

             System.out.println(name2.charAt(5));             
             System.out.println(name1.contains("beauty"));
             System.out.println(name1.equals(name2));
             System.out.println(name2.indexOf("i"));
             System.out.println(name1.length());
             System.out.println(name1.replace("Handsome","Smart"));
             System.out.println(name1.split("d",2));
             System.out.println(name2.toCharArray());
             System.out.println(name1.toLowerCase());
             System.out.println(name1.toUpperCase());
             System.out.println(name1.valueOf(name1));
           }
 }

