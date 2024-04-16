package Iphone.equipamentos.reprodutormusica;

import javax.sound.midi.Soundbank;

public class Itune implements ReprodutorMusica{
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}
