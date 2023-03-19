import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        try (Scanner Lectura=new Scanner (System.in)){
            String Medico;
            String Mama;
            String Bebe;
            double Peso=0;   
            System.out.println("Digite el nombre del Medico");
            Medico= Lectura.next(); 
            System.out.println("Digite el nombre de la Mamá");
            Mama= Lectura.next(); 
            System.out.println("Digite el nombre de la Bebe");
            Bebe= Lectura.next();  
            System.out.println("Digite el peso del Bebe");
            Peso= Lectura.nextInt();     
            System.out.println("Nombre del Medico:" + Medico);       
            System.out.println("Nombre de la Madre:" + Mama);       
            System.out.println("Nombre del Bebe:" + Bebe);
            if (1 <= Peso ) System.out.println("El bebe cuenta con 1 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(1 * 10)*8);
            else

            if(2 <= Peso) System.out.println("El bebe cuenta con 2 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(2 * 10)*8);
            else

            if(3 <= Peso) System.out.println("El bebe cuenta con 3 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(3 * 10)*8);
            else

            if(4 <= Peso) System.out.println("El bebe cuenta con 4 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(4 * 10)*8);
            else

            if(5 <= Peso) System.out.println("El bebe cuenta con 5 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(5 * 10)*8);
            else

            if(6 <= Peso) System.out.println("El bebe cuenta con 6 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(6 * 10)*8);
            else
            
            if(7 <= Peso) System.out.println("El bebe cuenta con 7 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(6* 10)*8);
            else

            if(8 <= Peso) System.out.println("El bebe cuenta con 8 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(8 * 10)*8);
            else 

            if(9 <= Peso) System.out.println("El bebe cuenta con 9 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(9 * 10)*8);
            else
           
            if(10 <= Peso) System.out.println("El bebe cuenta con 10 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(10 * 10)*8);
            else 
            
            if(11 <= Peso) System.out.println("El bebe cuenta con 11 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(11 * 10)*8);
            else
           
            if(12 <= Peso) System.out.println("El bebe cuenta con 12 mes de nacido, La dosis necesaria para el bebe en ML es de"+(Peso + 15)/(12 * 10)*8);
        

}
}
}