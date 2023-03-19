import java.util.Scanner;
public class Reto4{
	public static void main(String args[]){
		System.out.println("Cara o Sello");
		Scanner Lectura = new Scanner(System.in);
        int apu=1000;
		int sel = (int)(Math.random() * 2) + 1;
		System.out.println("La computadora ");
		System.out.println("Si elije Cara digite 1 ");
        System.out.println("Si elije Sello digite 2 ");
		int selUs = Lectura.nextInt();
		System.out.println("Digite su apuesta, debe ser mayor que 1000 ");
		apu= Lectura.nextInt();
		System.out.print("La computadora ya elijio ");
		if (apu<1000) System.out.println("Usted no puede jugar");
		else{
		switch ( sel ){
			case 1:
				System.out.println("Cara");
				switch ( selUs ){
					case 1: System.out.println("Usted gana "+ (apu+1000)); 
					break;
					case 2: System.out.println("Usted Pierde "+ (apu-1000)); 
					break;
				}
				break;
			case 2:
				System.out.println("Sello");
				switch ( selUs ){
					case 1: System.out.println("Usted Pierde "+ (apu-1000)); 
					break;
					case 2: System.out.println("Usted gana "+ (apu+1000)); 
					break;
				}
				break;
		}
        Lectura.close();
	}
}
}