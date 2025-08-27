package uscs;
public class Estudante {
    String nome;
    int idade;
    double nota;
    String materia;
    //Métodos
    public void estapresente() {
        System.out.println(nome + " [Aluno(a) Presente!!]");
    }
    public void faltounaaula() {
        System.out.println(nome + " [Aluno(a) Faltou!!]");
    }
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Matéria: " + materia);
    }
}
