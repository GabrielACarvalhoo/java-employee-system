public class Funcionarios {
    private String nome;
    private double salario;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionarios(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }
    public void ExibirDados(){
        System.out.printf("Nome: %s\nCargo: %s \nSalário: %.2f\n", nome, cargo, salario);
    }
    public abstract void calcularBonus();
}
