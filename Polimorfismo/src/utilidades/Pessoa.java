package utilidades;

//SuperClasse que irá repassar seu Atributo a todas as outras classes

public abstract class Pessoa {
    protected String nome;
    
//Construtor da SuperClasse pessoa
    public Pessoa (String nome) {
        this.nome = nome;
    }

    // Método abstrato para enviar email
    public abstract void enviarEmail(String corpoMensagem);
}
