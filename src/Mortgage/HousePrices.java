package Mortgage;

public class HousePrices extends Users {
    private int price;

    public HousePrices(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondition, houseType, roomCount, downPayment, longTerm, statesTax);
    }

    public void roomCountToPrice() {
        if (getRoomCount() == 0) price += 10000;
        if (getRoomCount() == 1) price += 20000;
        if (getRoomCount() == 2) price += 30000;
        if (getRoomCount() == 3) price += 40000;
        if (getRoomCount() == 4) price += 50000;
        if (getRoomCount() == 5) price += 60000;

    }

    public void ConditionToPrice() {
        if (getWhichCondition().equalsIgnoreCase("new")) price += 50000;
        if (getWhichCondition().equalsIgnoreCase("like new")) price += 40000;
        if (getWhichCondition().equalsIgnoreCase("old")) price += 30000;
        if (getWhichCondition().equalsIgnoreCase("Renew Required")) price += 15000;
    }


    public void houseTypeToPrice() {
        if (getHouseType().equalsIgnoreCase("Apartment")) price += 20000;
        if (getHouseType().equalsIgnoreCase("condo")) price += 30000;
        if (getHouseType().equalsIgnoreCase("house")) price += 40000;
    }

    public int getPriceTotal() {
        houseTypeToPrice();
        ConditionToPrice();
        roomCountToPrice();
        price += price * getStatesTax().getTax()/100;
        return price ;
    }


    /*
            Create a method name is getPriceTotal
            return type is int
            Return the total price(housetype, condition and roomcount prices)
            Also you need to calculate the tax and add  to the price
            For the tax percentage use the StatesTax enum
     */

     /*
        getPriceTotal isimli bir method oluştur
        return türü int olsun
        total price return et(housetype, condition ve roomcount price lar)
        Ayrıca tax hesaplayıp price a eklemeniz gerekiyor
        tax yüzdesi için StatesTax enum kullanınız
      */

    //---------------------------------------------------------------------------------------------------------


    //---------------------------------------------------------------------------------------------------------
public int getPriceEachMonth(){
    int payment=price-getDownPayment();
    payment/=getLongTerm();
    return payment;
}

    /*
        Create a method name is getPriceEachMonth

            Return the monthly payment amount.
            reduce the downpayment and calculate the each month's payment
     */

     /*
        getPriceEachMonth isimli bir method oluştur

        monthly payment amount return et
        downpayment azalttıktan sonra LongTerm e bölerek ve her ayın payment'ini hesaplayın
     */
    //---------------------------------------------------------------------------------------------------------


    //---------------------------------------------------------------------------------------------------------

}




