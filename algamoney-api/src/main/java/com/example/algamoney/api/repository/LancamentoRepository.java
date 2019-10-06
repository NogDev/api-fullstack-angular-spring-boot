/**
 * 
 */
package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Lancamento;

/**
 * @author andersonnogueira
 * @since 6 de out de 2019
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
