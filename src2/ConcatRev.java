public class ConcatRev implements TwoStringsOper{

    @Override
    public String apply(String str1, String str2) {
        str2+=str1;
        return str2;
    }
}
