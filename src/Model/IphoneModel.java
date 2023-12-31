package Model;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorWeb;
import Interfaces.ReprodutorMusical;

import java.util.Scanner;

public class IphoneModel implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb {
    Scanner sc = new Scanner(System.in);
    private int codigo;
    private int senha;
    public String nomeUsuario;

    public IphoneModel(int codigo, int senha, String nomeUsuario) {
        this.codigo = codigo;
        this.senha = senha;
        this.nomeUsuario = nomeUsuario;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

   @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender(String nome) {
        System.out.println("Recebendo ligação... " + nome + "\n         -- Atender? --");
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println(numero + " deixou um recado" + "\n   -- Deseja reproduzir? --");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Abrindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página... Aguarde");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Reproduzindo " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Trocando para música selecionada");
    }


    public boolean validarSenha(){
        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        if(senha == this.getSenha()){
            System.out.println("Acesso permitido!");

            return true;
        }
        else {
            System.out.println("Senha inválida");
        }
        return false;
    }
}
