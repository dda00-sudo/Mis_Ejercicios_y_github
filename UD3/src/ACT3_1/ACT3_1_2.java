package ACT3_1;

import java.util.Scanner;
public class ACT3_1_2 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("introduce un múmero: ");
        int num1 = scanner.nextInt();
        
        if (num1 %2 ==0){
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar");
        }
                 
    }
    
}
