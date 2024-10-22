package utilidades;

//Classe que irá herdar o atributo de Pessoa
public class Professor extends Pessoa {
	
//Construtor da Classe Professor
    public Professor(String nome) {
        super(nome);
    }

    //Override para sobreescrever as informações já colocadas no mesmo método (enviarEmail)
    @Override
    public void enviarEmail(String corpoMensagem) {
        String mensagemCompleta = "Olá Prof. " + nome + "!\n\n" + corpoMensagem;
        System.out.println(mensagemCompleta);
    }
}
