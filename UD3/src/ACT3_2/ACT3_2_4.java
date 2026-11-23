package ACT3_2;

import java.util.Scanner;

public class ACT3_2_4 {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
        System.out.println("escribe numeros enteros : ");
        int num1 = scanner.nextInt();
        int suma = 0;
        int total = 0;
        
        while (num1 != -1){
            
            suma = suma + num1;
            total = total + 1;
                    
            System.out.println("escribe numeros enteros : ");
            num1 = scanner.nextInt();
             }
        double media= (double) suma/total;
          System.out.println(media);        
        System.out.println("");
    }

}
