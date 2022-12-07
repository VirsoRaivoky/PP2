package StaticFactoryMethod;

public class Main {

  public static void main(String[] args) {

    Jogo indie = JogoFactory.publicarJogo("Indie");
    System.out.println(indie.getType());

    Jogo doubleA = JogoFactory.publicarJogo("DoubleA");
    System.out.println(doubleA.getType());

    Jogo tripleA = JogoFactory.publicarJogo("TripleA");
    System.out.println(tripleA.getType());
  }
}