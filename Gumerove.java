public class Gumerove{
    private String name;
    private int age;
    
    Gumerove(){
        this.name = "uknown";
        this.age = 100;
    }
    Gumerove(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getMember(){
        System.out.printf("name: %s age: %d",this.name, this.age).println();
    }

}