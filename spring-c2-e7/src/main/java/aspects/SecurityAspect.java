package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
@Order(1)
public class SecurityAspect {

  @Around("@annotation(ToLog)")  // AspectJ pointcut expression
  public void log(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("SECURITY Starting time " + LocalDateTime.now());
    pjp.proceed();
    System.out.println("SECURITY Ending time " + LocalDateTime.now());
  }
}
