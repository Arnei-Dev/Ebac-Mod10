package ebacMod10;

import java.util.Scanner;

public class Notas {
    private double[] notas = new double[4];
    double media;
    double soma;

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    Scanner n = new Scanner(System.in);

    private double notasAluno () {
        for (int i = 0; i < this.notas.length; i++){
            System.out.println("Digite a " + (i+1) +"° Nota do Aluno");
            this.notas[i] = n.nextDouble();
            soma += this.notas[i];
        }
      // System.out.println(media);
       return this.media = soma/4;

    }
    public void getCalcMediaAluno(){
        this.notasAluno();
        if(this.media >= 70){
            System.out.println("Aluno Aprovado com Média: "+ media);
        }else if (this.media > 60 && this.media < 69){
            System.out.println("Aluno em Recuperação com Média: "+ media);
        }else{
            System.out.println("Aluno está Reprovado com Média: "+ media);
        }
    }
}
