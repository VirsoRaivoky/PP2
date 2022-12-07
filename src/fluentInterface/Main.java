package fluentInterface;

public class Main {
	
	public static void main(String[] args) {
		Role loja = new Role().IsNamed("Steam");
		Plataforma steam = new Plataforma().isNamed("Ultrakill").isFromPlataform("PC").is(loja)
	}
}
