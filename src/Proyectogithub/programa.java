package Proyectogithub;
import java.util.Scanner;
public class programa {
//Estoy editando el archivo.java desde github
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String contraseña="123";
		String cadena="";

		for(int i=1;i<=3;i++){
			System.out.println("Contraseña:");
			cadena=entrada.nextLine();
			if(contraseña.equals(cadena)) {
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
