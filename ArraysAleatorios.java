package Calculadora;

public class ArraysAleatorios {
	public static void main(String[] args) {
		int[] array = new int[20];
		int veces = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random()*10));
		}
		
		mostrarArray(array);
		
		for(int i = 0; i < array.length; i++) {
			veces = contar(array, i);
			System.out.println("El numero " + array[i] + " aparece " + veces + " veces.");
			veces = 0;
		}
		
	}
	
	public static void mostrarArray(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1]);
	}
	
	public static int contar(int[] array, int num) {
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == array[num]) {
				count++;
			}
		}
		return count;
	}
}
