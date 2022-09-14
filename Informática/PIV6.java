
package piv6;

import java.util.Scanner;

/**
 *
 * @author Marie Maldonado
 */
public class PIV6 {
    public static void main(String[] args) {
        String nombre, clave;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        nombre = Entrada.nextLine(); 
        System.out.println("Ingrese clave de usuario");
        clave = Entrada.nextLine();
        if(nombre.equals("Jorge") && clave.equals("654321")){
        System.out.println("bienvenido al Sistema");
        }
        else{
        System.out.println("nombre del usuario o contraseña incorrecta");    
        }
}
    }
    

