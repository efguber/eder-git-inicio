package Lanchonete;

public class Lanche {
    public String[] ingredientes = new String[10];

    private double valor;

    private String tipo;

    public void adicionarIngrediente(String ingrediente) {
        for (int i = 0; i < 10; i++) {
            if (this.ingredientes[i] == null) {
                this.ingredientes[i] = ingrediente;
                break;
            }
        }
    }

    public void montarComanda() {
        System.out.println(" ");
        System.out.println("===" + this.getTipo() + "===");
        System.out.printf("Valor: R$ %.2f\n", this.getvalor());
        System.out.println(" ");
        System.out.println("-Ingredientes-");

        for (String ingrediente : this.ingredientes) {
            if (ingrediente != null) {
                System.out.println(ingrediente);
            }
        }
        System.out.println("--------------");
    }

    public void setValor(double v) {
        this.valor = valor;
    }

    public double getvalor() {
        return this.valor;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
