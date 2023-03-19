import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        Scanner Lectura=new Scanner(System.in);
        String nombe="0",nombp,nombc;
        int cantp,total=0,precp;
        System.out.print("Ingrese por favor el nombre del empleado ");
        nombe=Lectura.next();

        for(int i=1;i==1;i++){
        if(nombe.equals("Jon")){
            System.out.println("Ingrese por favor el nombre del cliente: ");
            nombc=Lectura.next();
            System.out.println("Ingrese por favor el nombre del producto: ");
            nombp=Lectura.next();
            System.out.print("Ingrese por favor la cantidad de productos: ");
            cantp=Lectura.nextInt();
            System.out.println("Ingrese por favor el precio del producto: ");
            precp=Lectura.nextInt();
            total=(cantp*precp);
            System.out.println("el nombre del empleado es. " +nombe);
            System.out.println("el nombre de su cliente es: " +nombc);
            System.out.println("el nombre de su  producto es: " +nombp);
            System.out.println("la cantidad de su compra es: " +cantp);
            System.out.println("el total de su compra es: " +total);
            break;
            }
                
            else if(nombe.equals("Juan")){
                System.out.println("Ingrese por favor el nombre del cliente: ");
                nombc=Lectura.next();
                System.out.println("Ingrese por favor el nombre del producto: ");
                nombp=Lectura.next();
                System.out.println("Ingrese por favor la cantidad de productos: ");
                cantp=Lectura.nextInt();
                System.out.println("Ingrese por favor el precio del producto: ");
                precp=Lectura.nextInt();
                total=(cantp*precp);
                System.out.println("el nombre del empleado es. " +nombc);
                System.out.println("el nombre de su cliente es: " +nombe);
                System.out.println("el nombre de su  producto es: " +nombp);
                System.out.println("la cantidad de su compra es: " +cantp);
                System.out.println("el total de su compra es: " +total);
                break;
                }
                else if(nombe.equals("Maria")){
                    System.out.println("Ingrese por favor el nombre del cliente: ");
                    nombe=Lectura.next();
                    System.out.println("Ingrese por favor el nombre del producto: ");
                    nombp=Lectura.next();
                    System.out.print("Ingrese por favor la cantidad de productos: ");
                    cantp=Lectura.nextInt();
                    System.out.println("Ingrese por favor el precio del producto: ");
                    precp=Lectura.nextInt();
                    total=(cantp*precp);
                    System.out.println("el nombre del empleado es. " +nombe);
                    System.out.println("el nombre de su cliente es: " +nombe);
                    System.out.println("el nombre de su  producto es: " +nombp);
                    System.out.println("la cantidad de su compra es: " +cantp);
                    System.out.println("el total de su compra es: " +total);
                    break;
                } 
            }  
                System.out.println("No se encuentra registrado");
                System.out.println("Registrese por favor");
                nombc=Lectura.next();
                System.out.println();
                    System.out.println("Ingrese por favor el nombre del cliente: ");
                    nombe=Lectura.next();
                    System.out.println("Ingrese por favor el nombre del producto: ");
                    nombp=Lectura.next();
                    System.out.println("Ingrese por favor la cantidad de productos: ");
                    cantp=Lectura.nextInt();
                    System.out.println("Ingrese por favor el precio del producto: ");
                    precp=Lectura.nextInt();
                    total=(cantp*precp);
                    System.out.println("el nombre del empleado es. " +nombc);
                    System.out.println("el nombre de su cliente es: " +nombe);
                    System.out.println("el nombre de su  producto es: " +nombp);
                    System.out.println("la cantidad de su compra es: " +cantp);
                    System.out.println("el total de su compra es: " +total);
                    }
            //Lectura.close();
            }

        
