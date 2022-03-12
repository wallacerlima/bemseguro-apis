package br.edu.infnet.apisegurado.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apisegurado.domain.model.Segurado;

@Repository
public interface SeguradoRepository extends CrudRepository<Segurado, Integer> {

	@Query("from Segurado s where s.usuario.id = :userid")
	public List<Segurado> findAll(Integer userid);
	
}