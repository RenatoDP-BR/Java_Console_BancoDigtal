package bancoDigital;

public class ContaCliente {
	
	private Integer numContaCliente; 
	private Integer cpfCliente; 
	private Float saldoContaCliente;  	

	public Integer getNumContaCliente() {
		return numContaCliente;
	}

	public void setNumContaCliente(Integer numContaCliente) {
		this.numContaCliente = numContaCliente;
	}
	
	public Integer getCpfCliente() {
		return cpfCliente; 
	}

	public void setCpfCliente(Integer cpfCliente) {
		this.cpfCliente = cpfCliente; 
	}

	public Float getSaldoContaCliente() {
		return saldoContaCliente;
	}

	public void setSaldoContaCliente(Float saldoContaCliente) {
		this.saldoContaCliente = saldoContaCliente;
	}
	
	public void gerarNovaConta(Integer cpfCliente) {

	}

	public void pesquisaConta(Integer cpfCliente, String nomeCliente) {
		
	}
	
	public void depositaConta() {
		
	}
	
	public void sacaConta() {
		
	}

    public void transfereEntreContas() {
    	
    }

    public void consultaSaldoConta() {
    	
    }
	
}
