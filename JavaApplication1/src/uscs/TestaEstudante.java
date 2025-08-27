package uscs;
public class TestaEstudante {
    public static void main(String[] args) {
        Estudante Aluno1 = new Estudante();
        Estudante Aluno2 = new Estudante();
        Aluno1.nome = "Gabriel Carlos da Silva";
        Aluno1.idade = 22;
        Aluno1.nota = 9.28;
        Aluno1.materia = "Lógica de Programação";
        Aluno1.imprimir();
        Aluno1.estapresente();
        Aluno2.nome = "Beatriz Pereira de Melo";
        Aluno2.idade = 19;
        Aluno2.nota = 8.75;
        Aluno2.materia = "Lógica de Programação";
        Aluno2.imprimir();
        Aluno2.faltounaaula();
                  
    }
    
}
