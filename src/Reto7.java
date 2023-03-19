import java.util.Random;
import java.util.Scanner;

public class Reto7 {
    public static void main(String[] args) {
        int saldoBase = 100; 
        int vidas = 3; 
        int apuesta;
        int eleccion;
        int resultado;
        int respuesta;
        int apuestaNueva;
        Scanner Lectura = new Scanner(System.in);
        Random random = new Random();
        while (vidas>0) {
            System.out.println("Su saldo es "+saldoBase+" y le quedan "+vidas+" vidas");
            System.out.print("Digite su apuesta ");
            apuesta=Lectura.nextInt(); 
            if (apuesta > saldoBase) {
                System.out.println("No tiene suficiente saldo para jugar");
                break;
            }
            saldoBase -= apuesta;
            eleccion = 0;
            do {
                System.out.print("Digite 0 si es piedra, 1 si es papel o 2 si es tijera");
                eleccion = Lectura.nextInt();
            } while (eleccion != 0 && eleccion != 1 && eleccion != 2);

            resultado = random.nextInt(3);
            System.out.println("La computadora ya eligió ");

            if ((eleccion == 0 && resultado == 2) && (eleccion == 1 && resultado == 0) && (eleccion == 2 && resultado == 1)) {
                saldoBase += apuesta * 2;
                System.out.println("Has ganado su saldo actual es " + saldoBase);

            } else if (eleccion == resultado) {
                System.out.println("Empate su saldo actual es " + saldoBase);

            } else {
                vidas--;
                System.out.println("Has perdido una vida le quedan "+vidas+" vidas");
            }    

            if (vidas == 0) {
                if (saldoBase == 0) {
                    System.out.println("Sin dinero, Ha perdido");
                }    
                System.out.print("Digite 0 si quiere jugar y 1 si no lo desea");
                respuesta = Lectura.nextInt();  
                 
                if (respuesta == 0) {
                    System.out.print("Ingrese su apuesta ");
                    apuestaNueva = Lectura.nextInt();    
                    if (apuestaNueva > saldoBase) {
                        System.out.println("No tiene suficiente saldo para jugar");
                    }       
                    saldoBase -= apuestaNueva;
                    vidas = 3;
                } else {
                    System.out.println("GRACIAS POR JUGAR");
                }
                Lectura.close();
            }
        }
    }
}
