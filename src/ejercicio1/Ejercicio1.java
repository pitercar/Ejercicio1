/*
Calcular el volumen y el área de un cubo
 */
package ejercicio1;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio1 {

    private int lado, volumen, area;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite el lado del cubo... ");
        lado=entrada.nextInt();        
    }
    
    public void calcularArea(){
        
        volumen=(int)Math.pow(lado, 3);
        System.out.println("El volumen del cubo es "+volumen);        
    }
}
