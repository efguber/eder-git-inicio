package classes;

public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;
    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista) {
        this.setTamanhoLista(tamanhoLista); //para receber parametros de tamanho de lista.
        this.setTarefas(new Tarefa[tamanhoLista]); //criando um novo array de objetos do tipo tarefa e atribuindo a variavel tarefas.
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        if (tarefa.getOrdem() < 0 ||
                tarefa.getOrdem() >= this.getTamanhoLista()) { //ferramenta para aferir se a tarefa é valida, tem espaço e não é repetida.
            return false;
        }
        for (int i = 0; i < this.getTamanhoLista(); i++) { //percorre toda a lista de tarefas e localiza os espaços vazios para alocar a tarefa desejada.
            if (this.getTarefas()[i] == null) { //tb indica se a lista de tarefas ja foi toda preenchida.
                this.getTarefas()[i] = tarefa;
                return true;
            } else if (this.getTarefas()[i].getOrdem() == tarefa.getOrdem()) {
                break;
            }
        }
        return false;
    }

    public Tarefa buscarTarefa(int ordem) {
        for (Tarefa t : this.getTarefas()) {
            if (t != null && t.getOrdem() == ordem) { //percorre toda lista de tarefas localizando a tarefa desejada, mesmo que haja null na lista
                return t;
            }
        }
        return null;
    }

    public boolean alterarOrdemTarefa(int antigaOrdem, int novaOrdem) {  //altera a ordem da tarefa. obs: somente em ordens existentes
        Tarefa tarefaAntiga = buscarTarefa(antigaOrdem);  //regra para que a sequencia de prioridade da tarefa seja efetuada
        Tarefa novaTarefa = buscarTarefa(novaOrdem);

        if (tarefaAntiga == null || novaTarefa == null) {
            return false;
        }

        tarefaAntiga.setOrdem(novaOrdem);
        novaTarefa.setOrdem(antigaOrdem);
        return false;
    }

    // GETTER & SETTER abaixo

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}