package exercicio2;

public class Aluno {
    String nome;
    String matricula;

    void realizarMatricula() {
        if (matricula == "Ativa") {
            System.out.println("Você já possui uma matrícula ativa!");
        } else {
            System.out.println("Você pode realizar uma matrícula!");
        }
    }
}
