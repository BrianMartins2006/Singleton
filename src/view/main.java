package view;

import model.Singleton;

public class main {

	public static void main(String[] args) {
		System.out.println("LOG: O programa começou, mas o Singleton ainda não foi criado.");

		Singleton config1 = Singleton.getInstancia();
        System.out.println("LOG: Primeira chamada a getInstancia().");

        System.out.println("Config1 - Tema: " + config1.getTemaAtual()); 

        Singleton config2 = Singleton.getInstancia();
        System.out.println("LOG: Segunda chamada a getInstancia().");

        
        config1.setTemaAtual("Tema Claro");

        boolean saoIguais = (config1 == config2);
        
        System.out.println("Config1 - NOVO Tema: " + config1.getTemaAtual()); 
        System.out.println("Config2 - NOVO Tema: " + config2.getTemaAtual()); 
        System.out.println("\nAs referências config1 e config2 apontam para o mesmo objeto? " + saoIguais);
    }

	}


