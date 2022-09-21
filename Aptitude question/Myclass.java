import java.util.Scanner;
class Myclass {

         public static void main(String [] args) {

		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the value");
		 int a = Scanner.nextInt();
		 System.out.println("please select an operation  \n 1.palindrom /t 2.prime number");
         int op = Scanner.nextByte();
         System.out.println("Enter the value");
         int b = Scanner.nextInt();
         if (op == 1){
               int res = Myclass.addition(a,b);
               System.out.println(res);
            }else if (op == 2){
			    int res = Myclass.avg(a,b);
				System.out.println(res);
			}
		}
}		
