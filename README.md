##Principio 1 – Single Responsibility Principle (SRP)

    Aplicación:
    Refactorizamos la clase original UserManager separando la validación de usuarios, la persistencia y el envío de correos en clases independientes (UserValidator, UserRepository, EmailService).
    
    Problemas que resolvió:
    
    La clase original tenía demasiadas responsabilidades, lo que dificultaba mantenimiento y pruebas.
    
    Ahora cada clase tiene una sola responsabilidad, aumentando la modularidad y facilidad de extensión.

##Principio 2 – Open/Closed Principle (OCP)

    Aplicación:
    Creamos una interfaz PaymentMethod y distintas implementaciones (CreditCardPayment, PayPalPayment, CashPayment). PaymentProcessor depende de la interfaz y no necesita cambios al agregar nuevos métodos de pago.
    
    Problemas que resolvió:
    
    Antes, agregar un nuevo método de pago requería modificar PaymentProcessor, aumentando el riesgo de errores.

    Ahora el código está abierto a extensión pero cerrado a modificación.

##Principio 3 – Liskov Substitution Principle (LSP)

    Aplicación:
    Rediseñamos la jerarquía de animales para que solo los que caminan implementen walk(). Por ejemplo, Fish no hereda un método walk() que no puede implementar.
    
    Problemas que resolvió:
    
    Antes, sustituir un Fish por un Animal generaba errores en tiempo de ejecución.
    
    Ahora todas las subclases son completamente sustituibles por la clase base.

##Principio 4 – Interface Segregation Principle (ISP)

    Aplicación:
    Dividimos la interfaz Device en interfaces más específicas (TurnOnOffable, Chargeable) para que las clases solo implementen lo que necesitan. Por ejemplo, DisposableCamera no implementa Chargeable.
    
    Problemas que resolvió:
    
    Antes, las clases eran forzadas a implementar métodos innecesarios, generando excepciones.
    
    Ahora cada clase implementa únicamente los métodos que realmente usa, aumentando cohesión y claridad.

##Principio 5 – Dependency Inversion Principle (DIP)

    Aplicación:
    PaymentProcessor ahora depende de la abstracción PaymentMethod en lugar de una clase concreta (CreditCardPayment). Creamos implementaciones concretas para distintos métodos de pago (PayPalPayment, CryptoPayment).
    
    ##Problemas que resolvió:
    
    Antes, PaymentProcessor estaba acoplado a una implementación concreta, lo que dificultaba cambios y pruebas.
    
    Ahora, el procesador puede trabajar con cualquier método de pago que implemente la interfaz, mejorando flexibilidad y desacoplamiento.

##Reflexión Final del Grupo

    En nuestro proyecto, los principios que más aplicamos fueron SRP y OCP, ya que son los que más impacto tienen en la modularidad y escalabilidad de proyectos reales. Aplicar SOLID nos permitió separar responsabilidades, reducir acoplamientos y facilitar futuras extensiones sin modificar el código existente.
