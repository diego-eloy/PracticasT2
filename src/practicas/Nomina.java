package practicas;
/**
 *
 * @author Diego_Eloy DAM 1
 */

import java.util.Scanner;
public class Nomina {
    
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        double sueldo;
        int pagas;
        System.out.printf("Dime tu Sueldo Bruto \n");
        sueldo= teclado.nextDouble();
        System.out.printf("Dime el Numero de Pagas \n");
        pagas = teclado.nextInt();
        
        
        double salarioBrutoAnual= sueldo; //Mi sueldo Bruto al año(osea que no le he quitado las retenciones)
        final double retencion=0.15;
        double salarioNetoAnual=salarioBrutoAnual-(salarioBrutoAnual*retencion);//Esto es lo que me llevo limpio al año
        double salarioBrutoMensual=salarioBrutoAnual/pagas;//Lo que te pagan al año sin quitarle la retencion / las pagas 
        double salarioNetoMensual=salarioNetoAnual/pagas;//Lo que cobro limpio al año entre las pagas
               
        System.out.printf("El Salario Bruto Anual es: %.2f \n",salarioBrutoAnual);
        System.out.printf("El Salario Neto Anual es: %.2f \n",salarioNetoAnual);
        System.out.printf("El Salario Bruto Mensual es: %.2f \n",salarioBrutoMensual);
        System.out.printf("El Salario Neto Mensual es: %.2f \n",salarioNetoMensual);

        
        
        
    }
    
    
}
