package com.spring.jpastudy.vet;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface VetRepository extends Repository<Vet, Integer> {

	@Transactional
	@Cacheable("vets")
	Collection<Vet> findAll() throws DataAccessException;

	@Transactional
	@Cacheable("vets")
	Page<Vet> findAll(Pageable pageable) throws DataAccessException;
	
}