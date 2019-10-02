package practicas;

/**
 *
 * @author Dieguito
 */
import java.util.Scanner;
public class Circuferencia {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Entrada-->");
        System.out.println("Escribe un radio entero:");
        int radio= teclado.nextInt();
        System.out.println("Salida-->");
        final double pi=((2*3.14)*radio);
        System.out.printf("Longitud de la circuferencia: %.2f\n",pi);
        final double area=(radio*radio)*3.14;
        System.out.printf("Area de un circulo: %.2f\n",area);
    }
}
