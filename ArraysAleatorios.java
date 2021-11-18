package Calculadora;

public class ArraysAleatorios {
	public static void main(String[] args) {
		int[] array = new int[20];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = ((int) (Math.random()*10));
		}
		
		mostrarArray(array);
	}
	public static void mostrarArray(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println(array[array.length - 1]);
	}

}
