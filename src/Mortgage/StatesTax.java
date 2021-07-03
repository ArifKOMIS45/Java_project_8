package Mortgage;

public enum StatesTax {NEWYORK(20), NEWJERSEY(15),FLORIDA(5),OHIO(12);

    private int tax;

    StatesTax(int tax1) {

        this.tax = tax1;
    }

    public int getTax() {
        
        return tax;
    }


}



