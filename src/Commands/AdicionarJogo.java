package Commands;

public class AdicionarJogo implements Comando {
	
	private String jogo;
	private String adicionar;
	
	public AdicionarJogo(String jogo, String adicionar) {
		super();
		this.jogo = jogo;
		this.adicionar = adicionar;
	}
	
	public String adicionar() {
		return jogo.concat(adicionar);
	}
	
	public String remover() {
		return jogo;
	}
}
