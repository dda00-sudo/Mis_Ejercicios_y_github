package ACT3_3;


public class ACT3_3_1 {

   
    public static void main(String[] args) {
        int[] lista = {1,3,5,7,19,8,6};
        boolean par=false;
        int suma=0;
        int NumeMax=lista[0];
        int NumeMin=lista[0];
        int Num7=-1;
        int contador_10=0;
        int sumador_mayor5=0;
        int contador_mayor5=0;
       
            for(int i= 0; i <=lista.length-1; i++){ 
                suma = suma + lista [i];                   
                if(lista[i] %2==0){
                par = true;    
                System.out.println(lista[i]+" es par");
                }else{
                     System.out.println(lista[i]+" es impar");    
                }
                if(NumeMax<lista[i]){
                NumeMax=lista[i];
                }
                if(NumeMin<lista[i]){
                NumeMin=lista[i];     
                }
                if(lista[i]== 7){
                    Num7=i;
                }
                if(lista[i]>10){
                    contador_10=contador_10+1;
                }
                if(lista[i]>=5){
                    sumador_mayor5= sumador_mayor5+lista[i];
                    contador_mayor5 = contador_mayor5 +1;
                }
                double media= (double) suma/lista.length ;
                double media_mayor5=(double)sumador_mayor5/contador_mayor5;
                
                System.out.println("2ºhay algun impar? "+ par);
                System.out.println("3ºla suma de todos los numeros del array es: "+suma);
                System.out.println("4ºla media deel array es :"+ media );
                System.out.println("5ºel numero mas grande es "+ NumeMax);
                System.out.println("6ºel numero mas pequeño es "+ NumeMin);
                if (Num7 == -1) {
                    System.out.println("7º El numero 7 no existe en la lista (-1)");
                }else {
                    System.out.println("7º El numero 7 esta en la posicion: " + Num7);
                }
                System.out.println("8ºnuemros superiores a 10 = "+ contador_10);
                System.out.println("9ºmedia de la suma mayor 5 "+ media_mayor5);
            }
    }
}



