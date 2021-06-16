package br.com.vinicio.model;

public class CadeiraModerna implements Cadeira {
    @Override
    public Boolean possuiPernas() {
        return true;
    }

    @Override
    public Boolean podeSentar() {
        return true;
    }
}
