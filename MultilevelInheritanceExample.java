class Grandparent{
    void famiyName(){
        System.out.println("Family Name:Johnson");
    }
}
class Parent extends Grandparent{
    void displayName(){
        System.out.println("Parent's Name:John");
    }
}
class Child extends Parent {
    void childName(){
        System.out.println("Child's Name: Mike");
    } 
}



public class MultilevelInheritanceExample {
    public static void main(String[] args){
        Child child = new Child();
        child.familyName();
        child.displayName();
        child.childName();
    }
}
