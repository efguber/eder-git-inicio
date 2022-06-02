import java.util.Scanner;

public class driverandnavigator {
    public driverandnavigator() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe o numero de alunos da turma: ");
        int numAlunos = in.nextInt();
        System.out.print("Informe o numero de questões da prova: ");
        int numQuestoes = in.nextInt();
        String[] gabarito = new String[numQuestoes];
        String[][] respAlunos = new String[numAlunos][numQuestoes];
        String[] nomeAluno = new String[numAlunos];
        double []notaAlunos = new double[numAlunos];
        System.out.println();
        for (int i = 0; i < numQuestoes; i++) {
            System.out.print("Informe a resposta correta da questão "  +(i+1) + ": ");
            gabarito[i] = in.next();
        }
        System.out.println();
        for (int aluno = 0; aluno < numAlunos; aluno++) {
            System.out.print("Digite o nome do " + (aluno + 1)+ "º aluno: ");
            in.nextLine();
            nomeAluno[aluno]=in.nextLine();
            System.out.println("Digite as respostas de " + nomeAluno[aluno]);
            for (int questao = 0; questao < numQuestoes; questao++) {
                System.out.print("Informe a resposta da questão " + (questao + 1) + ": ");
                respAlunos[aluno][questao]= in.next().strip();
            }
            System.out.println();
        }
        for (int aluno = 0; aluno < numAlunos; aluno++) {
            double peso = 10.0/ (double) numQuestoes;
            for (int questao = 0; questao < numQuestoes; questao++) {
                if (gabarito[questao].equalsIgnoreCase(respAlunos[aluno][questao])){
                    notaAlunos[aluno] += peso;
                }
            }
        }
        for (int aluno = 0; aluno < numAlunos; aluno++) {
            System.out.printf("A nota do aluno %s: %.2f\n", nomeAluno[aluno],notaAlunos[aluno]);
        }

    }
}