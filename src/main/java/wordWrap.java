public class wordWrap {
    public static String wrap(String text, int columnWidth) {
        boolean textSmallerThanColumnWidth = text.length() <= columnWidth;
        if (textSmallerThanColumnWidth) {
            return text;
        }
        return wrappingText(text, columnWidth);
    }


    private static String wrappingText(String text, int columnWidth) {
        String textWrapped = "";
        while (true) {
            boolean textBiggerThanColumnWidth = text.length() > columnWidth;
            if (!textBiggerThanColumnWidth) break;
            int indexOfWhiteSpace = text.lastIndexOf(" ", columnWidth);
            if (indexOfWhiteSpace > 0) {
                textWrapped += text.substring(0, indexOfWhiteSpace).concat("\n");
                text = text.substring(indexOfWhiteSpace + 1);
            } else {
                textWrapped += text.substring(0, columnWidth).concat("\n");
                text = text.substring(columnWidth);
            }
        }
        textWrapped += text;
        return textWrapped;
    }
}
