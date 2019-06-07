
package estruturadedados;

import static java.lang.System.in;
import java.util.HashMap;
import java.util.Scanner;


public class Arvore {
    
public static void main(){
        
    HashMap<Integer,String> minhaHash = new HashMap<Integer,String>();
    Scanner ler = new Scanner(in);   
   
    for(int i=0;i<10;i++){
    
    System.out.println("Informa um nome:");
        
    minhaHash.put( i , ler.next() ); 
           
    }
    
    for(int i=0;i<10;i++){
        
     System.out.println(minhaHash.get(i));
    }

    System.out.println("  " + minhaHash);


}
    
 }
