public class JogoDeDados {
	//Dado[] dados;
	//Dado dado2;
	public void jogar() {
		
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		//dados[0] = dado1;
		//dados[1] = dado2;
		
		dado1.lancar();
		int vf1 = dado1.obterValorDaFace();
		
		dado2.lancar();
		int vf2 = dado2.obterValorDaFace();
		
		System.out.println("O dado 1 deu " + vf1);
		System.out.println("O dado 2 deu " + vf2);
		
		int resultado = vf1 + vf2;
		
		System.out.println("O resultado do jogo foi " + resultado);
		
		if (resultado == 7) {
			System.out.println("Parabéns você ganhou!");
			
		} else {
			System.out.println("Tente outra vez!");
			
		}
			

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JogoDeDados j = new JogoDeDados();
		j.jogar();
		//jogar();
	}

}
