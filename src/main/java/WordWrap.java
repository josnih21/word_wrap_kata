public class WordWrap {
    public static String wrapping(String text,int columnWidth){
        String res = "";
        String restOf = "";
        if (text.length() < columnWidth){
            return text;
        }

        if(text.length() > columnWidth){
            for (int i = 1; i <= text.length() ; i++) {
                if(i%columnWidth == 0){
                    res += text.substring(0,columnWidth).concat("\n");
                    restOf += text.substring(i,columnWidth);
                    if(restOf.length() > columnWidth){
                    }
                }
            }
            return res;
        }
        return "";
    }

}
