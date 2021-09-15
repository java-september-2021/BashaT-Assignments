//The Object class is considered a superclass because it is at the top of the class Hierarchy
class Person {
    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        //In Java, the this keyword refers to the current object within the context of an instance method or constructor
        this.age = ageParam;
        this.name = nameParam;
    }
    public void objectMethods(Person anotherObject) {
        //.getClass(): returns a Class object that represents the object's current class
        System.out.println("Class name: " + this.getClass().getSimpleName());
        //.toString(): return a string representation of the object. If you want, you can override this method
        System.out.println("toString: " + this.toString());
        //.equals(): compares two objects for equality and returns a boolean
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}


