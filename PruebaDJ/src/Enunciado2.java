/*FUNCION QUE ME PERMITE CAPTURAR EN CONSOLA UN NUMERO Y ME INDICA SI LA 
SUMA DE TODOS LOS DIGITOS ELEVADOS A LA POTENCIA DE SU NUMERO DE CIFRAS ES IGUAL AL NUMERO ENTRE SI*/


/*POR LO QUE ENTENDI SERIA ASI:
 * num: 233
 * 
 * operacion: 2^3 + 3^3 + 3^3 = 62
 * 
 * por lo tanto no es igual al nunero entre si(en este caso 233)
 * */

import java.util.Scanner;

public class Enunciado2 {
	
	public static boolean Numero(int num) {
		int originalNum = num;
		int suma = 0;
		int numCifras = (int) (Math.log10(num) + 1);
		while (num != 0) {
			int cifra = num % 10;
			suma += Math.pow(cifra, numCifras);
			num /= 10;
		}
		return originalNum == suma;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un número:");
		int num = scanner.nextInt();
		if (Numero(num)) {
			System.out.println(num + " es igual al numero entre si");
		} else {														//IMPRIMO EL RESULTADO
			System.out.println(num + " no es igual al numero entre si");
		}
	}
	

}
