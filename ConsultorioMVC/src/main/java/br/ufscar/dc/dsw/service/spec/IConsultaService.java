package br.ufscar.dc.dsw.service.spec;

import java.util.List;

import br.ufscar.dc.dsw.domain.Consulta;
import br.ufscar.dc.dsw.domain.Usuario;

public interface IConsultaService {

	Consulta buscarPorId(Long id);

	List<Consulta> buscarTodos(Usuario u);

	void salvar(Consulta editora);
}
