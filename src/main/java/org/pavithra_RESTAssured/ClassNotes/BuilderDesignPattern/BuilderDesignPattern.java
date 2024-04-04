package org.pavithra_RESTAssured.ClassNotes.BuilderDesignPattern;

public class BuilderDesignPattern {
public  BuilderDesignPattern Stag1()
{
    System.out.println("Stag 1");
    return this;
}

    public BuilderDesignPattern Stag2(String str)
    {
        System.out.println("Stag 2 String is "+str);
        return this;
    }

    public BuilderDesignPattern Stag3()
    {
        System.out.println("Stag 3");
        return this;
    }

    public static void main(String[] args) {

        BuilderDesignPattern bp = new BuilderDesignPattern();
        bp.Stag1().Stag2("test").Stag3();

    }






}
