package com.lckzup.modelo;


public class Zezo {

    private String nome;
    private int idade;

    @Deprecated
    public Zezo() {
    }

    
    public Zezo(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }



    @Override
    public String toString() {
        return "Zezo [nome=" + nome + ", idade=" + idade + "]";
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Zezo other = (Zezo) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (idade != other.idade)
            return false;
                return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
            int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + idade;
            return result;
    }


    
}
