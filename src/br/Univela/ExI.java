package br.Univela;


public class ExI implements Desenho{

	public static int SIZE=9;
	
	@Override
	public void desenhar() {
		System.out.println("I)\n\n");
		
		int brancos = SIZE;
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if(linha == 0 || linha == (SIZE -1)){ 
					System.out.print("*");
				}else{
					if((coluna == (SIZE-1)) || (linha == coluna) || (coluna == brancos-1) || (coluna == 0)){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			brancos--;
			System.out.println("");
		}
	}

}
