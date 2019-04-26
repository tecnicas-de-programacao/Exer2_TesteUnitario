//2. Para calcular o salário líquido de um funcionário deve-se descontar o INSS e o 
//imposto de renda do seu salário bruto. O desconto de INSS é de 4,5% até o limite de R$ 5000,00. 
//Já o imposto de renda é de 12% sobre o que excede R$ 2500,00. O IR e o INSS são
//calculados sobre o salário bruto original, sem os descontos. Explore a técnica de valor limite para identificar os casos de teste.

import java.util.*;

public class Funcionario 
{
    private String nome;
    private double salBruto;

    public Funcionario (String nome, double salBruto){
        nome = this.nome;
        salBruto = this.salBruto;
    }

    String getNome() { return this.nome;}

    double getSalarioBruto() { return this.salBruto;}
    
    double getSalarioLiquido() {
        double salLiquido = salBruto - getIR() - getINSS();
        return salLiquido;
    }

    double getIR() {
        double ir = 0;
        if (salBruto > 2500)
            ir = (12.0/100) * (salBruto - 2500);
        return ir;    
    }

    double getINSS() {
        double inss = salBruto * (4.5/100);
        if (inss > 5000)
            inss = 5000;
        return inss;    
     }

}