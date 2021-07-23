package dev.tribos.wakandaacademy.autenticacao.application.api;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandaacademy.autenticacao.application.AutenticacaoForm;
import dev.tribos.wakandaacademy.autenticacao.application.TokenDTO;
import dev.tribos.wakandaacademy.autenticacao.application.service.AutenticacaoService;
import dev.tribos.wakandaacademy.autenticacao.util.ValidaConteudoAuthorizationHeader;
import dev.tribos.wakandaacademy.handler.ApiException;

import java.util.Optional;

@RestController
@Log4j2
@AllArgsConstructor
public class AutenticacaoController implements AutenticacaoAPI {
    private AutenticacaoService autenticacaoService;

    @Override
    public ResponseEntity<TokenDTO> autenticacao(AutenticacaoForm autenticacaoForm) {
        log.info("[inicio] Iniciando Metodo autenciacao em AutenticacaoController");
        var token = autenticacaoService.autenticacao(autenticacaoForm.converter());
        log.info("[finaliza] Retornando Token para o cliente");
        return ResponseEntity.ok(new TokenDTO(token));
    }

    @Override
    public ResponseEntity<TokenDTO> reativaAutenticacao(String tokenExpirado) throws AuthenticationException {
        log.info("[inicio] Iniciando Metodo revalidaAutenciacao em AutenticacaoController");
        String tokenExpiradoValido=validaTokenExpirado(Optional.of(tokenExpirado));
        var token = autenticacaoService.reativaAutenticacao(tokenExpiradoValido);
        log.info("[finaliza] Retornando Token atualizado para o cliente");
        return ResponseEntity.ok(new TokenDTO(token));
    }

    private String validaTokenExpirado(Optional<String> tokenExpirado){
        String tokenExp= tokenExpirado.filter(new ValidaConteudoAuthorizationHeader())
                    .orElseThrow(() -> ApiException.throwApiException(HttpStatus.BAD_REQUEST,"O Token enviado está inválido. Tente novamente."));
        return tokenExp.substring(7,tokenExp.length());
    }

}
