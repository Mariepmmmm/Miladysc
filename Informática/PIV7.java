
package piv7;

import java.util.Scanner;

/**
 *
 * @author Marie Maldonado
 */
public class PIV7 {
    public static void main(String[] args) {
        double valor, descuento, recargo, total;
    String tipo_pago;
    Scanner Entrada = new Scanner(System.in);
    System.out.println("escriba el valor de la compra: ");
    valor = Entrada.nextDouble();
    System.out.println("Ingrese tipo de paga: ");
    tipo_pago= Entrada.next();
    descuento=0.05*valor;
    recargo=0.03*valor;
    if (tipo_pago.equalsIgnoreCase("contado")) {
    System.out.println("El descuento es: " + descuento);
    total= valor - descuento;
    System.out.println("El total es: " + total);
    }
    else if (tipo_pago.equalsIgnoreCase("tarjeta")){
    System.out.println("El recargo es: " + recargo); 
    total= valor + recargo;
    System.out.println("El total es: " + total);
    }
    else {
    System.out.println("metodo de pago invalido");    
    }
    }
    }
    

