import java.util.Random;

public class Dado {
	
	

	private int valorDaFace;

	public void lancar() {
		
		// Usar o Random para gerar o valor da face de forma aleat�ria
		// implementar geracao aleatoria de um numero de 1 a 6
		Random r = new Random();
		valorDaFace = r.nextInt(5) + 1;
		//System.out.println(valorDaFace);

	}

	/**
	 * Quando o usuário lançar o dado, um algorítmo randômico irá gerar um número aleatório para obter o valor da face do dado entre 1 e 6
	 */
	public int obterValorDaFace() {
		return valorDaFace;
	}

}
