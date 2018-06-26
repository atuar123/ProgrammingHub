package basic.IsARelationShip;

public class Child extends Parent {
    @Override
    public void money() {
        System.out.println("For Smoking");

    }

    public void m2() {
        System.out.println("Child  methd");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.money();//parent class ar method ta show korse
        Child child = new Child();
        child.m1();
        child.m2();
        child.money();//by child we can get all the method of self and parent
        Parent parentReference=new Child();//most dangerious because by this we not hold child class specific method .
        parentReference.m1();
        parentReference.money();//here we can not get the specific child method  m2()
    }
}
