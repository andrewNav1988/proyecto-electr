
package electrodomesticos;
import electrodomesticos.Electrodomesticos;
import electrodomesticos.Lavadora;
import electrodomesticos.Television;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        char art;
        String color1;
        
        System.out.println("Indique que articulo desea verificar: \n 1) lavadora \n 2) Television");
        art = entrada.next().charAt(0);
        
        switch (art) {
            case '1': // Lavadora
                Lavadora lav1 = new Lavadora();
                System.out.println("Ingrese la letra del consumo energetico que quiere consultar entre A y F:");
                art = entrada.next().charAt(0);
               
                lav1.ComprobarConsumoEnergetico(art);
                
                
                System.out.println("Ingrese un color: ");
                color1 = entrada.next();
                
                int peso1;
                System.out.println("Ingrese el peso en kg que desea consultar: ");
                peso1 = entrada.nextInt();
                
                lav1.comprobarTamano(peso1);
                
                System.out.println("El total de su consumo es: ");
                int total = lav1.getPrecioBase() + lav1.getPrecioCategoria() + lav1.getPrecioTamano();
                
                System.out.println(total);
               
                break;
                
            case '2': // Television
                
                int pulgadas;
                
                System.out.println("Ingrese el valor en pulgadas de la resolución de su televisor:  ");
                pulgadas = entrada.nextInt();
                
                Television tv1 = new Television();
                tv1.setResolucion(pulgadas);
                int respuesta;
                
                System.out.println("Tiene sintonizador? marca: \n 1) si \n 2) no");
                respuesta = entrada.nextInt();
                
                if (respuesta == 1) {
                    tv1.setSintonizadorTdt(true);
                }
                
                tv1.PrecioFinal();
                
                
                
                
                 break;
                 
          
                 
            default: 
                System.out.println("La opcion que digito no es correcta");
                
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
