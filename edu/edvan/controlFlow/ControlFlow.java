package edu.edvan.controlFlow;

import edu.edvan.exceptionsFlow.InvalidExceptionParameters;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        Scanner depot = new Scanner(System.in);

        System.out.println("Informe o primeiro número de parâmetro: ");
        int firstParam = depot.nextInt();

        System.out.println("Informe o segundo número de parâmetro:");
        int secondParam = depot.nextInt();

        try {

            countFlow(firstParam, secondParam);

        } catch (InvalidExceptionParameters e) {

            System.out.println("[ERRO!] O segundo parâmetro deve ser maior que o primeiro!");

        }

    }

    static void countFlow(int firstParam, int secondParam) throws InvalidExceptionParameters {

        if(firstParam > secondParam) {
            throw new InvalidExceptionParameters();
        }

        int count = secondParam - firstParam;

        for(int i = 1; i <= count; i++) {
            System.out.println("Contador nº " + i);
        }
    }
}
