
public class ContaCorrente extends Conta {
	
	
	private static int SEQUENCIAL = 1000;


	public ContaCorrente(Cliente cliente) {
		super(cliente);
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;		
		
		
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		mostrarInfosComuns();
	}
	



}
