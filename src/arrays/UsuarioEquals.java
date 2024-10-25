package arrays;

public class UsuarioEquals {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        if(objeto instanceof UsuarioEquals) {
            UsuarioEquals outro = (UsuarioEquals) objeto;
            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
            return nomeIgual && emailIgual;
        }
        return false;
    }

    // versão simplificada
    @Override
    public int hashCode() {
        return 0;
    }
}
