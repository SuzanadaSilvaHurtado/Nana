package sistemaRH;

public class PrestadorServicos implements Pagavel{
	private String nome;
	private int numeroContato;
	private double custoMensal;
	public PrestadorServicos(String nome, int numeroContato, double custoMensal) {
		this.setNome(nome);
		this.setNumeroContato(numeroContato);
		this.setCustoMensal(custoMensal);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroContato() {
		return numeroContato;
	}
	public void setNumeroContato(int numeroContato) {
		this.numeroContato = numeroContato;
	}
	public double getCustoMensal() {
		return custoMensal;
	}
	public void setCustoMensal(double custoMensal) {
		this.custoMensal = custoMensal;
	}
	@Override
	public double calculaPagamento(double extras, double descontos) {
		// TODO Auto-generated method stub
		return custoMensal+extras-descontos;
	}
	

}
