/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc1;

/**
 *
 * @author oazambranoa
 */

import java.util.Scanner;


public class Actividad2Exc1 {

    public static void main(String[] args) {
        
        double empWorkHours, hourPrice, reteValue, totalSalary, subtotalSalary, reteTotal;
        int empCod;
        String empName;
        
        System.out.println("Ingrese el código del empleado: ");
        Scanner codigoEmp = new Scanner(System.in);
        empCod = codigoEmp.nextInt();
        
        System.out.println("Ingrese el nombre del trabajador: ");
        Scanner nombreEmp = new Scanner(System.in);
        empName = nombreEmp.nextLine();
        
        System.out.println("Ingrese el numero de horas trabajadas: ");
        Scanner horasTrabajadas = new Scanner(System.in);
        empWorkHours = horasTrabajadas.nextDouble();

        System.out.println("El valor de la hora de trabajo: ");
        Scanner valorHora = new Scanner(System.in);
        hourPrice = valorHora.nextDouble();

        System.out.println("Ingrese el valor de retencion a la fuente: ");
        Scanner reteFuente = new Scanner(System.in);
        reteValue = reteFuente.nextDouble() / 100;

        subtotalSalary = empWorkHours * hourPrice;
        reteTotal = subtotalSalary * reteValue;
        totalSalary = subtotalSalary - reteTotal;
        
        System.out.println("El código del trabajador es: " + empCod);
        System.out.println("El nombre del trabajador es; " + empName);
        System.out.println("El salario bruto del trabajador es: " + subtotalSalary);
        System.out.println("El salario neto del trabajador es: " + totalSalary);

    }
}
