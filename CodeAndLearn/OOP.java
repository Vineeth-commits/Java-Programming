// Objects have state and behaviour. Stores state as fields(member variables) and behaviour as methods.
// Class is a blueprint for creating objects
// objects are also called instance
// super is used to access/call the parent class members(variables and methods)
// this is used to call the current class members(variables and methods).
// super and this can be used anywhere in a class except static areas(the static block or a static method)
// this() can be used only in a constructor, and it must be the first statement in a constructor.
// this() is used with constructor chaining.
// super() is used to call a parent constructor. Also must be a first statement in a constructor.
// An abstract class is still a super class, so its contructors run when someone makes an instance of a concrete subclass.
// A constructor cant call both super() and this()
// Method overloading means providing two or more separate methods in a class with the same name but different parameters.
// Method return type may or may not be different and that allows us to reuse the same method name.
// Overloading doesnt have anything to do with polymorphism but Java devs often refer to overloading as compile time polymorphism.
// Overloading happens inside a single class, but a method can also be treated as overloaded in the subclass of that class.
// Method overriding means defining a method in a child class that already exists in the parent class with same signature(same name,same arguments)
// Method overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch, because the method that is going to be called is decided at runtime by the JVM.
// While overriding a method, @Override annotation must be put above the method definition.
// One cant override static methods only instance methods.
/* Rules for method overriding -
    *must have same name and same arguments
    *return type can be subclass of the return type in the parent class
    *It cant have a lower access modifier. Ex if the parent method is protected then using private in the child is not allowed but using public in the child would be allowed.
*/
/* Important points on overriding
    1. only inherited methods can be overriden, in other words methods can be overriden only in child classes
    2. Constructors and private methods cant be overridden
    3. Methods that are final cant be overriden
    4. A subclass can use super.methodName() to call the superclass version of an overridden method
*/
/* Static methods
    1. Static methods cant access instance methods and instance variables directly
    2. Used for operations that dont require any data from an instance of the class.
    3. this cant be used.
    4. Static methods can call other static methods without creating instances
*/
/* Instance methods
    1. Instance methods belong to an instance of a class
    2. Instance methods can access instance methods and instance variables directly
    3. They can also access static methods and static variables directly
*/
/* Static variables
    1. They are also known as static member variables
    2. Every instance of that class shares the same static variables
    3. If changes are made to that variable, all other instances will see the effect of the change. 
    4. Scanner can be defined static which makes it available to every instance
*/
/* Instance variables
    1. They are also known as fields or member variables
    2. Instance variables belong to an instance of a class
    3. Every instance has its own copy of an instance variable
*/
/* */   
public class OOP {
    public static void main(String[] args) {
        Car ford; //declaration 
        ford = new Car(); // initialization
        Car Merc = new Car("Mayback","V12","black");
        // ford = null;
        System.out.println("Model is "+ford.getModel());
        ford.setModel("Raptor");
        System.out.println("Model is "+ford.getModel());
        Merc.getEngine();
        Animal animal = new Animal("Animal",1,1,4,5);
        Dog dog = new Dog("Dog",1,2,2,2,2,2,2);
        // To access objects, we use references which point to the memory where the objects are stored.
        // this reference points to the dog, so any changes made in either will affect both. Its like a pointer.
        Dog anotherDog = dog;
        dog.eat();
        dog.walk();
        dog.run();
    }
}
