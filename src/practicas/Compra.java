package practicas;

/**
 *
 * @author Dieguito
 */
import java.util.Scanner;
public class Compra {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Entrada-->");
        System.out.printf("Valor de la compra (entre 0.00 y 500.00):");
        double compra=teclado.nextDouble();
        System.out.printf("IVA (entre 0 y 25): ");
        int iva=teclado.nextInt();
        
        double op1=(compra*iva)/100;
        double op2=compra-op1;
        System.out.println("Salida-->");
        System.out.printf("Compra: \t\t %.2f \n",op2);
        System.out.printf("IVA: \t %.2f\n",op1);
        System.out.println("\t =====");
        System.out.printf("\t %.2f\n",op1+op2);
        
    }
}
