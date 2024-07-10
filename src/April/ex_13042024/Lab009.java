package April.ex_13042024;

public class Lab009 {
    public static void main(String[] args) {
        System.out.println("Variables");


        /**
         * Variablers and Datatypes
         * Variable is a container (storage area) used to hold data in the form of value
         * example: In kitchen to store water, sugar, oil etc for each item we have different tyoe of containers
         * similarly in java also we can store  different type of datatypes.
         * ex: if you want to store diffrent things like
         * 1. name = swathi
         * 2.age = 65
         * 3.value of pi = 3.14
         * 4. True or false--> swathi is female--> this is boolean datatype
         * all these values cannot be stored in same type of containers
         */

        /**Strtucture in java
         * Datatype-->variable Name--> = (operator) Variable Value
         * Java is very strict you need to tell what type container/datatype you are going to use
         */

        /** In Java we have 2 types of datatypes
         * 1.primitive datatype-->primitive datatype cannot be further broken
         *   ex: byte, short, int, float, double,boolean, long, char.
         *
         * 2.Non-primitive datatype--> In Non-primitive datatype we have
         * string, arrays and class
         */

        /*
         Each variable should be given a unique name (Identifier)
         int age = 66;
         int age = 65;
         System.out.println(age);
         if you run the above you will get error as below
         variable age is already defined in method main(java.lang.String[])
         the above error is faced because already in line no. 48 you have mentioned variable name
         int age = 65
         you cannot create new container same variable name again
         but you can assign by removing the datatype
         eg: age = 66;-->
         this means 1st you crated a integer container with value 66 then you removed 66 and added 65
          */
        int age = 65;
        age = 66;
        System.out.println(age);
        // here the latest value of age is 66



    }
}
