import static org.junit.jupiter.api.Assertions.*;

import csc4700.Bank;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BankTest {

    private Bank bank = new Bank();

    @Test
    public void testSetGetBalance() {
        // Setup
        String accountName = "jdob";

        // Test
        bank.setBalance(accountName, 100);
        bank.setBalance("other", 200);

        // Verify
        int found = bank.getBalance(accountName);
        assertEquals(100, found);
    }

    @Test
    public void testMultipleSetBalance() {
        // Setup
        String accountName = "jdob";

        // Test
        bank.setBalance(accountName, 100);
        bank.setBalance(accountName, 200);

        // Verify
        int found = bank.getBalance(accountName);
        assertEquals(200, found);
    }

    @Test
    public void testGetBalanceNoAccount() {
        // Test
        try {
            bank.getBalance("foo");
            fail("Expected error");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testListAccounts() {
        // Setup
        bank.setBalance("jdob", 1);
        bank.setBalance("mdob", 1000);
        bank.setBalance("ldob", 200);

        // Test
        String[] accountNames = bank.listAccounts();

        // Verify
        String[] expected = {"jdob", "mdob", "ldob"};
        Arrays.sort(accountNames);
        Arrays.sort(expected);

        assertArrayEquals(expected, accountNames);
    }

    @Test
    public void testListAccountsNoAccounts() {
        // Test
        String[] found = bank.listAccounts();

        // Verify
        String[] expected = {};
        assertArrayEquals(expected, found);
    }

    @Test
    public void testDeleteAccount() {
        // Setup
        bank.setBalance("jdob", 100);

        // Sanity Check
        assertEquals(1, bank.listAccounts().length);

        // Test
        bank.deleteAccount("jdob");

        // Verify
        String[] allAccounts = bank.listAccounts();
        assertEquals(0, allAccounts.length);
    }

    @Test
    public void testDeleteInvalidAccount() {
        // Test
        bank.deleteAccount("jdob");

        // Verify
        String[] allAccounts = bank.listAccounts();
        assertEquals(0, allAccounts.length);
    }

}
