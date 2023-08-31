package aparelho;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Tocando música");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    public void tocar() {
        System.out.println("Tocando a música selecionada");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
}
