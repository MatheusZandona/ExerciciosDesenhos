package br.Univela;


public class ExJ implements Desenho{

	// vai cair na prova !!!!
	public static int SIZE = 12;
	
	@Override
	public void desenhar() {
		System.out.println("J)\n\n");

		
		for (int linha = 0; linha <= (SIZE / 2); linha++) { 
			for (int coluna = SIZE; coluna >= 0; coluna--) {
				if(coluna > linha && coluna < SIZE - linha ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
		
	}

}
