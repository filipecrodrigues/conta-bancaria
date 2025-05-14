package br.com.contabancaria.entities;

public class Cliente {

        private String nome;
        private double saldoInicial;

        //Construtor
    public Cliente(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldoInicial = saldoInicial;
    }


    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    //meto depositar
    public void setDepositar(double deposito){
        saldoInicial+= deposito;
        System.out.println(getExtrato());
    }
    //metodo saque
    public void setSacar (double saque){
        //validar os valores para realziar opeação de saque
        if(saldoInicial - saque >=0){
           saldoInicial -= saque;
            System.out.println(getExtrato());

        }else{
            System.out.println("Saldo insulficiente!");
            System.out.println(getExtrato());
        }
    }
    //metodo privado saldo
    public String getExtrato() {
        return String.format ("Saldo: %.2f", saldoInicial);
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "Nome: " + nome +
                " Saldo= " + saldoInicial
                ;
    }
}
