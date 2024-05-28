class Amount{
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount x){
        if (this.currency != x.currency)
            throw new RuntimeException("Currencies wont match");
        this.amount = this.amount + x.amount;
    }
    public String fun(){
        return amount + " " + currency;
    }
}


public class f_throwingexceptions {
    public static void main(String args[])
    {
       Amount am1 = new Amount("USD", 10);
       Amount am2 = new Amount("IND", 20);
       am1.add(am2);
       System.out.println(am1.fun());
    }
}
