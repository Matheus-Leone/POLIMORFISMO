package utilidades;

//Classe que irá herdar o atributo de Pessoa
public class Aluno extends Pessoa {
	
	
	//Construtor da Classe Aluno
    public Aluno(String nome) {
        super(nome);
    }

    
    //Override para sobreescrever as informações já colocadas no mesmo método (enviarEmail)
    @Override
    public void enviarEmail(String corpoMensagem) {
        String mensagemCompleta = "Olá Aluno " + nome + "!\n\n" + corpoMensagem;
        System.out.println(mensagemCompleta);
    }
}
