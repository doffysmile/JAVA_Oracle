public class Aluno {
    String nome;
    double nota1, nota2, nota3;
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Vic";
        aluno1.nota1 = 9.0;
        aluno1.nota2 = 8.0;
        aluno1.nota3 = 9.5;
        double media1 = aluno1.media(aluno1.nota1, aluno1.nota2, aluno1.nota3);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Julia";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 2.0;
        aluno2.nota3 = 5.5;
        double media2 = aluno2.media(aluno2.nota1, aluno2.nota2, aluno2.nota3);

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Raffael";
        aluno3.nota1 = 10.0;
        aluno3.nota2 = 10.0;
        aluno3.nota3 = 10.0;
        double media3 = aluno3.media(aluno3.nota1, aluno3.nota2, aluno3.nota3);

       String [] alunos = {"Julia", "Raffael", "Vic"};
       double [] medias = {media1, media2, media3};
           for (int i = 0; i < alunos.length; i++) {
                   if (medias[i] >= 7.0) {
                       System.out.println(alunos[i] + " passou com a media " + medias[i]);
                   } else {
                       System.out.println(alunos[i] + " reprovou com a media " + medias[i]);
                   }
           }

    }
    //Method que tira a MEDIA
    double media(double nota1, double nota2, double nota3 ){
      return (nota1 + nota2 + nota3) / 3;
    }
}

