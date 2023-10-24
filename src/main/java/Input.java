import java.util.Scanner;

public class Input {

    public static void inputPersonCnt(Check check){

        System.out.println("На сколько человек разделить счет?");
        int cnt;
        Scanner scan = new Scanner(System.in);
        while (true) {

            if (scan.hasNextInt()) {
                cnt = scan.nextInt();
                if (cnt > 1){
                    check.setPersonCnt(cnt);
                    break;
                } else {
                    System.out.println("Введено некоректное значение, повторите ввод:");
                    scan.nextLine();
                }
            } else {
                System.out.println("Введено некоректное значение, повторите ввод:");
                scan.nextLine();
            }

        }
    }

    public static void inputCheck(Check check){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        while (true){
            double price;
            System.out.println("Введите название товара:");
            String productName = scan.next();
            System.out.println("Введите стоимость товара:");
            scan.nextLine();
            while(true){
                if (scan.hasNextDouble()) {
                    price = scan.nextDouble();
                    if (price >= 0){
                        check.addProduct(productName,price);
                        break;
                    } else {
                        System.out.println("Введено некоректное значение, повторите ввод:");
                        scan.nextLine();
                    }
                } else {
                    System.out.println("Введено некоректное значение, повторите ввод:");
                    scan.nextLine();
                }
            }
            System.out.println("Добавить еще один товар?");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("завершить")){
                break;
            }
        }
    }

}
