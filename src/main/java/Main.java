
public class Main {
    public static void main(String[] args) {

        Check check = new Check();
        Input.inputPersonCnt(check);
        Input.inputCheck(check);
        check.printCheck();
    }
}