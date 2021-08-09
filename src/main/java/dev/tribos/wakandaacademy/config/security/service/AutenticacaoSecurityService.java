package dev.tribos.wakandaacademy.config.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dev.tribos.wakandaacademy.credencial.infrastructure.CredencialSpringDataMongoDBRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class AutenticacaoSecurityService implements UserDetailsService {
    private CredencialSpringDataMongoDBRepository credencialRepository;

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        log.info("[inicio] AutenticacaoSecurityService - buscando usuario pelo nome");
        var credencialOpt = credencialRepository.findByUsuario(usuario);
        log.info("[finaliza] AutenticacaoSecurityService - buscando usuario pelo nome");
        return credencialOpt
                .orElseThrow(() -> new UsernameNotFoundException(""));
    }
}
