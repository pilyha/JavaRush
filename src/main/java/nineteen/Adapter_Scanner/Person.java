package nineteen.Adapter_Scanner;

import java.util.Date;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String toString()
    {
        return String.format("%s %s %s %s",lastName,firstName,middleName,birthDate);
    }

}
