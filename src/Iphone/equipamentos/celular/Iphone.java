package Iphone.equipamentos.celular;

import Iphone.equipamentos.navegador.Navegador;
import Iphone.equipamentos.reprodutormusica.ReprodutorMusica;
import Iphone.equipamentos.telefone.Telefone;

public class Iphone implements Navegador, ReprodutorMusica, Telefone {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina pelo iphone");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina pelo iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica pelo iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando pelo iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo iphone");
    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando correio de voz pelo iphone");
    }
}
