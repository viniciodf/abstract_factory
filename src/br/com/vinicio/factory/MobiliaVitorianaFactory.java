package br.com.vinicio.factory;

import br.com.vinicio.model.Cadeira;
import br.com.vinicio.model.CadeiraVitoriana;

public class MobiliaVitorianaFactory implements MobiliaFactory {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraVitoriana();
    }
}
