package junit5.tdd;

public class FiZZBuzzWhizz {
    public FiZZBuzzWhizz() {

    }

    public String play(int count) {
        String result = "";
        if (count == 1) {
            result = "1";
        } else {
            if (count % 3 == 0) {
                result += "Fizz";
            }

        }

        return result;
    }
}
