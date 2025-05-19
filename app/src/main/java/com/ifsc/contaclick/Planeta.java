package com.ifsc.contaclick;

import java.io.Serializable;

public class Planeta  implements Serializable {
    String nome;
    Integer img;

    public Planeta(String nome, Integer img) {
        this.nome = nome;
        this.img = img;
    }
}
