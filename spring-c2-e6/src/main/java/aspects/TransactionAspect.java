package aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TransactionAspect {

  // @Before, @After, @AfterReturning, @AfterThrowing

//  @Around("@annotation(Transaction)")
//  public void transactionLogic(ProceedingJoinPoint pjp) throws Throwable {
//    try {
//      System.out.println("Begin transaction");
//      pjp.proceed();
//      System.out.println("Transaction committed");
//    } catch (Exception e) {
//      System.out.println("Transaction rolledback");
//    }
//  }

  @Before("@annotation(Transaction)")
  public void beginTransaction() {
    System.out.println("Begin transaction");
  }

  @AfterReturning("@annotation(Transaction)")
  public void commitTransaction() {
    System.out.println("Transaction committed");
  }

  @AfterThrowing("@annotation(Transaction)")
  public void rollbackTransaction() {
    System.out.println("Transaction rolledback");
  }
}
