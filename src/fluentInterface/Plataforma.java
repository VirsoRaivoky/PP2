package fluentInterface;

public class Plataforma {

	private String nome;
	private String plataforma;
	private Role role;
	
	public Plataforma isNamed(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Plataforma isFromPlataform(String plataforma) {
		this.plataforma = plataforma;
		return this;
	}
	
	public Plataforma is(Role role) {
		this.role = role;
		return this;
	}
	
	public String named() {
		return nome;
	}
	
	public String getRelease() {
		return plataforma;
	}
	
	public Role getRole() {
		return role;
	}
}
