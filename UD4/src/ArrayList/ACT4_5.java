package ArrayList;

import java.util.ArrayList;
public class ACT4_5 {

   
    public static void main(String[] args) {
        int[] miArray = UtilitatsArrays.generaArray(25, 0, 3);
        ArrayList<Integer> resultado = UtilitatsClasses.generaDiferents(miArray);
        
        System.out.println(resultado);
        
        
        int[] Array2 = UtilitatsArrays.generaArray(10, 0, 9);
         ArrayList<Integer> ordenado = UtilitatsClasses.ordenaArray(Array2);
         
         System.out.println(ordenado);
       
         
        int[] Array3 = UtilitatsArrays.generaArray(10, 0, 9);
         ArrayList<Integer> ordenadoSinRepe = UtilitatsClasses.ordenaArraySenseRepeticions(Array3);
         
         System.out.println(ordenadoSinRepe);
         
         
        int[] Array4 = UtilitatsArrays.generaArray(10, 0, 9);
        ArrayList<Integer> pares = UtilitatsClasses.obteParells(Array4);
        
        System.out.println(pares);
        
        int[] Array5 = UtilitatsArrays.generaArray(10, 0, 100);
        ArrayList<Integer> paresOrdenat = UtilitatsClasses.obteParellsOrdenat(Array5);
       
        System.out.println(paresOrdenat);
        
        int[] Array6 = UtilitatsArrays.generaArray(10, 0, 10);
        ArrayList<Integer> sense = UtilitatsClasses.ordenaArraySenseRepeticions(Array6);
        
        System.out.println(sense);
        
        int[] Array7 = {3,4,5,6,8};
        int[] Array8 = {3,9,2,6,3};

        ArrayList<Integer> noRepit = UtilitatsClasses.obteDiferents(Array7,Array8);
        ArrayList<Integer> repetit =UtilitatsClasses.obteRepetits(Array8, Array7);
        
        System.out.println(noRepit);
        System.out.println(repetit);
      
        
    
    
    //EJERCICIO 10
    ArrayList<String> alumnes = UtilitatsClasses.LlegirAlumnes();
    ArrayList<ArrayList<Integer>> notes = UtilitatsClasses.llegirNotesAlumnes(alumnes);
    
    UtilitatsClasses.mostrarResultados(alumnes,notes);

    }
}







