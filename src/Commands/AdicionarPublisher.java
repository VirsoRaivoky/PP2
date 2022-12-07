package Commands;

public class AdicionarPublisher implements Comando {
	
	private String jogo;
	private String publisher;
	
	public AdicionarPublisher(String jogo, String adicionar) {
		super();
		this.jogo = jogo;
		this.publisher = publisher;
	}
	
	public String adicionar() {
		return jogo.concat("Publicadora:" + publisher);
	}
	
	public String remover() {
		return jogo;
	}
}
