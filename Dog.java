class Dog extends Animal1 {
    void sound() {
        System.out.println("Dog barks");
    }
    void bite(int c)
    {
        System.out.println("Dog bites"+ c);
    }
     public static void main(String args[]) {
        Animal1 a;
        a=new Dog();  //The object’s reference type is Animal, but object type is Dog.
        a.sound();
        a=new Cat1();
        a.sound();
        
    }
}
