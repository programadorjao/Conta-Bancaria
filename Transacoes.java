import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Transacoes {
    private String tipo;
    private double valor;
    private LocalDateTime data;
    private String detalhes;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM HH:mm");

    public Transacoes(String tipo, double valor, LocalDateTime data, String detalhes){
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.detalhes = detalhes;
    }

    public String getTipo(){
        return this.tipo;
    }
    public double getValor(){
        return this.valor;
    }
    public LocalDateTime getData(){
        return this.data;
    }
    public String getDetalhes(){
        return this.detalhes;
    }
    public String getTransacoes(){
        String extrato = "";
        extrato += tipo + "\n";
        extrato += tipo + " no valor de " + valor +"R$ " + data.format(formato);
        if (detalhes != ""){
            extrato += " para " + detalhes;

        }



        return extrato;

    }

}
