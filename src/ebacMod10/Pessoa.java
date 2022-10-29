package ebacMod10;

import java.security.PrivateKey;

abstract class Pessoa {
   private String nomeEscola;
   private String nomePessoa;
   private int idade;
   private String ocupacacao;

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOcupacacao() {
        return ocupacacao;
    }

    public void setOcupacacao(String ocupacacao) {
        this.ocupacacao = ocupacacao;
    }
}
