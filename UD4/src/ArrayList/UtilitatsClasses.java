package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class UtilitatsClasses {
        
    /**
     *
     * @param lista
     */
    public static void mostrarArrayListInt(ArrayList<Integer> lista) {
        System.out.print("[ ");
        for (Integer a : lista) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    
        public static void mostrarArrayListStr(ArrayList<String> listaPalabras) {
        System.out.print("[ ");
        for (String a : listaPalabras) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    /**
     * Crear un ArraList 
     *      s'avalua cada element de l'array en l'ArrayList
     * @return ArrayList 
     */    
    public static ArrayList<Integer> mostrarDiferents(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        for (Integer num: array) {
            if (! resultat.contains(num)) // si 'num' no se encuentra en 'resultat', se añade.
                resultat.add(num);		
        }
        return resultat;
    }
    
    /**
     * Transforma un int[] a un ArrayList<Integer>
     * @param array --> int[]
     * @return ArrayList<Integer>
     */
    
    
    // ARRAY ---> ARRAYLIST 
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }    
        return arrayList;
    }
    
    // ARRAYLIST --->ARRAY
    public static int[] ArrayListToArray(ArrayList<Integer> lista){       
        int[] conv = new int[lista.size()]; 
        
        for(int i=0;i< lista.size();i++){
            conv[i]=lista.get(i);
        }              
        return conv;   
    }
    
    /**
    * Crear un ArrayList 
    *      s'avalua cada element de l'array en l'ArrayList
    *     Si el ArrayList se mantiene ordenado se pueden ahorrar muchas lecturas
    * @return ArrayList ordenat
    */
    public static ArrayList<Integer> mostrarDiferentsMillorat(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        for (int num : array) {
            int i = 0; // índice donde hay que insertar en 'resultat'
            boolean trobat = false;
            
            for (Integer r : resultat) { // "se busca 'num' dentro de 'resultat'"
                if( r == num) { // "encontrado, no hace falta insertar" (o "no es necesario insertar").
                    trobat = true;
                    break;
                } else if (r > num) // "no encontrado, ni se encontrará si el ArrayList se mantiene ordenado, hay que insertar" (o "se debe insertar").
                    break;
                else // seguir cercant dins 'resultat'
                    i++;
            }
            if (!trobat) // "añadir 'num' en la posición 'i' para mantener el ArrayList ordenado"
                resultat.add(i,num);
        }
        
        return resultat;
    }
    
    //devuelva un ArrayList<Integer> que contenga solo una copia de cada número,
    //es decir, sin duplicados ni repetidos.
    
    public static ArrayList<Integer> generaDiferents(int[] lista){
       ArrayList<Integer> resultat = new ArrayList<>();
       
       for (int  num : lista){
           boolean esta = false;
           
           for (Integer elemento : resultat){
               if( elemento == num){
                   esta = true;
                   break;
               }
           }                             
            if (!esta)  {
                resultat.add(num);
           }      
       }        
        return resultat;
    }

    //ORDENA CON REPETICION
    public static ArrayList<Integer> ordenaArray(int[] lista){
        ArrayList<Integer> ordenar = new ArrayList<>();
        
        for(int num : lista){
            boolean existe =false;
            
            for(int i = 0; i< ordenar.size();i++){
                if(num<=ordenar.get(i)){
                    ordenar.add(i, num);
                existe = true;
                break;
                }                      
            }            
            if(!existe){
            ordenar.add(num);
            }       
        }                  
    return ordenar ;
    }
    // ORDENA SIN REPETICION
    public static ArrayList<Integer> ordenaArraySenseRepeticions(int[] lista){
        ArrayList<Integer> sinRepe = new ArrayList<>();    
        for(int num : lista){
           boolean  insertado= false;
           
           for(int i =0; i < sinRepe.size();i++){
               if(num < sinRepe.get(i)){
                   insertado = true;
                   sinRepe.add(i, num);
                   break;
               }else if(num == sinRepe.get(i)){
                    insertado = true;             
                   break;
               }                    
           }
           if (!insertado){
           sinRepe.add( num);           }
        } 
        return sinRepe;
    } 
    
    
    //OBTIENE PARES DE UN ARRAY 
    
    public static ArrayList<Integer> obteParells(int[] lista){
        ArrayList<Integer> pares = new ArrayList<>();
        
        for(int num : lista){
            if(num%2==0){
                pares.add(num);
            }
        }          
        return pares;  
    }
    //pares ordenados
    public static ArrayList<Integer> obteParellsOrdenat(int[] lista){         
        ArrayList<Integer> ordenat = UtilitatsClasses.obteParells(lista);       
       
        int[] convert = new int[ordenat.size()];
            for(int i = 0; i< ordenat.size();i++){
                convert[i]= ordenat.get(i);
            }              
        return UtilitatsClasses.ordenaArray(convert);        
    }
    
    //PARES ORDENADOS SIN REPETIR
    
    public static ArrayList<Integer> obteParellsOrdenatSenseRepeticions(int[] lista){
        ArrayList <Integer> obten = UtilitatsClasses.obteParells(lista); 
        
        int[] nuevoArray = UtilitatsClasses.ArrayListToArray(obten);
        
        ArrayList<Integer> sense = UtilitatsClasses.ordenaArraySenseRepeticions(nuevoArray);
        
        return sense ;        
    }
    //VALORES REPETIDOS DE LAS DOS ARRAYS
    public static ArrayList<Integer> obteRepetits(int[]array1,int[]array2){
        ArrayList <Integer> repetits = new  ArrayList<>();
        
        for (int a:array1){
            boolean A= false;
               for(int b:array2)
                   if(a==b)
                       A=true;
        if (A)
        repetits.add(a);
        }
        
        return repetits;
    }
    
    
    //DIFERENTES DE DOS ARRAYS
    public static ArrayList<Integer> obteDiferents (int[] array1,int[] array2){
        ArrayList<Integer> obte = new ArrayList<>();
        
        for (int a :array1){           
            boolean encontrado = false;
            
            for(int b : array2){
                if(a == b){
                    encontrado = true;
                    break;
                }          
            }
            if(!encontrado){
                obte.add(a);
            }
        }         
        return obte;   
    }
    
   
    
    //ejercicio 10
    
    public static ArrayList<String> LlegirAlumnes(){
        ArrayList<String> alumno = new ArrayList<>();
        String nom;
        
            do {nom=UtilitatsConsola.llegirCadena("introduce nombre del alumno");
                if (!nom.equals("sortir")) 
                    alumno.add(nom);
                             
            }while (!nom.equals("sortir"));
        return alumno;
    }
    
    public static ArrayList<Integer> LlegirNota(){
        ArrayList<Integer> nota = new ArrayList<>();
        int numero;
        
            do{numero=UtilitatsConsola.llegirSencer("introduzca numero");
                if (numero !=-1)
                    nota.add(numero);                            
            }while(numero!=-1);       
        return nota;
    }
    
    //SUMA ARRAYLIST
    public static int sumaArrayList (ArrayList<Integer> list){
        int suma=0;
        for(Integer a : list){
            suma += a;
        }
        return suma;
    }
    
    //MEDIA ARRAYLIST
    public static float mediaArrayList(ArrayList<Integer> lista){
        int suma = sumaArrayList(lista);
        int total = lista.size();
        
        return ((float)suma/total);   
    }
    
    public static ArrayList<ArrayList<Integer>> llegirNotesAlumnes(ArrayList<String> alumnos){
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>(); 
        
              for(int i =0;i<alumnos.size();i++){
                 
                  matriz.add(LlegirNota());
              
              }                  
        return matriz;
    }
    
    public static void mostrarResultados(ArrayList<String> alumnes,ArrayList<ArrayList<Integer>> notes){
    
        for(int i =0; i<alumnes.size();i++){
            System.out.println(alumnes.get(i)+" : ");
        }
        for(int i =0; i<notes.size();i++){
            System.out.println(notes.get(i)+" : ");

            float media = mediaArrayList(notes.get(i));
                System.out.println("la media es : "+media);
        }       
    }
}