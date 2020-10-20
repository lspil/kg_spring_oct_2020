package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class LoggingAspect {

  /** WHEN --->> ADVICE
   *        BEFORE, AFTER, AFTER RETURNING, AFTER THROWING, AROUND
   *
   *  WHO --->>  POINTCUT
   */

  @Around("execution(* service.*.*(..))")  // AspectJ pointcut expression
  public Object log(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("Starting time " + LocalDateTime.now());

    Object [] args = {"beer"};
    var res = pjp.proceed(args);

    System.out.println("Ending time " + LocalDateTime.now());
    return res;
  }
}
