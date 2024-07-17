package javaprogram.src.NewJAVACodes;

public class PreserveStringPositionAndReverse {
    public static void main(String[] args) {
        String str = "Mullai is good";


        StringBuilder stringBuilder = new StringBuilder(str.length());
        for(int i=str.length() - 1 ; i>=0;i--){
            char ch = str.charAt(i);
//            if(ch != ' '){
                stringBuilder.append(ch);
//            }
        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ' ') {
//                stringBuilder.insert(i, ' ');
//            }
//        }

        System.out.println(stringBuilder.toString());
    }
}
