
public class Gerente extends Funcionario {

	private int senha;

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double GetBonificacao() {
		return this.salario;
	}

}
