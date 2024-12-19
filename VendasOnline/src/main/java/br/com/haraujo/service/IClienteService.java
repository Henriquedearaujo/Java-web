/**
 * 
 */
package br.com.haraujo.service;

import java.util.List;

import br.com.haraujo.domain.Cliente;
import br.com.haraujo.exceptions.DAOException;
import br.com.haraujo.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
