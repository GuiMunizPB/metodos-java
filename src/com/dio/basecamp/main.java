package com.dio.basecamp;
import com.dio.basecamp.Calculator;
import com.dio.basecamp.Emprestimo;
import com.dio.basecamp.Mensagem;

public class Main {

    public static void main(String[] args) {


        System.out.println("Exercício calculadora");
        Calculator.soma(3, 6);
        Calculator.subtracao(9, 1.8);
        Calculator.multiplicacao(7, 8);
        Calculator.divisao(5, 2.5);


        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}