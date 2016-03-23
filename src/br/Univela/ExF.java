package br.Univela;

public class ExF implements Desenho{

	public static int SIZE = 9;
	
	@Override
	public void desenhar() {
		System.out.println("F)\n\n");
		
//		int brancos = 9;
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if(linha == 0){
					System.out.print("*");
				}else{
					if(linha == coluna){
						System.out.print("*");
					}else{
						if(linha == SIZE-1){
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}
				}
				if(coluna == SIZE-1){
					System.out.println("");
				}
			}
			
		}
	}

}
