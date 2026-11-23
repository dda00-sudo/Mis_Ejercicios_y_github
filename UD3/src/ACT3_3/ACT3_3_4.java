package ACT3_3;


public class ACT3_3_4 {

   
    public static void main(String[] args) {
        int[] lista1={1,2,3,4,5,6,7,8,9,10};
        int[] lista2={1,2,3,4,5,6,7,8,9,10};
        
       /* boolean igual=false;
        if(lista1==lista2){
            igual=true;
          
        }
        if(lista1.length==lista2.length){
            igual=true;
            
        }
        
        System.out.println("son iguales = "+igual);
        System.out.println("tienen la misma longuitud ="+ igual);*/
       for (int i=0;i<lista1.length;i++)
           System.out.print(""+i);
        System.out.println("");
       for(int a: lista1)
           System.out.print(""+a);
        
           
    }

}
