
package estruturadedados.FilaGenerica;

import java.util.ArrayList;

public class FilaGenarica < T >{
    
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
