/**
 * 
 */
package com.example.algamoney.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.repository.filter.LancamentoFilter;
import com.example.algamoney.api.repository.projection.ResumoLancamento;

/**
 * @author andersonnogueira
 * @since 7 de out de 2019
 */
public interface LancamentoRepositoryQuery {
	public Page<Lancamento> filtrar(LancamentoFilter filter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
