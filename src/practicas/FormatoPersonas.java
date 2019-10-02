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
        System.out.println("Usuario1");
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
        
        //Preguntas Usuario 2
        System.out.println("Usuario2");
        System.out.println("Dime tu Nombre y Apellido:");
        nombre1=teclado.next();
        System.out.println("Dime tu Edad:");
        edad1=teclado.nextInt();
        System.out.println("Dime tu Altura:");
        altura1=teclado.nextDouble();
        System.out.println("Carnet de Conducir:");
        carnet1=teclado.nextBoolean();
        System.out.println("Letra de DNI:");
        dni1=teclado.next();
        
        
        System.out.println("SALIDA");
        System.out.println("Nombre \t\t Edad\t Altura\t Carnet\t Letra\n");
        System.out.println("================  ==== \t ====== \t ===== \t ===== ");
        System.out.printf("%s \t %d \t /d \t %b \t %c\n",nombre,edad,altura,carnet,dni);
        System.out.printf("%s \t %d \t /d \t %b \t %c\n",nombre,edad,altura,carnet1,dni);
    }
    
}
