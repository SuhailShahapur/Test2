package Oops.Encapsulation;

public class EnBank {
    private String Name;
    private long Acc_no;
    private long Amount;

    public void setName(String name) {
        Name = name;
    }
    public void setAcc_no(long Acc_no){
        this.Acc_no=Acc_no;
    }

    public void setAmount(long amount) {
        Amount = amount;
    }

    public String getName() {
        return Name;
    }

    public long getAcc_no() {
        return Acc_no;
    }

    public long getAmount() {
        return Amount;
    }
}
class BankDetails{
    public static void main(String[] args) {
        EnBank s1 = new EnBank();
        s1.setName("suhail");
        s1.setAmount(676883);
        s1.setAcc_no(348922413);
        System.out.println(s1.getAcc_no()+"   "+s1.getAmount()+"     "+s1.getName());
    }
}
