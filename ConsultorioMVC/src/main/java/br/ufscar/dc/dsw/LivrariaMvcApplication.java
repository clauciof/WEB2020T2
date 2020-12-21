package br.ufscar.dc.dsw;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import br.ufscar.dc.dsw.dao.IMedicoDAO;
import br.ufscar.dc.dsw.dao.ILivroDAO;
import br.ufscar.dc.dsw.dao.IUsuarioDAO;
import br.ufscar.dc.dsw.domain.Editora;
import br.ufscar.dc.dsw.domain.Livro;
import br.ufscar.dc.dsw.domain.Medico;
import br.ufscar.dc.dsw.domain.Usuario;

@SpringBootApplication
public class LivrariaMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaMvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(IUsuarioDAO usuarioDAO, BCryptPasswordEncoder encoder, IMedicoDAO medicoDAO, ILivroDAO livroDAO) {
		return (args) -> {
			
			Usuario u1 = new Usuario();
			u1.setUsername("admin");
			u1.setPassword(encoder.encode("admin"));
			
			u1.setName("Administrador");
			u1.setRole("ROLE_ADMIN");
			u1.setEnabled(true);
			usuarioDAO.save(u1);
			
			Usuario u2 = new Usuario();
			u2.setUsername("beltrano");
			u2.setPassword(encoder.encode("123"));
			
			u2.setName("Beltrano Andrade");
			u2.setRole("ROLE_PA");
			u2.setEnabled(true);
			usuarioDAO.save(u2);
			
			Usuario u3 = new Usuario();
			u3.setUsername("fulano");
			u3.setPassword(encoder.encode("123"));
			
			u3.setName("Fulano Silva");
			u3.setRole("ROLE_USER");
			u3.setEnabled(true);
			usuarioDAO.save(u3);
			
			Medico m1 = new Medico();
			m1.setName("Ricardo");
			m1.setUsername("ricardo@email");
			m1.setPassword("senha");
			m1.setEnabled(true);
			m1.setEspecialidade("Clinico Geral");
			m1.setCRM("45635875373");
			
			medicoDAO.save(m1);
			
			Medico m2 = new Medico();
			m2.setName("Diego");
			m2.setUsername("diego@email");
			m2.setPassword("senha");
			m2.setEnabled(true);
			m2.setEspecialidade("Gastro");
			m2.setCRM("45655875373");
			
			medicoDAO.save(m2);
			
			
			Medico m3 = new Medico();
			m3.setName("Elisangela");
			m3.setUsername("elisangela@email");
			m3.setPassword("senha");
			m3.setEnabled(true);
			m3.setEspecialidade("Otorrino");
			m3.setCRM("32235875373");
			
			medicoDAO.save(m3);
			
			Medico m4 = new Medico();
			m4.setName("Bruna");
			m4.setUsername("bruna@email");
			m4.setPassword("senha");
			m4.setEnabled(true);
			m4.setEspecialidade("Oftamologista");
			m4.setCRM("00635875374");
			
			medicoDAO.save(m4);
			
		
			
			
		};
	}
}
