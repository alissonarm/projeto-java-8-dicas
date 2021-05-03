package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class TestarMethodReferences {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("Editora casa do código");
		palavras.add("Caelum");
		palavras.add("Alura online");

// ---------------------------------------------------------------------------------		
//		palavras.sort((s1, s2) ->  Integer.compare(s1.length(), s2.length()));		
// ---------------------------------------------------------------------------------		
//      Ordene comparando o tamanho da string s (dado s me devolva o tamanho) 
//		palavras.sort(Comparator.comparing(s -> s.length()));
// ---------------------------------------------------------------------------------		
//		Ordene comparando o length do String
//		palavras.sort(Comparator.comparing(String::length));		
// ---------------------------------------------------------------------------------
//		Comparator<String> comparador = Comparator.comparing(s -> s.length());
//		palavras.sort(comparador);
// ---------------------------------------------------------------------------------
//      Function<T, R> ==> Dado T me devolve R 
//		Function<String, Integer> funcao =  s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);//
//		palavras.sort(comparador);
// ---------------------------------------------------------------------------------
//      Function<T, R> ==> Dado T me devolve R 
		Function<String, Integer> funcao =  String::length;
		Comparator<String> comparador = Comparator.comparing(funcao);//
		palavras.sort(comparador);
// ---------------------------------------------------------------------------------
//      Function<T, R> ==> Dado T me devolve R 
//		Function<String, Integer> funcao = new Function<String, Integer>() {
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//		};
//		Comparator<String> comparador = Comparator.comparing(funcao);//
//		palavras.sort(comparador);

		System.out.println(palavras);
	}

}
