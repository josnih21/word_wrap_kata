public class WordWrap {
    public static String wrapping(String text,int columnWidth){
        String res = "";
        if (text.length() < columnWidth){
            return text;
        }

        if(text.length() > columnWidth){
            return text.substring(0,columnWidth)+"\n"+text.substring(columnWidth,text.length());
        }
        return "";
    }


    public static String recursiveWrapping(String text,int columnWidth){
        String finalString = text.substring(0,columnWidth)+"\n";
        if(text.substring(columnWidth,text.length()).length()> columnWidth){
          finalString += text.substring(finalString.length(),finalString.length()+columnWidth)+"\n";

        }

        return finalString+=recursiveWrapping(text,columnWidth);
    }
}
