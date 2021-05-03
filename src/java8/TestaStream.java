package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TestaStream {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

//		cursos.sort(Comparator.comparingInt(c -> c.getAlunos())); // com lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos)); // Com method reference:
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println("------------------------------------------------------------------");

		// dado um curso me devolva os que tem mais de 100 alunos
		cursos.stream().filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getNome()));
		System.out.println("------------------------------------------------------------------");

		// com lambda
		cursos.stream().filter(c -> c.getAlunos() > 100).map(c -> c.getAlunos())
				.forEach(total -> System.out.println(total));
		System.out.println("------------------------------------------------------------------");

		// com método Reference
		cursos.stream().filter(c -> c.getAlunos() > 100).map(Curso::getAlunos).forEach(System.out::println);
		System.out.println("------------------------------------------------------------------");

		// com método Reference
		int sum = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();
		System.out.println(sum);
		System.out.println("------------------------------------------------------------------");

		OptionalDouble media = cursos.stream().mapToInt(Curso::getAlunos).average();
		System.out.println("media: " + media);
		System.out.println("------------------------------------------------------------------");

// ----------------------------------	
// aqui vc gera uma lista a partir de uma Stream
		List<Curso> resultado = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		resultado.forEach(c -> System.out.println(c.getNome()));
		System.out.println("------------------------------------------------------------------");
// ---------------------------------- ou 	
// aqui vc gera uma lista a partir de uma Stream
		cursos = cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println("------------------------------------------------------------------");
// ----------------------------------		
		Map<String, Integer> map = cursos.stream().collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		System.out.println("Retorno Map: " + map);
// ----------------------------------
		cursos.stream().collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		System.out.println("------------------------------------------------------------------");
// ----------------------------------		
		Optional<Curso> optinalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();
		Curso curso = optinalCurso.orElseGet(null);
		System.out.println(curso.getNome());
		System.out.println("------------------------------------------------------------------");
		optinalCurso.ifPresent(c -> System.out.println(c.getNome()));
// --------------------- o comando abaixo faz a mesma coisa 		
		cursos.stream().filter(c -> c.getAlunos() >= 100).findAny().ifPresent(c -> System.out.println(c.getNome()));
// ----------------------------------		

	}

}
