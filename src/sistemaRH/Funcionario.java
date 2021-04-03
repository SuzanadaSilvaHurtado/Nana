package sistemaRH;

public class Funcionario extends Empregado  {
	
	public Funcionario(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
		
	}
	@Override
	public double calculaPagamento(double extras, double descontos) {
		// TODO Auto-generated method stub
		boolean ferias = false;
		double calculo;
		if(!ferias) {
			calculo = salarioBase+extras-descontos;
		}
		else {
			calculo = salarioBase/3;
		}		
		
		return calculo;
	}
}
