

import org.Fawry.Account;
import org.Fawry.AccountImpl;
import org.Fawry.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class AccountManagerMokito {
  Account accountManager = new AccountImpl();

  @Test
  void test1(){
    Customer customer = Mockito.mock(Customer.class);
    Mockito.when(customer.getBalance()).thenReturn(20);
    System.out.println(customer.getBalance());


    String result = accountManager.withdraw(customer, 80);

    // Assert
    int expectedBalance = customer.getBalance();
    Assertions.assertEquals(20, expectedBalance);
    Assertions.assertEquals("success", result);
  }

}