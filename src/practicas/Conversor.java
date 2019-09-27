package practicas;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Conversor {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double euro;

        System.out.println("Dime los Euros que quieres cambiar: \n");
        euro=teclado.nextDouble();
        
        final double dollar = 1.09;
        final double yens = 118.01;
        final double libra = 0.89;
        
        System.out.printf("Tendrias: %.2f dollars\n",dollar*euro);
        System.out.printf("Tendrias: %.2f yens\n",yens*euro);
        System.out.printf("Tendrias: %.2f libras\n",libra*euro);
    }
    
}
