package bank;

public class CriarConta { 

    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.saldo = 200; 
        System.out.println(p1.saldo); 

        p1.saldo += 200;
        System.out.println(p1.saldo);

        Conta p2 = new Conta();
        p2.saldo = 100;

        System.out.println("primeira conta tem " + p1.saldo);
        System.out.println("segunda conta tem " + p2.saldo);
    }
}