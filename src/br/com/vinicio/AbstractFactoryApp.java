package br.com.vinicio;

import br.com.vinicio.factory.MobiliaModernaFactory;
import br.com.vinicio.factory.MobiliaVitorianaFactory;
import br.com.vinicio.model.Cadeira;

import java.util.Scanner;

public class AbstractFactoryApp {

    private static Cadeira cadeira;

    public static void main(String[] args) {
        String tipoMobilia = escolherMobilia();
        criarCadeira(tipoMobilia);
        imprimirCaracteristicasCadeira();
    }

    private static void imprimirCaracteristicasCadeira() {
        Boolean podeSentar = cadeira.podeSentar();
        System.out.println("Pode Sentar: "+ podeSentar);

        Boolean possuiPernas = cadeira.possuiPernas();
        System.out.println("Possui Pernas: "+ possuiPernas);

    }

    private static void criarCadeira(String tipoMobilia) {
        if(tipoMobilia.equals("1")){
            MobiliaModernaFactory mobiliaModernaFactory = new MobiliaModernaFactory();
            cadeira = mobiliaModernaFactory.criarCadeira();
        } else if(tipoMobilia.equals("2")){
            MobiliaVitorianaFactory mobiliaVitorianaFactory = new MobiliaVitorianaFactory();
            cadeira = mobiliaVitorianaFactory.criarCadeira();
        }
    }

    private static String escolherMobilia() {
        System.out.println("Escolha 1 para Mobilia Modenna e 2 para Mobilia Vitoriana");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
