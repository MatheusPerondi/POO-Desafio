package Iphone.equipamentos.iphone11;

import Iphone.equipamentos.celular.Iphone;
import Iphone.equipamentos.navegador.Navegador;
import Iphone.equipamentos.reprodutormusica.ReprodutorMusica;
import Iphone.equipamentos.telefone.Telefone;

public class Iphone11 {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        Navegador navegador = new Iphone();
        ReprodutorMusica reprodutorMusica = new Iphone();
        Telefone telefone = new Iphone();

        navegador.adicionarPagina();
        reprodutorMusica.selecionarMusica();
        telefone.ligar();
    }
}
