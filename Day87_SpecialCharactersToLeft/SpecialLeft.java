import java.util.*;
class SpecialLeft{
    static void specialChar(String str){
        String s1="";
        String s2="";
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>=48 && str.charAt(i)<=57) || (str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122) ){
                s1 +=str.charAt(i);
            }
            else{
                s2 +=str.charAt(i);
            }
        }
        System.out.println(s2+s1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String str =sc.nextLine();
        specialChar(str);
}
}
