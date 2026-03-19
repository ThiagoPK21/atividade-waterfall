import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {

    private Tarefa tarefa;

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    public ArrayList<Tarefa>listarTarefas(){
        return tarefas;
    }

    public void marcarComoConcluida(Scanner sc){

       for(int i = 0; i < tarefas.size(); i++){
           System.out.print(i+1 + " - ");
           System.out.println(tarefas.get(i));
        }

       System.out.print("Selecione uma tarefa: ");
       int opcao = sc.nextInt();


       tarefas.get(opcao-1).setConcluida(true);


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


