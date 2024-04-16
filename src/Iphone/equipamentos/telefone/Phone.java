package Iphone.equipamentos.telefone;

public class Phone implements Telefone {
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void correioVoz() {
        System.out.println("Iniciando correio voz");
    }
}
