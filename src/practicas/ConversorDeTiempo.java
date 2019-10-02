package practicas;

/**
 *
 * @author Diego_Eloy DAM 1
 */
import java.util.Scanner;
public class ConversorDeTiempo {
   
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Entrada-->");
        System.out.println("Numero de segundos:");
        int tiempo;
        tiempo=teclado.nextInt();
        
        int h=tiempo/3600;
        int m=tiempo%3600;
        int minutos;
        minutos=m/60;
        int s=m%60;
        
        System.out.println("Salida-->");
        System.out.printf("Horas: %d\n",h);
        System.out.printf("Minutos: %d\n",minutos);
        System.out.printf("Segundos: %d\n",s);

    }
    
}
