
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		
		func1.setNome("Raoni F");
		func1.setCpf("39281889846");
		func1.setSalario(5000);
		
		System.out.println(func1.getNome());
		System.out.println(func1.getSalario());
		System.out.println(func1.GetBonificacao());

	}

}
