package practicas;

import java.util.Scanner;

/**
 * 
 * @author Diego_Eloy DAM 1
 */
public class Factura {
    
    public static void main(String[]args){
        
        //Aqui declaramos las dos variables que nos pide
        int precio;
        Scanner teclado = new Scanner(System.in);
        final double iva=0.21;
        System.out.println("Introduce el precio del que quieres calcular la factura");
        precio = teclado.nextInt();
        
        System.out.printf("El precio con IVA es: %.2f\n",precio+(precio*iva));
        System.out.printf("El precio con IVA es: %d\n",precio);
        
        
        
    }
    
    
    
    
    
}
