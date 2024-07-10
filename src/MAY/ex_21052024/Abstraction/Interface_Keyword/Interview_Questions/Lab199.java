package MAY.ex_21052024.Abstraction.Interface_Keyword.Interview_Questions;

public class Lab199 {
}

// Rules of interface

interface I1{}
interface I2{}
class A{} // this is a concrete class
class B{} // this is a concrete class
abstract class C{} // this is an incomplete class
class Test1 extends A{} // this is allowed it is single inheritance
class Test2 extends B{}
// class Test3 extends A,B{} This is not allowed because it is multiple inheritance with class
class Test4 implements I1,I2{} // This is allowed it is multiple inheritance
class Test5 extends A implements  I1,I2{}// here we have all type of inheritance
// class Test6 implements I1 extends A{} Not allowed first u need to extend then implement
// interface I3 extends A{}  interface  cannot extends a class
// interface I4 implements A{} not allowed because implements is keyword used for interface
//interface I5 extends A,B{} not allowed
interface I6 extends I1,I2{} //  interface  can only extends interface
// interface I7 extends  C{} Abstract class cannot be extended

// Difference b/w Interface and abstract
/*
   Key Differences
Inheritance:
Abstract classes support single inheritance,
while interfaces support multiple inheritance.
Members:
Abstract classes can have fields, constructors, and both abstract and concrete methods.
Interfaces cannot have instance fields or constructors, but can have abstract, default, and static methods.
Use Case:
 Use abstract classes when classes share a common base of functionality,
and interfaces when classes share a common capability.
Access Modifiers:
 Abstract classes can use different access modifiers for methods and fields,
while interface methods and fields are implicitly public (methods) and public static final (fields).

 */


