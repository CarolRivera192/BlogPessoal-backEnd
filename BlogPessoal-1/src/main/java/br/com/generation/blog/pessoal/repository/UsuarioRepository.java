package br.com.generation.blog.pessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.blog.pessoal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario (String usuario);

	public List<Usuario> findAllByUsuarioContainingIgnoreCase(String usuario);

	public Usuario findFirstByNome(String nome);

}
