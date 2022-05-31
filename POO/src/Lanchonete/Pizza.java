package Lanchonete;

public class Pizza extends Minipizza {
    private String tamanho;

    public Pizza() {
        this.settipo("Pizza");
    }
    @Override
    public void montarComanda(){
        super.montarComanda();
        System.out.println("Tamanho: "+this.getTamanho());
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getTamanho(){
        return this.tamanho;
    }
}
