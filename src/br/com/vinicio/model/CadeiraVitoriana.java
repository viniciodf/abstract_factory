package br.com.vinicio.model;

public class CadeiraVitoriana implements Cadeira {
    @Override
    public Boolean possuiPernas() {
        return true;
    }

    @Override
    public Boolean podeSentar() {
        return false;
    }
}
