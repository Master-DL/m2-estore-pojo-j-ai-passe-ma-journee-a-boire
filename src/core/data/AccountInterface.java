package core.data;

import estorePojo.exceptions.InsufficientBalanceException;

public interface AccountInterface {

    String getOwner();

    void setOwner(String owner);

    double getAmount();

    void setAmount(double amount);

    void credit(double amount);

    void withdraw(double amount) throws InsufficientBalanceException;
}
