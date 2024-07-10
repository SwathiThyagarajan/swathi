package MAY.ex_25052024;

public class Lab212 {
}

class PersonATB{
    Integer rollNo;
    String name;
    Long phoneNumber;


// Generating parameterised constructor
    public PersonATB(Integer rollNo, String name, Long phoneNumber) {
        this.rollNo = rollNo;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    // Generating getter setter
    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}