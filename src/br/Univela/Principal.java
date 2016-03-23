package br.Univela;

import java.util.List;
import java.util.ArrayList;

public class Principal {

	
	public static void main(String[] Args){
		
		List<Desenho> lista = new ArrayList<>();
		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
		lista.add(new ExD());
		lista.add(new ExE());
		lista.add(new ExF()); 
		lista.add(new ExG());
		lista.add(new ExH());
		lista.add(new ExI());
		lista.add(new ExJ());
		
		for(Desenho d : lista){
			d.desenhar();
		}
//		Desenho d = new Quadrado();
//		d.desenhar();
		
		
//		ExA exa = new ExA();
//		exa.desenhar();
//		
//		ExB exb = new ExB();
//		exb.desenhar();
//		
//		ExC exc = new ExC();
//		exc.desenhar();
//		
//		ExD exd = new ExD();
//		exd.desenhar();
	}
}
