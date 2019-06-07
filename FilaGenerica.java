/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.FilaGenerica;

import java.util.ArrayList;

/**
 *
 * @author nathalia
 */
class FilaGenerica<T> {
    
     private ArrayList < T > objetos = new ArrayList< T >();
   
    public void insere( T t){
        objetos.add(t);
    }

    public T remove( ){
       return objetos.remove(0);
    }
    
    public T get(int i){
      return objetos.get(i);
   }
    public boolean vazia(){
        return objetos.isEmpty();
    }
    
    public int tamanho(){
        return objetos.size();
    }
    
}
