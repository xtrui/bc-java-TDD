package junit5.tdd;

public class FiZZBuzzWhizz {
    public FiZZBuzzWhizz() {

    }

    public String play(int count) {
        String result = "";
        if (count == 1) {
            result = "1";
            System.out.println(result);

        } else {
            for (int i = 1; i <= count; i++) {
                result = "";
                if (i % 3 == 0) {
                    result += "Fizz";
                }
                if (i % 5 == 0) {
                    result += "Buzz";
                }
                if (i % 7 == 0) {
                    result += "Whizz";
                }
                if (result == "") {
                    result = String.valueOf(i);
                }
                System.out.println(result);
            }
        }

        return result;
    }
}
