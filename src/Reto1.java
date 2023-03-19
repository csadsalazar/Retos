import java.util.Scanner;
public class Reto1 {
public static void main(String[] args) {
    try (Scanner Lectura=new Scanner (System.in)){
        double GradosC=0;
        double GradosK=0; 
        int Torta=0;
        System.out.println("Digite la Temperatura");
        GradosC= Lectura.nextInt(); 
        System.out.println("Digite la Cantidad de Tortas");
        Torta= Lectura.nextInt(); 
        GradosK= GradosC+273.15;
        double Harina=(0.13*10)*Torta;
        System.out.println("La Temperatura es" + GradosK + "grados Kelvin"); 
        System.out.println("La Harina necesaria para la(s) torta(s) es de" + Harina + "Kilogramos");     
}
}
}