package exercicio2;

public class Academia {
    String nome;
    String cidade;
    Aluno aluno;
    Instrutor instrutor;


    void mostraPessoas(){
        if (aluno != null) {
            System.out.println("Nome do aluno é: " + aluno.nome);
        }else{
            System.out.println("Não existem alunos!");
        }

        if (instrutor != null) {
            System.out.println("Nome do instrutor é: " + instrutor.nome);
        }else{
            System.out.println("Não existem instrutores!");
        }
    }
}
