package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestarOrdenaStringsComparator {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		palavras.add("Alura online");

		// Comparação Natural - definida dentro OrdenaStrings.javada classe String para
		// ordenação
//		Collections.sort(palavras);
//		System.out.println(palavras);

//      Utiliza o critério de ordenação definido em ComparadorPorTamanho
//		Comparator<String> comparador = new ComparadorPorTamanho();
//		Collections.sort(palavras, comparador);
//		System.out.println(palavras);

// --------------------------------------------------------------------------------		
//		palavras.sort(comparador);
//		System.out.println(palavras);
// --------------------------------------------------------------------------------
//		palavras.sort(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//			}
//		});
//		System.out.println(palavras);		
// --------------------------------------------------------------------------------
//		palavras.sort((String s1, String s2) -> {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//		});
//		System.out.println(palavras);		
// --------------------------------------------------------------------------------
//		palavras.sort(( s1, s2) -> {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//		});
//		System.out.println(palavras);		
// --------------------------------------------------------------------------------
//      Se s1>s2 : retorna valor positivo; s1<s2: retorna valor negativo; s1=s2 retorna zero 
//		palavras.sort((s1, s2) -> { return s1.length() - s2.length();} );
//		palavras.sort((s1, s2) ->  s1.length() - s2.length());		
//		System.out.println(palavras);		
// --------------------------------------------------------------------------------
//		palavras.sort((s1, s2) -> { return Integer.compare(s1.length(), s2.length()); });
//		palavras.sort((s1, s2) ->  Integer.compare(s1.length(), s2.length()));
//		System.out.println(palavras);		

		
	}

}
