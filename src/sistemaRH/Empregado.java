package sistemaRH;

public abstract class Empregado implements Pagavel{
	protected String nome, matricula;
	protected double salarioBase;
	
	public Empregado(String nome, String matricula, double salarioBase) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setSalarioBase(salarioBase);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	// este método só está especificado
	public double calculaFerias() { 
		return 0;
	}


}
