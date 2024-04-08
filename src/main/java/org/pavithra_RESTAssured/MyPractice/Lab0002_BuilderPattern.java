package org.pavithra_RESTAssured.MyPractice;

public class Lab0002_BuilderPattern {
public Lab0002_BuilderPattern exam1(){
    System.out.println("Pass");
    return this;
}
public Lab0002_BuilderPattern exam2(String msg){
    System.out.println("Maths "+ msg);
    return this;
}
public Lab0002_BuilderPattern exam3(){
    System.out.println("Pass");
    return this;
}
public Lab0002_BuilderPattern exam4(){
    System.out.println("Pass");
    return this;
}


    public static void main(String[] args) {
        Lab0002_BuilderPattern bp = new Lab0002_BuilderPattern();
        bp.exam1().exam2("pass").exam3().exam4();
    }
}