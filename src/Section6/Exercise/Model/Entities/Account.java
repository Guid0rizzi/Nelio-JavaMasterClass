package Section6.Exercise.Model.Entities;

public class Account {
    Integer number;
    String holder ;
    Double balance;
    Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){

        this.balance += amount;
    }
    public void withdraw(Double amount) throws BusinessException{
        if(amount > this.withdrawLimit ){
            throw new BusinessException("The amount exceeds withdraw limit");
        }
        if(amount > this.balance){
            throw new BusinessException("Not enough balance");
        }
        this.balance -= amount;
    }
}
