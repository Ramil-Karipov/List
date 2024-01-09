package com.list.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addContact("Новосельцев Виктор Викторович", 1, 140000);
        service.addContact("Константинов Ефим Вячеславович ", 2, 865040);
        service.addContact("Копадзе Давид Михайлович ", 3, 77477);
        service.addContact("Касьяненко Александр Владимирович", 3, 80500);
        service.addContact("Ямшанов Андрей Николаевич", 3, 56300);
        service.addContact("Дядин Геннадий Иванович ", 2, 77500);
        service.addContact("Логинов Анатолий Романович", 2, 103000);
        service.addContact("Турович Александра Васильевна", 1, 47000);
        service.addContact("Идиатулин Егор Андреевич", 1, 67300);
        service.addContact("Волков Алексей Сергеевич", 1, 67800);
        //service.addContact("Иванов Иван Иванович",0,5000);

        service.printAllInformation();
        System.out.println();
        service.calculateSalary();
        System.out.println();
        service.findMinimalSalaryWorker();
        System.out.println();
        service.findHighestSalaryWorker();
        System.out.println();
        service.findAverageSalary();
        System.out.println();
        service.printAllEmployeesFullNames();
        System.out.println();
        service.calculateSalaryOfDepartment(1);
        System.out.println();
        service.findAverageSalaryOfDepartment(2);
        System.out.println();
        service.indexSalary();
        System.out.println();
        service.printAllInformation();
        System.out.println();
        service.findMinimalSalaryWorkerOfDepartment(3);
        System.out.println();
        service.findHighestSalaryWorkerOfDepartment(4);
        System.out.println();
        service.indexSalaryOfDepartment(10, 5);
        System.out.println();
        service.printAllInformation();
        System.out.println();
        service.printAllInformationOfDepartment(1);
        System.out.println();
        service.findWorkersWithSalaryBelowParameter(60000);
        System.out.println();
        service.findWorkersWithSalaryHigherParameter(45000);
    }
}

