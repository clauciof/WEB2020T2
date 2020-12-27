package br.ufscar.dc.dsw.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufscar.dc.dsw.domain.Consulta;
import br.ufscar.dc.dsw.domain.Usuario;

@SuppressWarnings("unchecked")
public interface ICompraDAO extends CrudRepository<Consulta, Long>{

	Consulta findById(long id);

	List<Consulta> findAllByUsuario(Usuario u);
	
	Consulta save(Consulta compra);
}