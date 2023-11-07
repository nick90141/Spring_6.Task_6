import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ExceptionLoggingAspect {

    @AfterThrowing(pointcut = "execution(* Task_7.YourClass.divide(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        System.out.println("Ошибка в методе " + joinPoint.getSignature().toShortString() + ": " + ex.getMessage());
    }
}
