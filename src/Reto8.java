import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        int n;
        String est;

        System.out.println("Digite el nombre del estudiante");
        est=Lectura.next();
        
        if (est.equals("Cesar")) {
            System.out.println("Usted ya se ha registrado a algun auxilio");
        } else {  
        System.out.println("Digite a que subcidio quiere registrarse");
        System.out.println("Digite 0 para subsidio de tranporte");
        System.out.println("Digite 1 para subsidio de alimentacion");
        System.out.println("Digite 2 para apoyo de sostenimiento regular");
        System.out.println("Digite 3 para apoyo de sostenimiento FIC");
        System.out.println("Digite 4 para el apoyo digital - Plan de datos");
        n=Lectura.nextInt();

        if(n==0){
        System.out.println("Se ha registrado al auxilio de transporte");
        } else if (n==1){
        System.out.println("Se ha registrado al auxilio de alimentacion");
        } else if (n==2){
        System.out.println("Se ha registrado al auxilio de sostenimiento regular");
        } else if (n==3){
        System.out.println("Se ha registrado al auxilio de sostenimiento FIC");
        } else if (n==4){
        System.out.println("Se ha registrado al auxilio de apoyo digital - Plan de datos");
        } else {
        System.out.println("Ha digitado un valor incorrecto");    
        } 
        }
        Lectura.close();
    }
}

