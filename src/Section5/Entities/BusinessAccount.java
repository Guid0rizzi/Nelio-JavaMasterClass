package Section5.Entities;

public class BusinessAccount extends Account {
    private Double loanLimit;
    public BusinessAccount(){
    super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }//o super ele pega os atributos da super Classe(Account)

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount) {
        //quando voce empresta o dinheiro
        if (amount <= loanLimit){
        //    deposite(amount);
            balance += amount - 10.0; // o balance vai começar a ser protected pra o BusinesAccount ter acesso a ele
    }

    }
    @Override
    public void withdraw (Double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
