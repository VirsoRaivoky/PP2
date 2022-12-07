package StaticFactoryMethod;

public class JogoFactory {
	  
	  public static Jogo publicarJogo(String tipoDeJogo){

	    if (tipoDeJogo.equals("Indie")){
	      return new Indie();
	    }

	    if (tipoDeJogo.equals("DoubleA")){
	      return new DoubleA();
	    }

	    if (tipoDeJogo.equals("TripleA")){
	      return new TripleA();
	    }
	    return null;
	  }

	  
}