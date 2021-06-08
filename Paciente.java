package exercícios;

public class Paciente {
	
	private String nome;
	private String sobrenome;
	private String enfermidade;
	private String nivel;
	private String prioridade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEnfermidade() {
		return enfermidade;
	}
	public void setEnfermidade(String enfermidade) {
		this.enfermidade = enfermidade;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
}