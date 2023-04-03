public class Separ implements TwoStringsOper{
    String spr;

    public Separ(String spred) {
        this.spr = spred;
    }

    @Override
    public String apply(String str1, String str2) {
        str1+= spr + str2;
        return str1;
    }
}
