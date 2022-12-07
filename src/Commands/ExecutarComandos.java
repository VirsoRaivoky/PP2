package Commands;
import java.util.Stack;

public class ExecutarComandos {

	private Stack<Comando> adicionados;
	private Stack<Comando> removidos;
	
	public ExecutarComandos() {
		super();
		this.adicionados = new Stack<Comando>();
		this.removidos = new Stack<Comando>();
	}
	
	public String adicionar(Comando c) {
		adicionados.push(c);
		removidos.clear();
		return c.adicionar();
	}
	
	public String remover() {
		if(adicionados.isEmpty())
			return"";
		
		Comando c = adicionados.pop();
		removidos.push(c);
		return c.remover();
	}
	
	public String reAdicionar() {
		if(removidos.isEmpty())
			return "";
		

		Comando c = removidos.pop();
		adicionados.push(c);
		return c.adicionar();
	}
}
