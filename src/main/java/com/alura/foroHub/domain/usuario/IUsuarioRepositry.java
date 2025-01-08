package com.alura.foroHub.domain.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUsuarioRepositry extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String username);

}
