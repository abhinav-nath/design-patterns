# The Adapter Pattern

The Adapter pattern is a great pattern for connecting new code to legacy code without having to change the working contract that was produced from the legacy code originally.

The Adapter acts as a wrapper between two objects.
It catches calls for one object and transforms them to format and interface recognizable by the second object.

**Usage examples:** The Adapter pattern is pretty common in Java code.
It's very often used in systems based on some legacy code. In such cases, Adapters make legacy code work with modern classes.

Adapters in Java core libraries:

- `java.util.Arrays#asList()`
- `java.util.Collections#list()`
- `java.util.Collections#enumeration()`

**Identification:** Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type.
When the adapter receives a call to any of its methods, it translates parameters to the appropriate format and then directs the call to one or several methods of the wrapped object.