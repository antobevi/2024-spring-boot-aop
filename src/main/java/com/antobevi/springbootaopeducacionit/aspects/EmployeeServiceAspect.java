package com.antobevi.springbootaopeducacionit.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

    @Before(value = "execution(* com.antobevi.springbootaopeducacionit.services.EmployeeService.*(..)) && args(name, id)")
    public void beforeAddEmployee(JoinPoint joinPoint, String name, String id) {
        System.out.println("Metodo Before: ".concat(joinPoint.getSignature().toString())); // Firma del punto de union JoinPoint
        System.out.println("Creando empleado: ".concat(name));
    }

    @After(value = "execution(* com.antobevi.springbootaopeducacionit.services.EmployeeService.*(..)) && args(name, id)")
    public void afterAddEmployee(JoinPoint joinPoint, String name, String id) {
        System.out.println("Metodo After: ".concat(joinPoint.getSignature().toString())); // Firma del punto de union JoinPoint
        System.out.println("El empleado ha sido creado correctamente: ".concat(name));
    }

}
