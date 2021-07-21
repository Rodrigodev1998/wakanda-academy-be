package dev.tribos.wakandaacademy.autenticacao.util;

import java.util.function.Predicate;

public class ValidaConteudoAuthorizationHeader implements Predicate<String> {
    @Override
    public boolean test(String ConteudoAuthorizationHeader) {
        return !ConteudoAuthorizationHeader.isEmpty() && ConteudoAuthorizationHeader.startsWith("Bearer");
    }
}
