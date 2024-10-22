package Principal;

//Import para pegar todos os métodos das outras classes
import utilidades.Aluno;
import utilidades.Professor;

//Classe principal para Configurar e Apresentar os Dados
public class Main {
    public static void main(String[] args) {
        // Criando um professor 
        Professor professor = new Professor("Alan Turing");
        professor.enviarEmail("Estou enviando as tarefas solicitadas."  + "\n");

        // Criando um aluno
        Aluno aluno = new Aluno("Joseph");
        aluno.enviarEmail("Lembre-se de entregar o trabalho até sexta-feira.");
    }
}
