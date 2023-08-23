
public class Teste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("David");
		Conta cc = new ContaCorrente(cliente);
		Conta cp = new ContaPoupanca(cliente);
		
		cc.depositar(528.20);
		
		cc.transferir(200, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
