public class WordWrap {
    public static String wrapping(String text, int columnWidth) {

        boolean shorterThanColumn = text.length() < columnWidth;
        if (shorterThanColumn) {
            return text;
        }

        boolean biggerThanColumn = text.length() > columnWidth;
        if (biggerThanColumn) {
            return wrapString(text, columnWidth);
        }
        return "";
    }

    private static String wrapString(String text, int columnWidth) {
        int newLineCount = 0;
        String res = "";
        res += text.substring(0, columnWidth).concat("\n");
        for (int i = 1; i <= text.length(); i++) {
            if (i + columnWidth > text.length()) {
                res += text.substring(res.lastIndexOf("\n")-newLineCount);
                break;
            } else if (i % columnWidth == 0) {
                res += text.substring(i, i + columnWidth).concat("\n");
                newLineCount++;
            }
        }
        return res;
    }

}
