package ACT3_4;

import java.util.Scanner;

public class ACT3_4_1 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n;
        int m;
        int [][] matriz;
        int max=0;
        int suma=0;
        int contador=0;
        float media=0;
        
        
        System.out.println("escribe las medidas de la matriz :");
        n = leer.nextInt();
   
        System.out.println("escribe las medidas de la matriz :");
        m = leer.nextInt();
        matriz = new int [n][m];
        
        for(int i=0;i<matriz.length;i++)
            for(int j=0;j<matriz[i].length;j++){
                
                System.out.println("introduzca un numero:"); 
                matriz[i][j]=leer.nextInt();
            }  
        System.out.println("\n--- MATRIZ RESULTANTE ---");

        // 1. Recorremos las FILAS
        for (int i = 0; i < matriz.length; i++) {  
        // 2. Recorremos las COLUMNAS de esa fila
            for (int j = 0; j < matriz[i].length; j++) {
            
            System.out.print(matriz[i][j] + " ");   // Imprimimos el valor seguido de un espacio (SIN 'ln' para que sigan en la misma línea)        
        }              
        System.out.println();                       // 3. Al terminar toda la fila, hacemos un salto de línea antes de pasar a la siguiente
        }
        
        int min=matriz[0][0];               //hay que declarar la variable aki,por que usas matriz  ahora se ha inicializado no antes 
        for(int[]fila:matriz){
            for(int columna:fila){
                contador=contador+1;        //contador para averiguar media
                
                suma=suma+columna;          //suma de todos los números
                
                media=suma/contador;        // variable media
                    
                if(columna>max)             //número maximo
                    max=columna;
                         
                if(columna<min)             //numero minimo/
                    min=columna; 
            }    
        }
    
        System.out.println("numero max es :"+ max);
        System.out.println("numero min es :"+ min);
        System.out.println("la suma de todos los números"+suma);
        System.out.println("la media :"+media);
        
        for(int i=0;i<matriz.length;i+=2){                //imprime filas pares
            for(int j=0;j<matriz[i].length;j++){ 
                System.out.print(matriz[i][j] + " ");    //filas pares              
            } 
            System.out.println("filas pares");                       
        }
        System.out.print("");
        
        for(int i=0;i<matriz.length;i++){               //si empieza por 0 imprime                        
            if(matriz[i][0]==0){                        //EL IF ENTRE MEDIAS
                for(int j=0;j<matriz[i].length;j++){
                     System.out.print(matriz[i][j] + " ");
                }
                System.out.println("fila empieza po 0");
            }               
               
        }                     
    }
}
