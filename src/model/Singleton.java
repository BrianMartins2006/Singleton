package model;

public class Singleton {
	private static Singleton instancia;
    private String temaAtual;
    
    private Singleton() {
        this.temaAtual = "Tema Escuro Padrão";
    }

    public static synchronized Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public String getTemaAtual() {
        return temaAtual;
    }

    public void setTemaAtual(String novoTema) {
        this.temaAtual = novoTema;
    }
}


