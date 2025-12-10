##Principio 1 – Single Responsibility Principle (SRP)

    Aplicación:
    Refactorizamos la clase original UserManager separando la validación de usuarios, la persistencia y el envío de correos en clases independientes:

    UserValidator → valida los datos del usuario
    UserRepository → maneja la persistencia en base de datos
    EmailService → envía correos de bienvenida
    
    Problemas que resolvió:
    La clase original tenía múltiples responsabilidades, dificultando mantenimiento y pruebas.
    Ahora cada clase tiene una sola responsabilidad, aumentando la modularidad y facilitando la extensión y prueba de unidades.
    
    Archivos involucrados:
    principio1SRP/
    ├── UserManager.java
    ├── UserValidator.java
    ├── UserRepository.java
    ├── EmailService.java
    └── Main.java

##Principio 2 – Open/Closed Principle (OCP)

    Aplicación:
    Creamos la interfaz PaymentMethod con distintas implementaciones (CreditCardPayment, PayPalPayment, CashPayment). PaymentProcessor depende de la interfaz y no necesita cambios al agregar nuevos métodos de pago.
    
    Problemas que resolvió:
    Antes, agregar un nuevo método de pago requería modificar PaymentProcessor, aumentando el riesgo de errores.
    Ahora, el código está abierto a extensión pero cerrado a modificación.
    
    Archivos involucrados:
    principio2OCP/
    ├── PaymentMethod.java
    ├── CreditCardPayment.java
    ├── PayPalPayment.java
    ├── CashPayment.java
    ├── PaymentProcessor.java
    └── Main.java

##Principio 3 – Liskov Substitution Principle (LSP)

    Aplicación:
    Rediseñamos la jerarquía de animales para que solo los que pueden caminar implementen walk(). Por ejemplo, Fish no hereda un método walk() que no puede ejecutar.
    
    Problemas que resolvió:
    Antes, sustituir un Fish por un Animal generaba errores en tiempo de ejecución.
    Ahora, todas las subclases son completamente sustituibles por la clase base.
    
    Archivos involucrados:
    principio3LSP/
    ├── Animal.java
    ├── Dog.java
    ├── Fish.java
    ├── Walkable.java
    └── Main.java
    
##Principio 4 – Interface Segregation Principle (ISP)

    Aplicación:
    Dividimos la interfaz Device en interfaces más específicas (TurnOnOffable, Chargeable) para que las clases solo implementen lo que necesitan. Por ejemplo, DisposableCamera no implementa Chargeable.
    
    Problemas que resolvió:
    Antes, las clases eran forzadas a implementar métodos innecesarios, generando excepciones.
    Ahora, cada clase implementa únicamente los métodos que realmente usa, aumentando cohesión y claridad.
    
    Archivos involucrados:
    principio4ISP/
    ├── PhoneFixed.java
    ├── DisposableCameraFixed.java
    ├── TurnOnOffable.java
    ├── Chargeable.java
    └── Main.java


##Principio 5 – Dependency Inversion Principle (DIP)

    Aplicación:
    PaymentProcessor ahora depende de la abstracción PaymentMethod en lugar de una clase concreta (CreditCardPayment). Creamos implementaciones concretas para distintos métodos de pago (PayPalPayment, CryptoPayment).
    
    Problemas que resolvió:
    Antes, PaymentProcessor estaba acoplado a una implementación concreta, dificultando cambios y pruebas.
    Ahora, el procesador puede trabajar con cualquier método de pago que implemente la interfaz, mejorando flexibilidad y desacoplamiento.
    
    Archivos involucrados:
    principio5DIP/
    ├── PaymentProcessor.java
    ├── CreditCardPayment.java
    ├── PayPalPayment.java
    ├── CryptoPayment.java
    ├── PaymentMethod.java
    └── Main.java

##Reflexión Final del Grupo

    En nuestro proyecto, la aplicación de los principios SOLID nos permitió observar de manera práctica cómo un buen diseño de software mejora la mantenibilidad y escalabilidad del código. Los principios que más impacto tuvieron fueron SRP y OCP, ya que nos ayudaron a separar responsabilidades y extender funcionalidades sin modificar el código existente.

Aprendizajes principales:

    Comprendimos la importancia de diseñar clases y métodos con responsabilidades claras y limitadas.
    La segregación de interfaces y la inversión de dependencias facilitan la prueba de unidades y la reutilización de código.
    Aplicar SOLID desde etapas tempranas del desarrollo reduce la aparición de errores y refactorizaciones costosas a futuro.

Beneficios de las herramientas automáticas:
    
    Plugins como PMD y Reformat Plugin nos ayudaron a identificar problemas de estilo, consistencia y posibles errores lógicos rápidamente.
    La combinación de análisis manual y automático permitió corroborar hallazgos y descubrir detalles que podrían pasar desapercibidos.

Desafíos encontrados:
    
    Integrar algunas herramientas, como OWASP Dependency-Check, presentó dificultades debido a configuraciones de API y restricciones de red.
    Aprender a interpretar los reportes automáticos y relacionarlos con nuestro código fue un reto, pero fortaleció nuestra comprensión del análisis estático.

Conclusión:

    El trabajo conjunto de aplicar principios SOLID y utilizar herramientas de análisis automatizado nos permitió producir un código más limpio, estructurado y confiable. Esta experiencia refuerza la importancia de la disciplina de desarrollo y la documentación en proyectos profesionales, fomentando buenas prácticas que reducen riesgos y facilitan la evolución del software.
