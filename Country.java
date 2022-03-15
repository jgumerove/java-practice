public class Country {

    void stateCountry(String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        Country ukraine = new Country();
        Country unitedStates = new Country();

        ukraine.stateCountry("Ukraine");
        unitedStates.stateCountry("United States");
    }

}