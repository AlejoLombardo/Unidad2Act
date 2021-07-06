/**
 *
 * @author alejo
 */
import java.util.Scanner;
//nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza
public class actividad {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su hobbie: ");
        String hobbie = scanner.next();
        System.out.println("Ingrese su editor de codigo preferido: ");
        String editor = scanner.next();
        System.out.println("Ingrese su sistema de operativo favorito: ");
        String sistemaop = scanner.next();
        
        System.out.println("Me llamo "+nombre+" "+apellido+" tengo "+edad+" años, mi hobbie es "+hobbie+". Mi editor de codigo favorito es "+editor+" y mi sistema operativo es "+sistemaop+".");
    }
    
}
