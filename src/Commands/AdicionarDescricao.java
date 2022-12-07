package Commands;

public class AdicionarDescricao implements Comando {
	
	private String jogo;
	private String descricao;
	
	public AdicionarDescricao(String jogo, String adicionar) {
		super();
		this.jogo = jogo;
		this.descricao = descricao;
	}
	
	public String adicionar() {
		return jogo.concat("Descricao:" + descricao);
	}
	
	public String remover() {
		return jogo;
	}
}
