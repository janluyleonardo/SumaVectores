/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svectores;

/**
 *
 * @author Yeferson Chaparro
 */
public class Svectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
        int i;
   System.out.println("PROGRAMA PARA SUMAR DOS VECTORES ");
   int vector1 []= new int[3];
   int vector2 []= new int[3];
    int resultado []= new int[3] ;
       
   
        
    
    
    
   vector1[0]=1;
   System.out.println("Vector 1, posición 0 es "+ vector1[0] ) ;
   vector1[1]=2;
   System.out.println("Vector 1, posición 1 es "+ vector1[1] ) ;
   vector1[2]=3;
   System.out.println("Vector 1, posición 2 es "+ vector1[2] ) ;
 
   vector2[0]=1;
   System.out.println("Vector 2, posición 0 es "+ vector1[0] ) ;
   vector2[1]=2;
   System.out.println("Vector 2, posición 1 es "+ vector1[1] ) ;
   vector2[2]=3;
   System.out.println("Vector 2, posición 2 es "+ vector1[2] ) ;
   
  
   for(i=0;i<vector1.length;i++){
   resultado[i]=vector1[i]+vector2[i];
  
   
   }
   for(i=0;i<vector1.length;i++){
    System.out.println("la suma de los vectores es "+ resultado[i] ) ;
   }




    }

    
}
