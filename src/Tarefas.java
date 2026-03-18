import java.util.ArrayList;

public class Tarefas {

    private Tarefa tarefa;

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public ArrayList<Tarefa>listarTarefas(){
        return tarefas;
    }

    public void removerTarefa(Tarefa tarefa){
        tarefas.remove(tarefa);
    }


    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
}


