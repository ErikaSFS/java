package exercicicoAula24;

public class LivrodeLivrariaTeste {

	public static void main(String [] args) {
		
		LivrodeLivraria bookk = new LivrodeLivraria();
		
		 bookk.Titulo =  "Clube de Luta Feminista";
		 bookk.Autor = "Jéssica Bennett";
		 bookk.Editora = "Fábrica 231";
		 bookk.Genero = "Politíca/Sociologia";
		 bookk.Idioma = "Português";
		 bookk.ISBN = 859517;
		 bookk.Edição = 1;
		 bookk.numPaginas = 336;
		 
		
		System.out.println(bookk.Titulo);
		System.out.println(bookk.Autor);
		System.out.println(bookk.Editora);
		System.out.println(bookk.Genero);
		System.out.println(bookk.Idioma);
		System.out.println(bookk.ISBN);
		System.out.println(bookk.Edição);
		System.out.println(bookk.numPaginas);
		

	}

}
