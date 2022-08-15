package HW_1_9;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return name + "  " + surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {return Objects.hash(name, surname);
    }
    @Override
    public boolean equals(Object obj) {return super.equals(obj);
    }
    @Override
    public String toString() {return super.toString();}

}
