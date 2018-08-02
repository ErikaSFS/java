import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do Aluno");
        aluno.Nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.Curso = scan.next();

        System.out.println("Insira o nome da matricula");
        aluno.Matrícula = scan.next();
           
              //aluno.Disciplina = new String[3];
        for (int i=0; i<aluno.Disciplina.length; i++){
        System.out.println("Entre com o nome da disciplina " + i);
        aluno.Disciplina[i] = scan.next();
        }

        for (int i=0; i<aluno.nota.length; i++){
                System.out.println ("Obtendo notas da disciplina " + aluno.Disciplina[i]);
                for (int j=0; j<aluno.nota[i].length; j++){
                        System.out.println("Entre com a nota " + (j+1));
                        aluno.nota[i][j] = scan.nextDouble();
                }
        }
        aluno.mostrarInfo();
        
        for (int i=0; i<aluno.Disciplina.length; i++){
                if (aluno.verificarAprovado(i)){
                        System.out.println("Disciplina " + aluno.Disciplina[i] + " - Foi aprovado");
                } else {
                        System.out.println("Disciplina " + aluno.Disciplina[i] + " - Foi reprovado");
                }
        }
}
  
}
