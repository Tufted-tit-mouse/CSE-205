public class H03_35 {

    public H03_35() {}

    public String reverse(String s) {

        if (s.length() <= 1) {
            return s;
        }

        return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}