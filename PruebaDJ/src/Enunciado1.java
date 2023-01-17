/*DADO UN ARRAY DE NUMEROS ENTEROS ORDENADOS Y SIN REPETIR, CREAR UNA DUNCION QUE CALCULE
 * Y RETORNE TODOS LOS NUMEROS QUE FALTEN ENTRE EL MAYOR Y EL MENOR Y LANZAR UN ERROR SI EL ARRAY NO ES CORRECTO*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enunciado1 {
	
	public static int[] numerosFaltantes(int[] arr) throws IllegalArgumentException {
		
			if (arr == null || arr.length == 0) { // ARRAY NULO O VACIO
				throw new IllegalArgumentException("El array de entrada no es correcto");//ARROJARA EL ERROR SI LA MATRIZ ESTA VACIA 
			}
			int min = arr[0];
			int max = arr[0];
			for (int i = 1; i < arr.length; i++) { //ENCUENTRA EL VALOR MINIMO Y MAXIMO EN EL ARRAY 
				if (arr[i] < min) {
					min = arr[i];
				}
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			List<Integer> faltantes = new ArrayList<>();
			for (int i = min; i < max; i++) { //ENCUENTRA LOS NUMEROS FALTANTES
				if (!contiene(arr, i)) {
					faltantes.add(i);
				}
			}
			return faltantes.stream().mapToInt(i -> i).toArray();
	}

	
		private static boolean contiene(int[] arr, int num) {
			for (int i : arr) {
				if (i == num) {
					return true;
				}
			}
			return false;
		}

		public static void main(String[] args) {
			int[] arr = { 1, 3, 5, 7, 8, 9,10,11,14 };//RELLENAMOS LA MATRIZ POR CODIGO DURO
			int[] faltantes = numerosFaltantes(arr);
			
			System.out.println("Array");
			for (int n : arr) {
			     System.out.println(n); 
			}								//IMPRIMO EL RESULTADO
			
			System.out.println("Faltantes");
			for (int i : faltantes) {
				System.out.print(i + " ");
			}
		}
		
}
