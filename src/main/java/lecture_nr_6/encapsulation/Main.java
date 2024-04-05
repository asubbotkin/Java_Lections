package lecture_nr_6.encapsulation;

import lecture_nr_6.encapsulation.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("4444111188883333", "asdfsdfgsdfg", 123);

//        creditCard.setCardNumber("8888889900001111");
        System.out.println(creditCard.getCardNumber());
    }
}
