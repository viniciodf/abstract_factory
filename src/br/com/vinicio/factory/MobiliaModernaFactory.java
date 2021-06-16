package br.com.vinicio.factory;

import br.com.vinicio.model.Cadeira;
import br.com.vinicio.model.CadeiraModerna;

public class MobiliaModernaFactory implements MobiliaFactory {
    @Override
    public Cadeira criarCadeira() {
        return new CadeiraModerna();
    }
}
