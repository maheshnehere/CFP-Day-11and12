package com.bridgelabz.stock;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AccountTest {


    @Test
    public void testDebit() {
        Account account = new Account(1000.0);

        assertEquals(1000.0, account.getBalance(), 0.001);  // Initial balance

        account.credit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.001);  // After crediting

        account.debit(200.0);
        assertEquals(1300.0, account.getBalance(), 0.001);  // After debiting

        account.debit(1500.0);
        assertEquals(1300.0, account.getBalance(), 0.001);  // Balance should remain unchanged
    }
}

