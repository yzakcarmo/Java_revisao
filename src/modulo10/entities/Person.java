package modulo10.entities;

public class Person {
    private String name;
    private Integer age;
    private Double height;

    /*
     * Wrapper Classes, como a Integer e Double, são uma opção aos tipos primitivos, por se comportarem como classes e permitir valor null
     */

    public Person (String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    
}
