public interface Transferable extends Accountable{
    void transfer(Transferable recipient, double amount);
    void showHistory();

}
