/**
 * 
 */
package br.com.haraujo.dao;

import java.util.List;

import br.com.haraujo.dao.generic.IGenericDAO;
import br.com.haraujo.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
