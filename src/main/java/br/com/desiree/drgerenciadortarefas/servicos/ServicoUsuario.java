package br.com.desiree.drgerenciadortarefas.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.desiree.drgerenciadortarefas.modelos.Usuario;
import br.com.desiree.drgerenciadortarefas.repositorios.RepositorioUsuarios;

@Service
public class ServicoUsuario {

	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Usuario encontrarPorEmail(String email) {
		return repositorioUsuarios.findByEmail(email);
	}
	
	public void salvar(Usuario usuario) {
		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
		repositorioUsuarios.save(usuario);
	}
}
