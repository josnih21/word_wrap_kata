public class WordWrap {
    public static String wrapping(String text,int columnWidth){
        String res = "";
        String restOf = "";
        if (text.length() < columnWidth){
            return text;
        }

        if(text.length() > columnWidth){
            System.out.println(text.length()-1);
            //res += text.substring(0,columnWidth).concat("\n");
            for (int i = 0; i < text.length() ; i++) {
                if(i == text.length()-1){
                 res+=text.substring(text.lastIndexOf("\n"),text.length());

                }else if(i%columnWidth == 0){
                    res += text.substring(i,i+columnWidth).concat("\n");
                }
            }
            return res;
        }
        return "";
    }

}
