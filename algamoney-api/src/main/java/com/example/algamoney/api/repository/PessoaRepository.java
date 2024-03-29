/**
 * 
 */
package com.example.algamoney.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Pessoa;

/**
 * @author andersonnogueira
 * @since 2 de out de 2019
 */
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);

}
