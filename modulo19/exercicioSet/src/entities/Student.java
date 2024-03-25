package entities;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer cod;
    private String name;

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getCod(), student.getCod());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public int compareTo(Student other) {
        return cod.compareTo(other.cod);
    }

    @Override
    public String toString() {
        return cod + ", " + name;
    }
}
