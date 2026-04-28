package Exercícios.Banco;

public class Main {
    
    public static void main(String[] args) {
    
        Banco p1 =  new Banco();

        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        
        Banco p2 = new Banco();

        p2.setNumConta(2222);
        p2.setDono("creuza");
        p2.abrirConta("CP");
        p2.depositar(500);    
        p2.sacar(1000);

        p1.status();
        p2.status();
    }

    

}
