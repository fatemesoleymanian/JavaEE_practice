package org.example;


public class Dev {
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }

    //    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//    public Dev(int age){
//        this.age = age;
//    }
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    private int age;
    public Dev(){
        System.out.println("dev is created");
    }

    public void compile(){
        System.out.println("dev is working on awesome project");
        computer.compile();
    }
}
