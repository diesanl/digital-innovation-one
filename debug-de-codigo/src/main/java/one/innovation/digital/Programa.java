package one.innovation.digital;

import one.innovation.digital.imc.CalculadorDeImc;
import one.innovation.digital.pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Diego", 1.77, 85.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }

}
