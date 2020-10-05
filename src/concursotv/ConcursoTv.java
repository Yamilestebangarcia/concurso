
package concursotv;

import java.util.InputMismatchException;
import java.util.Scanner;



public class ConcursoTv {

 
    public static void main(String[] args) {
       
        String nombre; 
        String apellido1;
        String apellido2;
        int x=2;
        int y=3;
        String resultado;
        Scanner teclado = new Scanner( System.in );
        System.out.println("introduce tu nombre");
        nombre=teclado.next();
         nombre =nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
         
        System.out.println("introduce tu primer apellido");
         apellido1 =teclado.next();
         apellido1 =apellido1.toUpperCase().charAt(0) + apellido1.substring(1,apellido1.length()).toLowerCase();
       /*  apellido1=apellido1.toUpperCase().charAt(0);*/
        System.out.println("introduce tu segundo apellido");
         apellido2 =teclado.next(); 
        apellido2 =apellido2.toUpperCase().charAt(0) + apellido2.substring(1,apellido2.length()).toLowerCase();
   
        
         
    
    
         char letraPrimera=nombre.charAt(0);
         char letraUltima=nombre.toUpperCase().charAt(nombre.length()-1);
         
          
        
               resultado=(letraPrimera==letraUltima)?nombre+" "+apellido1+" "+apellido2+". Es apta para el concurso":nombre+" "+apellido1+" "+apellido2+". No apta para el concurso";
        
               System.out.println(resultado);
           /* if(letraPrimera==letraUltima){
         System.out.println(nombre+" "+apellido1+" "+apellido2+". Es apta para el concurso");
         }else{
         System.out.println(nombre+" "+apellido1+" "+apellido2+". No apta para el concurso"); 
         }*/
        
    }
   
}
