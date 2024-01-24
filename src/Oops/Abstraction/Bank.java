package Oops.Abstraction;

public abstract class Bank {
    abstract void ROI();
}
class SBI extends Bank{
    void ROI(){
        System.out.println("Rate of interest of SBI bank  is 7%");
    }

}
class CITI extends Bank{
    @Override
    void ROI() {
        System.out.println("Rate of interest of citi bank is 8%");
    }
}
class BankInformation{
    public static void main(String[] args) {
        CITI c = new CITI();
        SBI s = new SBI();
        c.ROI();
        s.ROI();
    }
}