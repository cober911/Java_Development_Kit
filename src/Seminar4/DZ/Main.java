package Seminar4.DZ;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonalBook directory = new PersonalBook();

        // Добавление сотрудников
        directory.addPersona(new Seminar4.DZ.Persona(1, "75756756", "Миша", 10));
        directory.addPersona(new Seminar4.DZ.Persona(2, "4353453", "Никита", 20));
        directory.addPersona(new Persona(3, "345436534", "Денис", 11));

        // Поиск сотрудников по стажу
        List<Persona> employeesWithExperience5 = directory.findPersonasByExperience(10);
        System.out.println("Поиск сотрудников по стажу 10:");
        for (Persona employee : employeesWithExperience5) {
            System.out.println(employee.getName());

            // Поиск номеров телефонов по имени
            List<String> phoneNumbersForJane = directory.findPhoneNumbersByName("Миша");
            System.out.println("Поиск номеров телефонов по имени Миша:");
            for (String phoneNumber : phoneNumbersForJane) {
                System.out.println(phoneNumber);
            }

            // Поиск сотрудника по табельному номеру
            Persona employeeWithId2 = directory.findPersonaByPersonaId(2);
            if (employeeWithId2 != null) {
                System.out.println("Поиск сотрудника по табельному номеру ID 2: " + employeeWithId2.getName());
            } else {
                System.out.println("Сотрудник с таблеме ID 2 не найден");
            }
        }
    }
}
