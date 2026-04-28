package Exercícios.Banco;

public class Banco{

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    //Método Construtor 
    public Banco(){

        setSaldo(0);
        setStatus(false);

    }




    // Métodos


    public void status(){
        System.out.println("---- Informações da conta ----");
        System.out.println("Conta - > " + getNumConta());
        System.out.println("Dono - > " + getDono());
        System.out.println("Tipo - > " + getTipo());
        System.out.println("Saldo -> " + getSaldo());
        System.out.println("Status - > " + isStatus());
        System.out.println("------------------------------");
    }


    public void abrirConta(String tipoConta){

        setTipo(tipoConta); 
        setStatus(true);

        if(tipoConta.equalsIgnoreCase("cc")){
            setSaldo(50);
        }else if(tipoConta.equalsIgnoreCase("cp")){
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso !");
    }

    public void fecharConta(){

         if(getSaldo() > 0){
            System.out.println("Conta com Dinheiro, nao pode ser fechada");
         }else if(getSaldo() < 0){
            System.out.println("Conta em Débito, nao pode fechar a conta");
         }else{
            setStatus(false);
            System.out.println("Conta fechada !");
         }      
    }

    public void depositar(double valor){

        if(isStatus() == true){
            saldo += valor;
            System.out.println("Depósito realizado com sucesso !");
        }else{
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(double valor){

        if(status == true && saldo >= valor){
            saldo -= valor;            
            System.out.println("Saque realizado com sucesso !");
        }else{
            System.out.println("Impossivel realizar o saque !");
        }
    }

    public void pagarMensal(){

        double v = 0;

        if(tipo.equalsIgnoreCase("cc")){
            v = 12;
        }else if(tipo.equalsIgnoreCase("cp")){
            v = 20;
        }

        if(status = true && saldo > v){
            saldo -= v;
            System.out.println("Mensalidade poga !");
        }else{
            System.out.println("Saldo insulficiente ou conta inativa !");
        }
    }





    // Getters 

    public int getNumConta(){
        return numConta;
    }

    public String getTipo(){
        return tipo;
    }

    public String getDono(){
        return dono;
    }

    public double getSaldo(){
        return saldo;
    }

    public boolean isStatus(){
        return status;
    }


    // Setters

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
}
