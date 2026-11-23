package ACT3_1;



public class ACT3_1_8 {

   
    public static void main(String[] args) {
       
        
        System.out.println("suma de los pares del 1 al 100: ");
        
       int contador = 0;
        for (int i = 1; i <= 100; i++){
            
            if (i %2 == 0){
                contador = contador + i;
            
            }
        }
          System.out.println(contador);
       
    }

}