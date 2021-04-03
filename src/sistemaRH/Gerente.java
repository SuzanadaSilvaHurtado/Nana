package sistemaRH;

public class Gerente extends Empregado {
	
	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
		
	}
	
	@Override
	public double calculaPagamento(double extras, double descontos) {
		// TODO Auto-generated method stub
		boolean ferias = false;
		double calculo;
		if(!ferias) {
			calculo =  (salarioBase*2)+extras-descontos;
		}
		else {
			calculo = (salarioBase*2)/3;
		}
		return calculo;
	}
}
