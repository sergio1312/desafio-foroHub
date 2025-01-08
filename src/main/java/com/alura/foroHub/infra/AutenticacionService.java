package com.alura.foroHub.infra;

import com.alura.foroHub.domain.usuario.IUsuarioRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class AutenticacionService implements UserDetailsService {

    @Autowired
    private IUsuarioRepositry usuarioRepositry;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepositry.findByLogin(username);
    }
}
