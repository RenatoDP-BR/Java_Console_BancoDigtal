package bancoDigital;

import java.util.ArrayList;
import java.util.Random;

public class ContaCliente {
	
	private Integer numContaCliente; 
	private Integer cpfCliente; 
	private Double saldoContaCliente; 
	
	public static ArrayList<ContaCliente> ListaDeContas;

	public ContaCliente(Integer cpfnovocliente) {
		
		this.cpfCliente = cpfnovocliente;
        
		if (pesquisaContaPorCpf(cpfnovocliente) == 0) {
           this.numContaCliente = geraNovaConta();
           this.saldoContaCliente = 0.0;
        }else {
        	System.out.print("Este Cliente já tem a conta " +
                    this.pesquisaContaPorCpf(cpfnovocliente).toString());
        }  
	}
	
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

	public Double getSaldoContaCliente() {
		return saldoContaCliente;
	}

	public void setSaldoContaCliente(Double saldoContaCliente) {
		this.saldoContaCliente = saldoContaCliente;
	}
	
	Integer geraNovaConta() {
		Random random = new Random();
        return random.nextInt(100);
	}

	Integer pesquisaContaPorCpf(Integer cpfCliente) {
        for(ContaCliente cpfConta : ListaDeContas) {
        	if (cpfConta.getCpfCliente().equals(cpfCliente)) {
		       return cpfConta.getNumContaCliente();
        	}
        }
        return 0;
	}

    Double consultaSaldoConta(Integer numconta) {
        for(ContaCliente Conta : ListaDeContas) {
        	if (Conta.getNumContaCliente().equals(numconta)) {
		       return Conta.getSaldoContaCliente();
        	}
        }
        return 0.0;
    }
	
	public void depositaConta() {
		
	}
	
	public void sacaConta() {
		
	}

    public void transfereEntreContas() {
    	
    }	
    
}
