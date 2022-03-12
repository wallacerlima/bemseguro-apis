package br.edu.infnet.apiapolice.domain.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiapolice.domain.model.Apolice;

@Repository
public interface ApoliceRepository extends CrudRepository<Apolice, Integer> {

	@Query("from Apolice a where a.usuario.id = :userid")
	List<Apolice> findAll(Integer userid, Sort by);
	
	List<Apolice> findAll(Sort by);

	
}
