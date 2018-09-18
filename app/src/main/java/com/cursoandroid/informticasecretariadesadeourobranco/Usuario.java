package com.cursoandroid.informticasecretariadesadeourobranco;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Usuario {
    private String nome;
    private String telefone;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUbs() {
        return ubs;
    }

    public void setUbs(String ubs) {
        this.ubs = ubs;
    }

    private String reclamacao;
    private String ubs;


    public Usuario() {
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

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String nome) {
        this.reclamacao = nome;
    }
}