import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("222.222.22-22", "Maria", "Itaporanga - PB");
        Conta usuario1 = new Conta(cliente1);

        Cliente cliente2 = new Cliente("333,333,333-33", "João", "Boa ventura - PB");
        Conta usuario2 = new Conta(cliente2);

        Scanner input = new Scanner(System.in);
        int option = 0;
        double valor = 0;
        String mensagemDeErro = "Erro ao realizar operação.";
        String mensagemDeSucesso = "Operação realizada com sucesso";


        do {
            System.out.println("-------Menu-------");
            System.out.println("1 - Saque");
            System.out.println("2 - Deposito");
            System.out.println("3 - Transferencia");
            System.out.println("4 - Resumo");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Area de saque:");
                    System.out.print("Informe o valor que deseja sacar: ");
                    valor = input.nextDouble();
                    if (usuario1.sacar(valor)){
                        System.out.println(mensagemDeSucesso);
                    }else {
                        System.out.println(mensagemDeErro);
                    }break;
                case 2:
                    System.out.println("Area de deposito:");
                    System.out.print("Informe o valor que deseja depositar: ");
                    valor = input.nextDouble();
                    if (usuario1.depositar(valor)){
                        System.out.println(mensagemDeSucesso);

                    }else {
                        System.out.println(mensagemDeErro);
                    }break;
                case 3:
                    System.out.println("Area de tranferencia: ");
                    System.out.print("Informe o valor que deseja transferir: ");
                    valor = input.nextDouble();
                    if (usuario1.transferir(usuario2, valor)){
                        System.out.println(mensagemDeSucesso);
                    }else {
                        System.out.println(mensagemDeErro);
                    }break;
                case 4:
                    System.out.println(usuario1.getResumo());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
            }

        }while (option != 5);






    }
}