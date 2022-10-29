package ebacMod10;

import java.util.Scanner;

public class AvaliacaoEscolar {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nomeEscola = "ESCOLA ESTADUAL DE ENSINO MÉDIO E FUNDAMENTAL JOSÉ DE ALENCAR";
        System.out.println("Digite o nome do aluno");
        String nome = scan.next();
        System.out.println("Digite a idade do aluno");
        int idade = scan.nextInt();
        System.out.println("Digite a serie do aluno");
        int serie = scan.nextInt();
        System.out.println("Digite a ocupação do aluno");
        String ocupacao = scan.next();

        Aluno aluno1 = new Aluno();
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setNomePessoa(nome);
        aluno1.setIdade(idade);
        aluno1.setSerie(serie);

        Notas notasAluno = new Notas();

        System.out.println("Escola: "+aluno1.getNomeEscola() +
                "\nAluno: "+aluno1.getNomePessoa() +
                "\nIdade: "+aluno1.getIdade() +
                "\nSerie: "+aluno1.getSerie());
        notasAluno.getCalcMediaAluno();
    }
}
