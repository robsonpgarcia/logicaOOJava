package br.com.treinamentoweb.zoologico.classes;

public interface Animavel {
	
	// tudo o que declara na interface eh publico
	Boolean ehAdulto();
	void emitirBarulho();
	void morrer();
	
}
