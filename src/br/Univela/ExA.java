package br.Univela;


public class ExA implements Desenho{

	@Override
	public void desenhar() {
		System.out.println("A)\n\n");
		
		for (int i = 0; i < 10; i++) { 
			for (int j = 0; j < 10; j++) {
				if(i>=j){
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}

	
}

