package com.streams;

import java.util.Comparator;
import java.util.Objects;

public class Persona implements Comparable {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return eta == persona.eta && Objects.equals(nome, persona.nome);
    }

    public int hashCode() {
        return Objects.hash(nome, eta);
    }

//    public boolean equals(Persona p) {
//        return (this.nome.equals(p.nome) && this.eta == p.eta);
//    }



    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.eta, ((Persona) o).eta);
    }
}
