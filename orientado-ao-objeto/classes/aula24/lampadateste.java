package exercicioAula24;

public class lampadaTeste {

	public static void main(String[] args) {
		Lampada espiral = new Lampada();
		espiral.marca = "Soleil";
		espiral.modelo = "Flourescente";
		espiral.base = 27;
		espiral.aspecto = "branca/ luz do dia";
		espiral.potencia = 25;
		espiral.tensão = 127;
		espiral.valor = 11.5;
				
		System.out.println(espiral.marca);
		System.out.println(espiral.modelo);
		System.out.println(espiral.base);
		System.out.println(espiral.aspecto);
		System.out.println(espiral.potencia);
		System.out.println(espiral.tensão);
		System.out.println(espiral.valor);
		

	}

}
