package ads.pdm.cadastro;

public class Formulario{

    private String nome;
    private String telefone;
    private String email;
    private boolean listaEmails;
    private boolean sexoMasc;
    private boolean sexoFem;
    private String cidade;
    private String uf;

    public Formulario(String nome, String telefone, String email, boolean listaEmails, boolean sexoMasc, boolean sexoFem, String cidade, String uf) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.listaEmails = listaEmails;
        this.sexoMasc = sexoMasc;
        this.sexoFem = sexoFem;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isListaEmails() {
        return listaEmails;
    }

    public void setListaEmails(boolean listaEmails) {
        this.listaEmails = listaEmails;
    }

    public boolean isSexoMasc() {
        return sexoMasc;
    }

    public void setSexoMasc(boolean sexoMasc) {
        this.sexoMasc = sexoMasc;
    }

    public boolean isSexoFem() {
        return sexoFem;
    }

    public void setSexoFem(boolean sexoFem) {
        this.sexoFem = sexoFem;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "  nome="        + nome +     '\'' +
                "/ telefone="    + telefone + '\'' +
                "/ email="       + email +    '\'' +
                "/ listaEmails=" + listaEmails +
                "/ sexoMasc="    + sexoMasc + "/ sexoFem=" + sexoFem + '\'' +
                "/ cidade="      + cidade +   '\'' +
                "/ uf"           + uf +       '\'' +
                '}';
    }
}