import java.util.Random;
import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        int saldoBase=100;
        int vidas = 3; 
        int apuestaNueva;
        int apuesta;
        int respuesta;
        int eleccion;
        int resultado;
        Random random = new Random();
        while (vidas>0) {
            System.out.println("Tu saldo es: "+saldoBase+" y te quedan "+vidas+" vidas");
            System.out.println("¿Cuánto quieres apostar? ");
            apuesta = Lectura.nextInt();
            if (apuesta > saldoBase) {
                System.out.println("No tienes suficiente saldo para hacer esa apuesta");
                break;
            }          
            saldoBase -= apuesta;
            resultado = random.nextInt(2);   
            System.out.println("Digite su eleccion 0 = Cara 1 = Sello ");
            eleccion = Lectura.nextInt();  
            if (eleccion>1) {
                System.out.println("Opción inválida");
                break;
            }             
            if (eleccion == resultado) {
                saldoBase += apuesta * 2;
                System.out.println("Ha ganado su saldo actual es: "+saldoBase);
            } else {
                vidas--;
                System.out.println("Ha perdido una vida, le quedan "+vidas+"vidas");
            }  
            if (vidas == 0) {
                if (saldoBase==0) {
                    System.out.println("Sin dinero, Ha perdido");
                }        
                System.out.println("Digite 0 si quiere volver a jugar o 1 si no lo desea");
                respuesta=Lectura.nextInt();         
                if (respuesta==0) {
                    System.out.println("Ingrese su apuesta ");
                    apuestaNueva=Lectura.nextInt();
                    if (apuestaNueva>saldoBase) {
                        System.out.println("No tiene suficiente saldo para jugar");
                        break;
                    } 
                    saldoBase-=apuestaNueva;
                    vidas=3;
                } else {
                    System.out.println("GRACIAS POR JUGAR");
                }   
                Lectura.close();
            }
        }
    }
}
