package p15.composite;

public class StringUtil {
    public static String buildString(char c, int num) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            sb.append(c);
        }
        return sb.toString();
    }
}
