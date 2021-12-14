package examen_final_orgestructuras_fabiancalvomena;

public class Ej1_Ej2 {

    
public String ej_1_inversornumeros(int numeros)
{
if(numeros>=10){
    return String.valueOf(numeros%10) + ej_1_inversornumeros(numeros/10);
} 
else{
    return String.valueOf(numeros);    
}
}

public int ej_2_cuentavocales(String palabras) 
{
if (palabras.length() == 0) 
{
    return 0;
}

if ((palabras.charAt(palabras.length() - 1)) =='a')
{
        return 1 + ej_2_cuentavocales(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='e')
{
        return 1 + ej_2_cuentavocales(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='i')
{
        return 1 + ej_2_cuentavocales(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='o')
{
        return 1 + ej_2_cuentavocales(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='u')
{
        return 1 + ej_2_cuentavocales(palabras.substring(0,palabras.length()-1));
} else {
return 0 + ej_2_cuentavocales(palabras.substring(0, palabras.length() - 1));
}
} 



public int ej_2_cuentaconsonantes(String palabras) 
{
if (palabras.length() == 0) 
{
    return 0;
}

if ((palabras.charAt(palabras.length() - 1)) =='a')
{
        return 0 + ej_2_cuentaconsonantes(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='e')
{
        return 0 + ej_2_cuentaconsonantes(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='i')
{
        return 0 + ej_2_cuentaconsonantes(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='o')
{
        return 0 + ej_2_cuentaconsonantes(palabras.substring(0,palabras.length()-1));
}
else if ((palabras.charAt(palabras.length() - 1)) =='u')
{
        return 0 + ej_2_cuentaconsonantes(palabras.substring(0,palabras.length()-1));
} else {
return 1 + ej_2_cuentaconsonantes(palabras.substring(0, palabras.length() - 1));
}
} 

}
