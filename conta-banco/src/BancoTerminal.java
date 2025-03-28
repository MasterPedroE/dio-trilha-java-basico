public class BancoTerminal {
    public static void main(String[] args) throws Exception {

        double saldo =25;
        double valorsolicitado = 18;

        System.out.print("Digite a quantidade que deseja sacar: ");

        if(saldo > valorsolicitado){
            saldo = saldo - valorsolicitado;
            System.out.println(saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }

    }
}