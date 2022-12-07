package Singleton;

public class Jogo {
	
	 private static Jogo instance;
	    

	 private Jogo(){
	      
	    }

	public static Jogo getInstance(){

	        if( instance == null ){

	            instance = new Jogo();
	        }

	        return instance;
	    }
}
