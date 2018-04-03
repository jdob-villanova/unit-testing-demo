package csc4700.bank;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<String, Integer> accounts = new HashMap<>();

    public void setBalance(String name, int newBalance) {
        accounts.put(name, newBalance);
    }

    public int getBalance(String name) {
        if (!accounts.containsKey(name)) {
            throw new IllegalArgumentException();
        }
        return accounts.get(name);
    }

    public void deleteAccount(String name) {
        accounts.remove(name);
    }

    public String[] listAccounts() {
        return accounts.keySet().toArray(new String[accounts.size()]);
    }

}
