package util;

import java.util.regex.Pattern;

public class Util {

    public static String formatarCpf(String cpf) {
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public static boolean validarCpf(String cpf) {
        return cpf.matches("\\d{11}");
    }

    public static String formatarTelefone(String telefone) {
        return telefone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
    }

    public static boolean validarTelefone(String telefone) {
        return telefone.matches("\\d{11}");
    }

    public static boolean validarEmail(String email) {
        return Pattern.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$", email);
    }

    public static boolean validarCep(String cep) {
        return cep.matches("\\d{8}");
    }

    public static String formatarCep(String cep) {
        return cep.replaceAll("(\\d{5})(\\d{3})", "$1-$2");
    }
}
