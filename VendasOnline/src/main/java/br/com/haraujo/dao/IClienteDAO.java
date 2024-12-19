/**
 * 
 */
package br.com.haraujo.dao;

import java.util.List;

import br.com.haraujo.dao.generic.IGenericDAO;
import br.com.haraujo.domain.Cliente;


public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
