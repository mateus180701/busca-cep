

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("digite um numero de cep: ");
        String cep = leitura.next();
        leitura.close();

        ConsultaCep consultaCep = new ConsultaCep();


        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.salvaEndereco(novoEndereco);

        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("ocorreu um erro, finalizando o processo");
        }

    }
}