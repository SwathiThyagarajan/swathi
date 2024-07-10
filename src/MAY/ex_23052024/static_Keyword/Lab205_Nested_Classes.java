package MAY.ex_23052024.static_Keyword;

public class Lab205_Nested_Classes {

    // Nested Classes
    // It is not used very much
    // But a very helpful concept to secure your classes
}

// Nested Class

class OC{  // we have an outer class
  int a = 10;
  class  IC{  //creating another inner class
      void  m2(){  // creating m2 method inside inner class
          System.out.println("Hi, Inner Class"+a);
        // This looks like a proper mother and child relationship
          //  outer class is mother, inner class is child
          // Mother's instance variable "a" can be accessed by child without extending
      }
  }
}
