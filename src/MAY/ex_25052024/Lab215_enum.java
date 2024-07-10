package MAY.ex_25052024;

public class Lab215_enum {
    public static void main(String[] args) {

        // enums are used to keep the constants
        // enums are special type of variables which will basically keep pre-defined constants in separate class

        // How to use enum
        // Assigning FRIDAY enum constant from the Day enum to variable d
        Day d = Day.FRIDAY;
        System.out.println(d);

        // Iterating through each value of the Size enum to print all the sizes
        for (Size size : Size.values()) {
            // Printing the size and its abbreviation using the getSize() method
            System.out.println("Size: " + size + ", Abbreviation: " + size.getSize());
        }
    }
}



// creating an enum using enum keyword
enum Day{
    // enums are list of constants, Enum representing days of the week
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
} // here enum is used as a String

// we can create enum like this also, Enum representing sizes
enum Size{
    // Enum constants with associated abbreviations S,M,L,XL
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    // we can create Instance variable to store abbreviation
    private String size;

    // here we need to generate constructors to initialize abbreviation
    Size(String s) {
        this.size = s;
    }

    // Getter method to retrieve abbreviation
    public String getSize() {
        return size;
    }

    // Setter method to set abbreviation (not used in this example)
    public void setSize(String size) {
        this.size = size;
    }

}


