package bancoDigital;

import java.util.ArrayList;

public class Cliente {
	
	public static ArrayList<Cliente> ListaDeClientes;
	
	private Integer cpfCliente; 
	private String nomeCliente; 
	
	public Cliente(Integer cpfCliente, String nomeCliente) {
		this.cpfCliente = cpfCliente; 
		this.nomeCliente = nomeCliente;
		
	}
	
	public Integer getCpfCliente() {
		return cpfCliente; 
	}

	public void setCpfCliente(Integer cpfCliente) {
		this.cpfCliente = cpfCliente; 
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente; 
	}	
	
	String pesquisaNomePorCpf(Integer cpfCliente) {
        for(Cliente cli : ListaDeClientes) {
        	if (cli.getCpfCliente().equals(cpfCliente)) {
		       return cli.getNomeCliente();
        	}
        }
        return "";
	}

	Integer pesquisaCpfPorNome(String nomeCliente) {
        for(Cliente cli : ListaDeClientes) {
        	if (cli.getNomeCliente().equals(nomeCliente)) {
		       return cli.getCpfCliente();  
        	}
        }
        return 0;
	}
}
