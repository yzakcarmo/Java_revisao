package entities;

import java.time.LocalDate;

public class Client {
    private String name;
    private LocalDate birthDate;
    private String email;
    
    public Client(String name, LocalDate birthDate, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }
    public Client() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
