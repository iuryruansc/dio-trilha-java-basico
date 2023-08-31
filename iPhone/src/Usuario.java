import aparelho.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
