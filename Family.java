class Family {
    void sayName(String name){
        System.out.println("hello " + name);
    }
    public static void main(String[] args){
        Family josh = new Family();
        Family brennan = new Family();

        josh.sayName("Josh");
        brennan.sayName("Brennan");
    }
}