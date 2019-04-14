package pacote;

import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		System.out.println("Digite o valor da sua hora:");
		Scanner scan = new Scanner(System.in);
		double hora = scan.nextDouble();
		
		System.out.println("Digite quantas horas trabalhou esse mês:");
		double quantidadeporHora = scan.nextDouble();
		double salario = hora*quantidadeporHora;
		double inssValor = 0.10;
		double fgtsValor = 0.11;
		if (salario <= 900)
		{
			double ir = (salario * 0);
			double inss = (salario * inssValor);
			double fgts = (salario * fgtsValor);
			double valordosDescontos = (ir + inss + fgts);
			double salarioLiquido = salario - valordosDescontos;
		System.out.println("Salario bruto R$:" + salario);
		System.out.println("Imposto de renda R$:" + ir);
		System.out.println("INSS R$:" + inss);
		System.out.println("FGTS R$:" + fgts);
		System.out.println("Total de desconto R$:" + valordosDescontos);
		System.out.println("Sálario líquido R$:" + salarioLiquido);
		
		}
		
		else if (salario <= 1500)
		{
			double ir = (salario * 0.05);
			double inss = (salario * inssValor);
			double fgts = (salario * fgtsValor);
			double valordosDescontos = (ir + inss + fgts);
			double salarioLiquido = salario - valordosDescontos;
		System.out.println("Salario bruto R$:" + salario);
		System.out.println("Imposto de renda R$:" + ir);
		System.out.println("INSS R$:" + inss);
		System.out.println("FGTS R$:" + fgts);
		System.out.println("Total de desconto R$:" + valordosDescontos);
		System.out.println("Sálario líquido R$:" + salarioLiquido);
	}
		else if (salario <= 2500)
		{
			double ir = (salario * 0.10);
			double inss = (salario * inssValor);
			double fgts = (salario * fgtsValor);
			double valordosDescontos = (ir + inss + fgts);
			double salarioLiquido = salario - valordosDescontos;
		System.out.println("Salario bruto R$:" + salario);
		System.out.println("Imposto de renda R$:" + ir);
		System.out.println("INSS R$:" + inss);
		System.out.println("FGTS R$:" + fgts);
		System.out.println("Total de desconto R$:" + valordosDescontos);
		System.out.println("Sálario líquido R$:" + salarioLiquido);	
	}

		else if (salario > 2500)
		{
			double ir = (salario * 0.20);
			double inss = (salario * inssValor);
			double fgts = (salario * fgtsValor);
			double valordosDescontos = (ir + inss + fgts);
			double salarioLiquido = salario - valordosDescontos;
		System.out.println("Salario bruto R$:" + salario);
		System.out.println("Imposto de renda R$:" + ir);
		System.out.println("INSS R$:" + inss);
		System.out.println("FGTS R$:" + fgts);
		System.out.println("Total de desconto R$:" + valordosDescontos);
		System.out.println("Sálario líquido R$:" + salarioLiquido);
	
	}
		scan.close();
}
}
