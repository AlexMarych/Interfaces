public class Concat implements TwoStringsOper{

    @Override
    public String apply(String str1, String str2) {
        str1+=str2;
        return str1;
    }
}
