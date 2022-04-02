public class Book {
//state 
private int numOfCopies;

void setCopies(int numOfCopies){
    this.numOfCopies = numOfCopies;
}

void getCopies(){
    System.out.println(this.numOfCopies);
}
//behavior below
    void readingBook(){
        System.out.println("reading");
    }

}