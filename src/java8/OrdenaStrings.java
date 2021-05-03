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
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		palavras.add("Alura online");

		// Comparação Natural - definida dentro OrdenaStrings.javada classe String para ordenação
		Collections.sort(palavras);
		System.out.println(palavras);

		// Utiliza o critério de ordenação definido em ComparadorPorTamanho
		Comparator<String> comparador = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador);
		System.out.println(palavras);

		palavras.sort(comparador);
		System.out.println(palavras);

		// para cada String p dentro de palavras faça
		for (String p : palavras) {
			System.out.println(p);
		}

// =------------------------------------------------------------------------ 1 opcao
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		palavras.forEach(consumidor);
// =------------------------------------------------------------------------ 2 opcao	
// Classe anônima: são utilizadas quando implementam interfaces curtas e não serão reutilizadas
//		Consumer<String> consumidor = new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s); 
//			}
//		};
//		palavras.forEach(consumidor);
// =------------------------------------------------------------------------ 3 opcao 	 	
//Classe anônima e já instanciando dentro do forEach
//		palavras.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String s) {
//				System.out.println(s); 
//			}
//		});
// =------------------------------------------------------------------------ 4 opcao
//      utilização do lambda
		palavras.forEach((String s) -> System.out.println(s));
		palavras.forEach( s -> System.out.println(s)); // para cada palavra s faça o system

	}

}
