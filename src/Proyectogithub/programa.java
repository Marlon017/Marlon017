package Proyectogithub;
import java.util.Scanner;
public class programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String contrase�a="123";
		String cadena="";

		for(int i=1;i<=3;i++){
			System.out.println("Contrase�a:");
			cadena=entrada.nextLine();
			if(contrase�a.equals(cadena)) {
				System.out.println("Enhorabuena");
				i=4;
			}
			if(i==3) {
				System.out.println("Usuario bloqueado");
			}
		}
		
		System.out.println("Programa finalizado");
	}
}