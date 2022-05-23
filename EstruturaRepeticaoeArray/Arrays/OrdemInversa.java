package Arrays;

public class OrdemInversa {
	public static void main(String[] args) {
		
		int[] vetor = {5, 12, 18, 23, 32, 45};
		
		System.out.println("Vetor: ");
		int count = 0;
		while (count < (vetor.length)) {
			System.out.println(vetor[count] + " ");
			count++;
		}
		
		System.out.println("\nVetor: ");
		for(int i = (vetor.length - 1); i >= 0; i --) {
			System.out.println(vetor[i] + " ");
		}
		
	}
}
