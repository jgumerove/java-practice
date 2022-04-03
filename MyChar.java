public class MyChar {
    private char chr;

    MyChar(char chr){
        this.chr = chr;
    };

    boolean isVowel(){
        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isConsonant(){
        if(!isVowel()){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isDigit(){
        if((int) chr >= 48 && (int) chr <= 57){
            return true;
        }
        else{
            return false;
        }
    }

        public static void main(String [] args){
            MyChar test = new MyChar('a');
            MyChar b = new MyChar('b');
            System.out.println(test.isVowel());
            System.out.println(b.isVowel());
            System.out.println(b.isConsonant());
            System.out.println(b.isDigit());
            MyChar one = new MyChar('1');
            System.out.println(one.isDigit());
        }
    }
