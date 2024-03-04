package Seminar4.DZ;


public class Persona {
    private int personaId;
    private String phoneNumber;
    private String name;
    private int experience;

    public Persona(int personaId, String phoneNumber, String name, int experience) {
        this.personaId = personaId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getPersonaId() {
        return personaId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }


}
