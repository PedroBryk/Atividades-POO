package exercicio2;

public class Main {
    public static void main(String[] args) {
        Academia academia1 = new Academia();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Instrutor instrutor1 = new Instrutor();

        aluno1.nome = "Pedro";
        aluno1.matricula = "Ativa";

        aluno2.nome = "Eloize";
        aluno2.matricula = "Inativa";

        instrutor1.nome = "Erik";
        instrutor1.diasTrabalhados = 20;
        instrutor1.valorDia = 100;

        academia1.nome = "Ajuste";
        academia1.cidade = "Guarapuava";
        academia1.aluno = aluno1;
        academia1.instrutor = instrutor1;

        academia1.mostraPessoas();
        instrutor1.pagamentoInstrutor();
        aluno1.realizarMatricula();
        aluno2.realizarMatricula();

    }
}
