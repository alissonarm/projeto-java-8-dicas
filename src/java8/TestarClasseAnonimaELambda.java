package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestarClasseAnonimaELambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Editora casa do c�digo");
		palavras.add("Caelum");
		palavras.add("Alura online");

// =------------------------------------------------------------------------ 1 opcao
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		palavras.forEach(consumidor);
// =------------------------------------------------------------------------ 2 opcao	
// Classe an�nima: s�o utilizadas quando implementam interfaces curtas e n�o ser�o reutilizadas
//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s); 
//			}
//		};
//		palavras.forEach(consumidor);
// =------------------------------------------------------------------------ 3 opcao 	 	
//Classe an�nima e j� instanciando dentro do forEach
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s); 
//			}
//		});
// =------------------------------------------------------------------------ 4 opcao
//      utiliza��o do lambda
		palavras.forEach((String s) -> System.out.println(s));
		System.out.println("----------------------------");
		palavras.forEach( s -> System.out.println(s)); // para cada palavra s fa�a o system

	}

}
