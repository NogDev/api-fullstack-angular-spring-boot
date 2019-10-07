/**
 * 
 */
package com.example.algamoney.api.repository.lancamento;

import java.util.List;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.filter.LancamentoFilter;

/**
 * @author andersonnogueira
 * @since 7 de out de 2019
 */
public interface LancamentoRepositoryQuery {
	public List<Lancamento> filtrar(LancamentoFilter filter);
}
