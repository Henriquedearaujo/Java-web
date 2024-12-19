/**
 * 
 */
package br.com.haraujo.service;

import java.util.List;

import br.com.haraujo.domain.Produto;
import br.com.haraujo.services.generic.IGenericService;


public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
