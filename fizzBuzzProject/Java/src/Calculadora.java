public class Calculadora {
    public Double soma(Double numero1, Double numero2) throws NullValueException {
        if (numero1 == null | numero2 == null)
            throw new NullValueException();

        return numero1 + numero2;

    }

    public Double subtracao(Double numero1, Double numero2) throws NullValueException {
        if (numero1 == null | numero2 == null)
            throw new NullValueException();
        return numero1 - numero2;
    }

    public Double multiplicacao(Double numero1, Double numero2) throws NullValueException {
        if (numero1 == null | numero2 == null)
            throw new NullValueException();
        return numero1 * numero2;
    }

    public Double Divisao(Double numero1, Double numero2) throws DivisionZeroException, NullValueException {
        if (numero1 == null | numero2 == null)
            throw new NullValueException();

        if (numero2 == 0) {
            throw new DivisionZeroException();
        }
        return numero1 / numero2;
    }
}
