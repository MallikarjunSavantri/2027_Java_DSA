package Strings.StringBuffer;

public class MyString {
    private String str;

    public MyString(String str) {
        this.str=str;

    }
    public MyString modify(String str){
        if(this.str==str){
            return this;
        }else{
            return new MyString(str);
        }
    }

    @Override
    public String toString(){
        return str;
    }
    public static void main(String[] args) {
        MyString s=new MyString("765");
        MyString modifMyString=s.modify("765RS");
        System.out.println(modifMyString);

    }
}
