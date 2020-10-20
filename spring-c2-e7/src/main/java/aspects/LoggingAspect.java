package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
@Order(2)
public class LoggingAspect {


  @Around("@annotation(ToLog)")  // AspectJ pointcut expression
  public void log(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("LOGGING Starting time " + LocalDateTime.now());
    pjp.proceed();
    System.out.println("LOGGING Ending time " + LocalDateTime.now());
  }
}
