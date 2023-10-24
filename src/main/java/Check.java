public class Check {
    private String checkResult;
    private double totalPrice;
    private int personCnt;
    Check(){
        this.checkResult = "Добавленные товары:\n";
    }
    public void setPersonCnt(int personCnt){
        this.personCnt = personCnt;
    }
    public void addProduct(String producName, double productPrice) {
        this.checkResult = this.checkResult + String.format("%s %s\n", producName, Formater.format(productPrice));
        this.totalPrice += productPrice;
        System.out.println(String.format("Товар успешно добавлен, всего добавлено товаров на сумму %s.", Formater.format(this.totalPrice)));
    }
    public void printCheck(){
        System.out.println(this.checkResult);
        System.out.println(String.format("Cтоимость всех товаров %s, каждый человек должен заплатить %s.", Formater.format(this.totalPrice), Formater.format(this.totalPrice/this.personCnt)));
    }
}
