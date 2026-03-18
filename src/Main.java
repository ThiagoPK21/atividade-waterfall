import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tarefas tarefas = new Tarefas();

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n1- Adicionar tarefa");
            System.out.println("2- Marcar tarefa como concluída");
            System.out.println("3- Visualizar todas as tarefas");
            System.out.println("4- Remover uma tarefa");
            System.out.println("5- Encerrar o programa");

            System.out.print("Qual opção deseja escolher? ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){

                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = sc.nextLine();

                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();

                    Tarefa tarefa = new Tarefa(titulo, descricao, false);

                    tarefas.adicionarTarefa(tarefa);

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;


                case 2:

                    break;


                case 3:

                    ArrayList<Tarefa>listaTarefa = tarefas.listarTarefas();

                    for(Tarefa t : listaTarefa){
                        System.out.println(t.toString());
                    }

                    break;

                case 4:

                    break;

                case 5:

                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}