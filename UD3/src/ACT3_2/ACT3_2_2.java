package ACT3_2;

import java.util.Scanner;
        
public class ACT3_2_2 {
 
   
    public static void main(String[] args) {
       Scanner scanner = new Scanner( System.in);
       System.out.println(" introducce num:  " ); 
    
        int num1 = scanner.nextInt();
        
         boolean primo = true;
     
        for (int i =2; i <= num1-1; i++){               
            if (num1%i==0){               
               primo = false;
               break;
               
            }
        }
    
        System.out.println("el numero es primo?= "+primo);
    }
  

}
