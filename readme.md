This Demo project demonstrates Spring Beans and Dependency Injection

**Bean**: A spring Bean is simply a java object that is:
Initialized, Configured and managed throughout it’s life cycle by Spring framework

**DI** is a design pattern where the framework creates and supplies objects instead of you manually instantiating them with new.

A CakeBakers class depends on two ingredients:
Frosting
Syrup

Spring injects these ingredients using constructor injection along with @Component, @Autowired, and @Qualifier.

What This Project Contains

Two interfaces: **Frosting and Syrup**
Four implementations:
ChocolateFrosting
StrawberryFrosting
ChocolateSyrup
StrawberrySyrup

A CakeBakers class that requires a Frosting and a Syrup
Spring Boot automatically injects the correct implementations



Annotations:

• @RestController – Defines a controller where every method returns a JSON/XML response instead of a view.
• @RequestMapping – Maps HTTP requests to controller classes or methods.
• @GetMapping – Handles HTTP GET requests for a specific URL.
• @PostMapping – Handles HTTP POST requests for a specific URL.
• @PutMapping – Handles HTTP PUT requests for a specific URL.
• @Configuration – Marks a class as a source of Spring bean definitions.
• @Bean – A spring Bean is simply a java object that is Initialized, Configured and managed throughout it’s life cycle by Spring     framework
• @Component – Marks a class as a Spring-managed component for dependency injection.
• @Autowired – Injects a dependency automatically by type.
• @Qualifier – Specifies which bean to inject when multiple candidates exist.
• @Override – Indicates a method overrides a method from a superclass or interface.
• @PostConstruct – Executes a method after dependency injection is completed.
• @PreDestroy – Executes a method before the bean is removed or application shutdowns.
