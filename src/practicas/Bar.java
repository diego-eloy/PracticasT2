package practicas;

/**
 *
 * @author Diego_Eloy DAM 1
 */
import java.util.Scanner;
public class Bar {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                //Variables
                double bebidas;
                int bocatas;
                
                
                
        System.out.println("Entrada-->");
        System.out.println("Numero de bebidas: ");
        bebidas=teclado.nextInt();
        System.out.println("Numero de bocatas: ");
        bocatas=teclado.nextInt();
        double factura=((bebidas*1.25)+(bocatas*2));
        System.out.println("Salida-->");
        System.out.printf("Coste de las bebidas: %s\n",bebidas*1.25);
        System.out.printf("Coste de los bocatas: %s\n",bocatas*2);
        System.out.printf("Coste de consumicion: %s\n",factura);
        
        
        
        
        
    }
    
    
}
