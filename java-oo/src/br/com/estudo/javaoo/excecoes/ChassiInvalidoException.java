package br.com.estudo.javaoo.excecoes;

// warning nao provoca a quebra do codigo, nao é um erro de compilacao, mas avisa que esta faltando alguma coisa
// The serializable class ChassiInvalidoException does not declare a static final serialVersionUID field of type long
// objetos podem ser salvos em locais fisicos(hd ou BD) para serem restaurados
// serializacao: processo de salvar objeto em um local
// desseriazacao: leitura de objeto salvo quando programa volta a funcionar
// no processo de desserializacao, se as versoes nao baterem, o java nao provoca o erro e lanca mensagem mais 
// amigavel falando que nao pode ser deserializado porque as versoes sao diferentes
// todas classes de excecoes sao serializadas
public class ChassiInvalidoException extends Exception {
	private static final long serialVersionUID = 8855738064160250915L;// long aguarda dobro do int, 64 bits

	public ChassiInvalidoException(String chassi) {
		// super: acessa construtor da classe mae passando mensagem como parametro
		super(String.format("Este chassi é inválido [%s]", chassi));
	}
	
	

}
