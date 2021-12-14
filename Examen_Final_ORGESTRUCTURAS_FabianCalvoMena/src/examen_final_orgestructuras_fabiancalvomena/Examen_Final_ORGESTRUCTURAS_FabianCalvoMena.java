package examen_final_orgestructuras_fabiancalvomena;
import javax.swing.JOptionPane;
public class Examen_Final_ORGESTRUCTURAS_FabianCalvoMena {

   
    public static void main(String[] args) {
        int opcion = 0;
        int entero = 0;
        String palabra = "";
        String vocales = "";
        String consonantes="";
        int raiz_arbolito=0;
        int valor_minimo=0;
        int valor_maximo=0;
        int auxiliar=0;
        Ej1_Ej2 inversor = new Ej1_Ej2();
        Ej1_Ej2 contador = new Ej1_Ej2();
        arbolito arbolito = new arbolito();
        
        do
        {
          opcion = Integer.parseInt(JOptionPane.showInputDialog(null ,
                  "1:: Inversor de numeros \n"
                + "2:: Contador de vocales y consonantes \n"
                + "3:: Generar un arbol binario  \n"   
                + "4:: Terminar el programa", " Por favor seleccione un ejercicio",3));
          switch (opcion){
              case 1:
                   entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor de número para el método Inversor de Números",
                "Mensaje",1 ));
                   JOptionPane.showMessageDialog(null, "La forma invertida del número es: " + inversor.ej_1_inversornumeros(entero) + " \n");
              break;
              case 2:
                  palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra para el método Contador de vocales y consonantes",
                "Mensaje",1 );
                  vocales = consonantes = palabra;
                  JOptionPane.showMessageDialog(null, "La cantidad de vocales para " + palabra + " es " + contador.ej_2_cuentavocales(vocales.toLowerCase()) + " \n");
                  JOptionPane.showMessageDialog(null, "La cantidad de consonantes para " + palabra + " es " + contador.ej_2_cuentaconsonantes(consonantes.toLowerCase()) + " \n");
              break;
              case 3:
                   raiz_arbolito = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de la raíz del arbol para el método Generar un arbol binario",
                "Mensaje",1 ));
                   if (raiz_arbolito<10)
                   {
                       JOptionPane.showMessageDialog(null, "La raiz del arbol debe ser igual o mayor a 10 \n");
                   }
                   else
                   {
                       arbolito.agrega_raiz(raiz_arbolito);
                       valor_minimo = raiz_arbolito-10;
                       auxiliar = raiz_arbolito-1;
                       
                       do {
                           arbolito.agrega_hijo(auxiliar);
                           auxiliar = auxiliar - 1; 
                           
                       } while (auxiliar>=valor_minimo);
                       
                       valor_maximo = raiz_arbolito+10;
                       auxiliar = raiz_arbolito + 1; 
                       
                       do {
                           arbolito.agrega_hijo(auxiliar);
                           auxiliar = auxiliar + 1; 
                           
                       } while (auxiliar<=valor_maximo);
                       
                       JOptionPane.showMessageDialog(null, "En consola se visualizará el arbol binario ordenado en pre Orden \n");
                        arbolito.preOrden(arbolito.raiz_arbol);
                   }
                   
                   
              break;
              case 4:
                  JOptionPane.showMessageDialog(null, "Terminando Programa");  
              break;
              default:
                  JOptionPane.showMessageDialog(null, "Opcion Incorrecta"); 
              break;
          }
       } while (opcion != 4);
    }
    
}
