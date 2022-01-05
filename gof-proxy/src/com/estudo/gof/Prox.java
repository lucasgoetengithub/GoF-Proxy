package com.estudo.gof;

public class Prox {
	public static void main(String[] args) {
		new Prox().problema();
	}

	public void problema() {
		SerSupremo ser = new Intermediario();
		System.out.println(ser.responder("Qual o sentido da Vida?"));
	}
}
