package br.com.contabancaria.application;

import br.com.contabancaria.entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Cliente cliente = new Cliente("Filipe", 0);
        System.out.println(cliente);
        int option = 0;



        while (option != 4){
            exibeMenu();

            while (!scan.hasNextInt()){
                System.out.println("Opção Invalida! Tente novamente");
                scan.next(); // para limpar entrada invalida

            }

            option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println(cliente.getExtrato());
                    break;

                case 2:
                    System.out.println("Valor do deposito:");
                    if (scan.hasNextDouble()) {
                        double deposito = scan.nextDouble();
                        if (deposito > 0){
                            cliente.setDepositar(deposito);
                        }else{
                            System.out.println("Valor não pode ser negativo");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Valor do saque");
                    if (scan.hasNextDouble()) {
                        double saque = scan.nextDouble();
                        if (saque > 0){
                            cliente.setSacar(saque);
                        }else{
                            System.out.println("Valor não pode ser negativo");
                        }
                    }
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Opção invalida!  tente novamente");
                    break;
            }

        }
        scan.close();
    }

    //função exibir menu
    private static void exibeMenu(){
        System.out.println(""

                +"OPÇÕES:\n"
                +"1- Saldo "
                +"2- Depósito "
                +"3- Saque "
                +"4- Sair ");
    }
}
