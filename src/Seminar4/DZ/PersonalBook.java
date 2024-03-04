package Seminar4.DZ;

import java.util.ArrayList;
import java.util.List;

//Домашнее задание
//Задание 1. Создать справочник сотрудников
//Необходимо:
//        ● Создать класс справочник сотрудников, который
//содержит внутри коллекцию сотрудников - каждый
//сотрудник должен иметь следующие атрибуты:
//        ○ Табельный номер
//○ Номер телефона
//○ Имя
//○ Стаж
//● Добавить метод, который ищет сотрудника по стажу
//        (может быть список)
//● Добавить метод, который выводит номер телефона
//сотрудника по имени (может быть список)
//● Добавить метод, который ищет сотрудника по
//табельному номеру
//● Добавить метод добавление нового сотрудника в
//справочник
public class PersonalBook {
    private List<Persona> Personas;

    public PersonalBook() {
        this.Personas = new ArrayList<>();
    }

    public void addPersona(Persona Persona) {
        Personas.add(Persona);
    }

    public List<Persona> findPersonasByExperience(int targetExperience) {
        List<Persona> result = new ArrayList<>();
        for (Persona Persona : Personas) {
            if (Persona.getExperience() == targetExperience) {
                result.add(Persona);
            }
        }
        return result;
    }

    public List<String> findPhoneNumbersByName(String targetName) {
        List<String> result = new ArrayList<>();
        for (Persona Persona : Personas) {
            if (Persona.getName().equals(targetName)) {
                result.add(Persona.getPhoneNumber());
            }
        }
        return result;
    }

    public Persona findPersonaByPersonaId(int targetPersonaId) {
        for (Persona Persona : Personas) {
            if (Persona.getPersonaId() == targetPersonaId) {
                return Persona;
            }
        }
        return null; // Persona not found
    }
}
