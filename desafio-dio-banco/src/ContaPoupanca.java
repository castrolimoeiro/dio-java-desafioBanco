
public class ContaPoupanca extends Conta{
	private static int SEQUENCIAL = 5000;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL--;
		
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		mostrarInfosComuns();
	}
	

}
