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
        
        final double EUR_DOLLAR = 1.09;
        final double EUR_YENS = 118.01;
        final double EUR_LIBRA = 0.89;
        
        System.out.printf("Tendrias: %.2f dollars\n",EUR_DOLLAR*euro);
        System.out.printf("Tendrias: %.2f yens\n",EUR_YENS*euro);
        System.out.printf("Tendrias: %.2f libras\n",EUR_YENS*euro);
    }
    
}
