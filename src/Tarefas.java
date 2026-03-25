import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {

    private Tarefa tarefa;

    ArrayList<Tarefa> tarefas = new ArrayList<>();


    public void adicionarTarefa(Tarefa tarefa){
        if(tarefa.getTitulo() == null || tarefa.getTitulo().trim().isEmpty()){
            System.out.println("Erro: o título não pode ser vazio!");
            return;
        }
        tarefas.add(tarefa);
    }

    public ArrayList<Tarefa> listarTarefas(){
        return tarefas;
    }


    public void marcarComoConcluida(Scanner sc){

        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa cadastrada!");
            return;
        }

        for(int i = 0; i < tarefas.size(); i++){
            System.out.println((i+1) + " - " + tarefas.get(i));
        }

        System.out.print("Selecione uma tarefa: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        if(opcao < 1 || opcao > tarefas.size()){
            System.out.println("Opção inválida!");
            return;
        }

        System.out.print("Digite true para concluir ou false para desfazer: ");
        boolean status = sc.nextBoolean();

        tarefas.get(opcao-1).setConcluida(status);

        System.out.println("Tarefa atualizada!");
    }


    public void removerTarefa(Scanner sc){

        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa para remover!");
            return;
        }

        for(int i = 0; i < tarefas.size(); i++){
            System.out.println((i+1) + " - " + tarefas.get(i));
        }

        System.out.print("Selecione a tarefa para remover: ");
        int opcao = sc.nextInt();

        if(opcao < 1 || opcao > tarefas.size()){
            System.out.println("Opção inválida!");
            return;
        }

        tarefas.remove(opcao - 1);

        System.out.println("Tarefa removida com sucesso!");
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