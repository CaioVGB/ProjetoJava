package logicadeprogramacao;

public class Atrbuicoes {

	public static void main(String[] args) {
		int numero = 10;
		System.out.println("Número = " + numero);
		System.out.println("Soma += 5 | Soma = " + (numero +=5));
		System.out.println("Subtração -= 5 | Multiplicação = " + (numero -=5));
		System.out.println("Multiplicação *= 5 | Multiplicação = " + (numero *=5));
		System.out.println("Divisão /= 5 | Divisão = " + (numero/=5));
		System.out.println("_________________________________________________");
		
		numero++;
		System.out.println("Número = " + numero);
		
		numero--;
		System.out.println("Número = " + numero); 

	}

}
