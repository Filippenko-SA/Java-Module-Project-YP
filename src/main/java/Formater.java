public class Formater {
    public static String format(double number){
        String result;
        int num = (int)Math.floor(number);
        num = Math.abs(num);
        num = num % 100;
        if (num > 19) {
            num = num % 10;
        }
        switch (num){
            case 1:
                result = "рубль";
                break;
            case 2:
            case 3:
            case 4:
                result = "рубля";
                break;
            default:
                result = "рублей";
        }
        return String.format("%.2f %s", number, result);
    }
}
