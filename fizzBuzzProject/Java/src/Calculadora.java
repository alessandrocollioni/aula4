public class Calculadora {
    public Double soma(Double numero1, Double numero2) {

        return numero1 + numero2;

    }

    public Double subtracao(Double numero1, Double numero2) {
        return numero1 - numero2;
    }

    public Double multiplicacao(Double numero1, Double numero2) {
        return numero1 * numero2;
    }

    public Double Divisao(Double numero1, Double numero2) throws Exception {
        if (numero2 == 0) {
            throw new Exception();
        }
        return numero1 / numero2;
    }
}
