package br.com.desiree.drgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.desiree.drgerenciadortarefas.modelos.Usuario;

public interface RepositorioUsuarios extends JpaRepository<Usuario, Long>{

	/*O spring realiza a busca*/
	Usuario findByEmail(String email);
}
