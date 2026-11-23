package ACT3_3;


public class ACT3_3_4B {

   
    public static void main(String[] args) {
        int[] lista1=new int[10];
        int[] lista2=new int[lista1.length+1];
        
        for (int i=0;i<10;i++){
            lista1[i]=i+1;
            lista2[i]=i+1;
        }
        for(int a : lista1)
            System.out.print(a +" "); 
        System.out.println("");        
        for(int a: lista2)
            System.out.print(a +" ");
        
        System.out.println("");
//        ¿tienen la misma longitud?
        boolean igual=true;
        if(lista1.length==lista2.length){
           for(int i=0;i<lista1.length;i++)
               if(lista1[i]!=lista2[i]){
               igual=false;
               System.out.println(igual);
               break;     
                }
        }else{ System.out.println(igual);
             }
        
        
        
    }

}