public class Desing extends Funcionario {
    public Desing(String nome, double salario, String cargo){
        super(nome, salario, cargo);
    }
    @Override
    public void calcularBonus() {
        double bonus = getSalario() + (getSalario() * 10 / 100);

        System.out.println("Seu bônus é de 10% então você ganhará: " + bonus);
    }
}
