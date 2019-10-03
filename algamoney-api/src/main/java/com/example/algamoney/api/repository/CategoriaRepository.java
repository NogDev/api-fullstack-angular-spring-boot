/**
 * 
 */
package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Categoria;

/**
 * @author andersonnogueira
 * @since 2 de out de 2019
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
