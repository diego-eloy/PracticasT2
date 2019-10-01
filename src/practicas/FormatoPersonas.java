package practicas;
import java.util.Scanner;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class FormatoPersonas {
    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
                        //VARIABLES
        //Usuario 1                
        String nombre;
        int edad;
        double altura;
        boolean carnet;
        String dni;
        //Usuario 2
        String nombre1;
        int edad1;
        double altura1;
        boolean carnet1;
        String dni1;
        //Preguntas Usuario 1
        System.out.println("ENTRADA");
        System.out.println("Dime tu Nombre y Apellido:");
        nombre=teclado.next();
        System.out.println("Dime tu Edad:");
        edad=teclado.nextInt();
        System.out.println("Dime tu Altura:");
        altura=teclado.nextDouble();
        System.out.println("Carnet de Conducir:");
        carnet=teclado.nextBoolean();
        System.out.println("Letra de DNI:");
        dni=teclado.next();
        
        
    }
    
}
