package Strings;

public class Series {
    public static void main(String[] args) {
        String series=" ";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);

        
        StringBuffer series1 = new StringBuffer();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            series1.append(ch);
        }
        System.out.println(series1);

    }
    
}
