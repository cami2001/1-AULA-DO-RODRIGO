
public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("julia", 16, 1,65 );
		
		pessoa1.setIdade(17);
		System.out.println("A pessoa " + pessoa1.getNome() + " foi cadastrado com sucesso.");
	}

}
