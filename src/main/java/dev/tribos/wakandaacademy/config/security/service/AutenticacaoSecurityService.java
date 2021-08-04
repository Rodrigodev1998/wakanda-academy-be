package dev.tribos.wakandaacademy.config.security.service;


import dev.tribos.wakandaacademy.credencial.infrastructure.CredencialSpringDataMongoDBRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class AutenticacaoSecurityService implements UserDetailsService {

    private CredencialSpringDataMongoDBRepository credencialRepository;

    public AutenticacaoSecurityService(CredencialSpringDataMongoDBRepository credencialRepository) {
        this.credencialRepository = credencialRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
        log.info("[inicio] AutenticacaoSecurityService - buscando usuario pelo nome");
        var credencialOpt = credencialRepository.findByUsuario(usuario);
        log.info("[finaliza] AutenticacaoSecurityService - buscando usuario pelo nome");
        return credencialOpt
                .map(credencl -> credencl)
                .orElseThrow(() -> new UsernameNotFoundException(""));
    }
}
