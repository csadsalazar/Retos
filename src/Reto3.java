import java.util.Scanner;
public class Reto3{
	public static void main(String args[]){
		System.out.println("Juego de piedra, papel o tijera");
		Scanner Lectura = new Scanner(System.in);
		int apu=1000;
		int selUs;	
		int sel = (int)(Math.random() * 3)+1;
		System.out.println("La computadora ");
		System.out.println("Si saca Piedra digite 1");
        System.out.println("Si saca Papel digite 2");
        System.out.println("Si saca Tijera digite 3");
		selUs = Lectura.nextInt();
        System.out.println("Digite su apuesta, debe ser mayor que 1000 ");
		apu= Lectura.nextInt();
		System.out.print("La computadora ya eligio ");
		if (apu<999) System.out.println("Usted no puede jugar");
		else{
		switch ( sel ){
			case 1:
				System.out.println("Piedra");
				switch ( selUs ){
					case 1: System.out.println("Empate"); 
					break;
					case 2: System.out.println("Usted gana "+ (apu+1000)); 
					break;
					case 3: System.out.println("Usted Pierde" + (apu-1000)); 
					break;
				}
				break;
			case 2:
				System.out.println("Papel");
				switch ( selUs ){
					case 1: System.out.println("Usted Pierde "+ (apu-1000)); 
					break;
					case 2: System.out.println("Empate"); 
					break;
					case 3: System.out.println("Usted gana "+ (apu+1000));
					 break;
				}
				break;
			case 3:
				System.out.println("Tijera");
				switch ( selUs ){
					case 1: System.out.println("Usted gana "+ (apu+1000)); 
					break;
					case 2: System.out.println("Usted Pierde "+ (apu-1000)); 
					break;
					case 3: System.out.println("Empate"); 
					break;
				}
				break;
				default: System.out.println("Usted no ha escogido correctamente o su apuesta esta mal hecha");
                break;		
		}
        Lectura.close();
	}
}
}