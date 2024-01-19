package logicadeprogramacao;

public class EstruturaDeDecisao {

	public static void main(String[] args) {
	String nome = "João Roberto";
	int idade = 22;
	char sexo = 'M';
	
	if (sexo == 'M' && idade >= 18) {
		System.out.println("Alistamento militar obrigatório!");
	}
	
	else {
		System.out.println("Não é necessário se alistar.");
	
	}
	
	System.out.println("__________________________________");
	
	if (sexo == 'M') {
		if (idade >= 18) {
			System.out.println("Alistamento obrigatório!");
			
		}
		
		else {
			System.out.println("Você não tem a idade necessária.");
			
		}
		
	}
		else {
			System.out.println("É preciso ser do sexo masculino para"
					+ "com obrigatoriedade!");
		}
	}

	}


