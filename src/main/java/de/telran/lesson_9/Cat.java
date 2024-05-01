package de.telran.lesson_9;

import java.util.Objects;
import java.util.Comparator;
public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    //compare this cat with some other cat o;
    public int compareTo(Cat o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        }
        //if (this.age == o.age) {
            return 0;

    }


}

