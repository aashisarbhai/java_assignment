//Enrollment Number:09350402025
//Name:Aashi Sarbhai
// Question 2:Write a Java program to create multiple classes in a single java file and execute each class 
//           independently from JVM? 
class A{
    void print(){
        System.out.println("in class A");
    }
}

class B{
    void display(){
        System.out.println("in class B");
    }
}

class q2{
    public static void main(String[] args) {
        System.out.println("Executing class A");
        A a=new A();
        a.print();

        System.out.println("Executing class B");
        B b=new B();
        b.display();
    }
}
