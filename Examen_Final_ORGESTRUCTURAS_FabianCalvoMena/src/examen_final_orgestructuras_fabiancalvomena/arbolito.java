package examen_final_orgestructuras_fabiancalvomena;
public class arbolito {
     nodo_arbolito raiz_arbol ; 
     
    public arbolito()
    {
        raiz_arbol = null;
    }

     public boolean estaVacio(){
           return raiz_arbol == null;
    }
    public void preOrden (nodo_arbolito recorrer)
    {
        if (recorrer != null){
            System.out.println(recorrer.dato);
            preOrden (recorrer.hijoizquierdo);
            preOrden(recorrer.hijoderecho);
        }
    }
    
    public void agrega_raiz (int dato_nuevo)
    {
        nodo_arbolito nuevo = new nodo_arbolito (dato_nuevo);
        if (raiz_arbol == null){
            raiz_arbol = nuevo;
        }
    }
    
    public void agrega_hijo (int dato_nuevo)
    {
        nodo_arbolito nuevo = new nodo_arbolito (dato_nuevo);
        if (raiz_arbol == null){
            raiz_arbol = nuevo;
        }
        else
        {
            nodo_arbolito auxiliar =  raiz_arbol;
            nodo_arbolito padre;
            while (true)
            {
                padre = auxiliar;   
                if (dato_nuevo < auxiliar.dato)
                {
                    auxiliar = auxiliar.hijoizquierdo;
                    if (auxiliar == null)
                    {
                     padre.hijoizquierdo = nuevo;
                     return;
                    }
                }else 
                  {
                     auxiliar = auxiliar.hijoderecho;
                     if (auxiliar == null)
                      {
                         padre.hijoderecho = nuevo;
                         return;
                      }
                  } 
            }
        }
    }
   
}
