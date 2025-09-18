public class Calculadora {

    private int validaNumero(String variable) {
        if (!variable.matches("-?\\d+")) {
            throw new IllegalArgumentException("Entrada invalidada: '" + variable + "' Esto no es un numero");
        }
        return Integer.parseInt(variable);
    }

    public int sumar(String a, String b) {
        return validaNumero(a) + validaNumero(b);
    }

    public int dividir(String a, String b) {
        int divisor = validaNumero(b);
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return validaNumero(a) / divisor;
    }

    public int restar(String a, String b) {
        return validaNumero(a) - validaNumero(b);
    }

    public int multiplicar(String a, String b) {
        return validaNumero(a) * validaNumero(b);
    }
}
