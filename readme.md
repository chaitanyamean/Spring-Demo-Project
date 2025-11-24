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
