package Iphone.equipamentos.navegador;

public class Safari implements Navegador{
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
