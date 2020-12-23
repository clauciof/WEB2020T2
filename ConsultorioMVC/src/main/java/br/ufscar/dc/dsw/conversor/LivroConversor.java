package br.ufscar.dc.dsw.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.ufscar.dc.dsw.domain.Paciente;
import br.ufscar.dc.dsw.service.spec.IPacienteService;

@Component
public class LivroConversor implements Converter<String, Paciente>{

	@Autowired
	private IPacienteService service;
	
	@Override
	public Paciente convert(String text) {
		
		if (text.isEmpty()) {
		 return null;	
		}
		
		Long id = Long.valueOf(text);	
		return service.buscarPorId(id);
	}
}
