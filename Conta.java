import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Conta {
    private int numero;
    private double saldo;
    private static int cont = 0;
    private Cliente cliente;
    private ArrayList<Transacoes> transacoes;

    public  Conta(Cliente cliente){
        this.saldo = 0;
        Conta.cont++;
        this.numero = cont;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();

    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    boolean sacar(double valor){
        if (this.saldo>= valor){
            this.saldo -= valor;
            System.out.println("Saque feito com sucesso!");
            this.transacoes.add(new Transacoes("Saque", valor, LocalDateTime.now(), ""));
            return true;
        }else {
            System.out.println("Saldo insuficiente.");
            return false;

        }
    }
    public boolean transferir(Conta destino, double valor){
        if (this.saldo>= valor){
            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferênçia feita com sucesso!");
            transacoes.add(new Transacoes("Transferência", valor, LocalDateTime.now(), destino.getCliente().getNome() ));
            return true;
        }else {
            System.out.println("Saldo insuficiente para realizar transação.");
            return false;
        }
    }
    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            transacoes.add(new Transacoes("Deposito", valor, LocalDateTime.now(), ""));
            return true;
        }else {
            return false;
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
    public static int getQuantidadeDeContas(){
        return Conta.cont;
    }
    public String getResumo(){
        if (transacoes.isEmpty()){
            return "Cliente: " + cliente.getNome() + "\n" + "Numero da conta: " + this.numero + "\n" + "saldo: " + this.saldo + "\n" + "Não houve nenhuma transação";
        }
        String resultado = "";
        resultado += "Cliente: " + cliente.getNome() + "\n";
        resultado += "Numero: " + this.numero + "\n";
        resultado += "Saldo: " + this.saldo + "\n";
        for(Transacoes i : transacoes){
            resultado += i.getTransacoes() + "\n";
        }

        return resultado;
    }

}
