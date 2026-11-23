package ACT3_1;

import java.util.Scanner;

public class ACT3_1_7 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("introduce numero uno: ");
        int num1 = scanner.nextInt();
        System.out.println("introducce numero dos: ");
        int num2 = scanner.nextInt();
        System.out.println("elege una opcion: 1 sumar,2 restar, 3 multiplicar, 4 dividir: ");
        int operacion = scanner.nextInt();
        
        if(operacion == 1){
            System.out.println(num1+"+"+num2+"="+(num1+num2));
        }
        else if (operacion == 2){
        System.out.println(num1+"-"+num2+"="+(num1-num2));
                }
        else if (operacion ==3){
            System.out.println(num1+"x"+num2+"="+(num1*num2));
        }
         else if (operacion ==4){
             if (num2!=0){           
            System.out.println(num1+"/"+num2+"="+((float)num1/num2));
         }else{
                 System.out.println("no se puede dividir entre cero");
             }
        }
           
    }

}
