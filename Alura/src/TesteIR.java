
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3800.0;
		double res=0.0;

		if (salario > 1900.0 && salario < 2800.0) {
			res = salario * 0.075;
			System.out.println("Salario: "+salario+" Valor restituicao: "+res+" Deduzir R$ 142");
		} else if (salario > 2800.01 && salario < 3751.0) {
			res = salario * 0.15;
			System.out.println("Salario: "+salario+" Valor restituicao: "+res+" Deduzir R$ 350");
		} else if (salario > 3751.01 && salario <  4664.0) {
			res = salario * 0.225;
			System.out.println("Salario: "+salario+" Valor restituicao: "+res+" Deduzir R$ 636");
		}
		else {
			System.out.println("Salario: "+salario+" ISENTO");
		}
		
		

	}
}