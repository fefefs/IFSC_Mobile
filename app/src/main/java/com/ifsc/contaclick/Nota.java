package com.ifsc.contaclick;

import java.io.Serializable;

public class Nota implements Serializable {

    Integer nota;
    String nome;

    public Nomes(String nome, Integer nota) {
        this.nome = nome;
        this.nota = nota;
    }

}
