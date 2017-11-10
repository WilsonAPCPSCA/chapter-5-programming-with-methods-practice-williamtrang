public class timetoEnglish {
    public static void main(String[] rags) {
        System.out.println(getTimeName(1,00));
    }
    public static String getTimeName (int hours, int minutes) {
        String y = "";
        if (minutes == 45) {
            y = "quarter til ";
            y = abc(hours+1,y);
        }
        else if (minutes == 30) {
            y = "half past ";
            y = abc(hours,y);
        } 
        else if (minutes == 15) {
            y = "quarter past ";
            y = abc(hours,y);
        }
        else if (minutes == 0) {
            y = abc(hours,y) + " o'clock";
        }
        else if (minutes > 19){
            y = numword(minutes) + " minutes past ";
            y = abc(hours,y);
        }
        else if (minutes >= 10 && minutes <=19){
            y = abc(minutes,y) + " minutes past ";
            y = abc(hours,y);
        }
        else {
            y = abc(minutes, y) + " minutes past ";
            y = abc(hours,y);
        }
        if (hours == 12 && minutes == 45) {
            y = "quarter til one";
        }
        return y;
    }
    public static String numword(int x) {
        String y = "";
        if (x > 19 && x != 30 && x !=45) {
            if (x >=20 && x <= 29) {
                y = "twenty ";
                x = x%20;
                y = abc(x,y);
            }
            else if (x >30 && x <= 39) {
                y = "thirty ";
                x = x%30;
                y = abc(x,y);
            }
            else if (x >= 40 && x <= 49) {
                y = "forty ";
                x = x%40;
                y = abc(x,y);
            }
            else if (x >=50 && x <= 59) {
                y = "fifty ";
                x = x%50;
                y = abc(x,y);
            }
        }
        return y;
    }
    public static String abc(int x, String y) {
        if (x == 1){ y = y + "one"; }
        if (x == 2){ y = y + "two"; }
        if (x == 3){ y = y + "three"; }
        if (x == 4){ y = y + "four"; }
        if (x == 5){ y = y + "five"; }
        if (x == 6){ y = y + "six"; }
        if (x == 7){ y = y + "seven"; }
        if (x == 8){ y = y + "eight"; }
        if (x == 9){ y = y + "nine"; }
        if (x == 10){ y = y + "ten"; }
        if (x == 11){ y = y + "eleven"; }
        if (x == 12){ y = y + "twelve"; }
        if (x == 13){ y = y + "thirteen"; }
        if (x == 14){ y = "fourteen"; }
        if (x == 15){ y = "fifteen"; }
        if (x == 16){ y = "sixteen"; }
        if (x == 17){ y = "seventeen"; }
        if (x == 18){ y = "eighteen"; }
        if (x == 19){ y = "nineteen"; }
        return y;
    }
}