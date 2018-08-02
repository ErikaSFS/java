public class Aluno {

    String Nome;
    String Curso;
    String [] Disciplina = new String[3];
    String Matrícula;
    double [] [] nota = new double[3][4];


    void mostrarInfo(){
        System.out.println("Nome: " + Nome);
        System.out.println("Matricula: " + Matrícula);
        System.out.println("Nome do Curso: " + Curso);

  for (int i=0; i<nota.length; i++){
    System.out.println("Notas da disciplina " + Disciplina);

    for (int j=0; j<nota[i].length; j++){
        System.out.print(nota[i][j] + " ");

    }
             System.out.println();  
} 
 
 

   }
   boolean verificarAprovado(int indice){

       if (obterMedia(indice) >= 7){
           return true;
       } 
           return false;
        
        }
    double obterMedia(int indice){
        double soma = 0;

        for (int i =0; i<nota[indice].length; i++){
            soma += nota[indice] [i];
        }
      
        double media = soma /4;
        return media;

    }
} 

