public class Initials implements TwoStringsOper {
    @Override
    public String apply(String str1, String str2) {
        String in;
        in = str1.charAt(0) + String.valueOf(str2.charAt(0));
        return in;
    }
}
