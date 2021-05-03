package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Editora casa do c�digo");
		palavras.add("Caelum");
		palavras.add("Alura online");

		// Compara��o Natural - definida dentro OrdenaStrings.javada classe String para ordena��o
		Collections.sort(palavras);
		System.out.println(palavras);

		// Utiliza o crit�rio de ordena��o definido em ComparadorPorTamanho
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);

		palavras.sort(comparador);
		System.out.println(palavras);

		// para cada String p dentro de palavras fa�a
		for (String p : palavras) {
			System.out.println(p);
		}

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
		palavras.forEach( s -> System.out.println(s)); // para cada palavra s fa�a o system

	}

}
