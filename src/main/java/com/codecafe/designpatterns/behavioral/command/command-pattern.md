# Command Pattern

> Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

Four terms always associated with the command pattern are:
1. command
2. receiver
3. invoker
4. client

> Client calls Invoker => Invoker calls ConcreteCommand => ConcreteCommand calls Receiver method, which implements abstract Command method.

- A command object knows about receiver and invokes a method of the receiver. Values for parameters of the receiver method are stored in the command.

- The receiver then does the work when the execute() method in command is called.

- An invoker object knows how to execute a command, and optionally does bookkeeping about the command execution.

- The invoker does not know anything about a concrete command, it knows only about the command interface.

- Invoker object(s), command objects and receiver objects are held by a client object, the client decides which receiver objects it assigns to the command objects, and which commands it assigns to the invoker.

- To execute a command, it passes the command object to the invoker object.

The central ideas of this design pattern closely mirror the semantics of **first-class functions** and **higher-order functions** in functional programming languages.
Specifically, the invoker object is a higher-order function of which the command object is a first-class argument.


1. Command declares an interface for all commands, providing a simple execute() method which asks the Receiver of the command to carry out an operation.

2. The Receiver has the knowledge of what to do to carry out the request.

3. The Invoker holds a command and can get the Command to execute a request by calling the execute method.

4. The Client creates ConcreteCommands and sets a Receiver for the command.

5. The ConcreteCommand defines a binding between the action and the receiver.

6. When the Invoker calls execute the ConcreteCommand will run one or more actions on the Receiver.


> Think of a command in a metaphorical sense; a trained soldier is given a command by his/her commanding officer, and on demand the soldier executes this command.

You can use Command pattern to:

1. Decouple the sender & receiver of command
2. Implement callback mechanism
3. Implement undo and redo functionality
4. Maintain a history of commands


The main motivation for using the Command pattern is that the executor of the command does not need to know anything at all about what the command is, what context information it needs on or what it does.
All of that is encapsulated in the command.

This allows us to do things such as have a list of commands that are executed in order, that are dependent on other items, that are assigned to some triggering event etc.

So, in summary, the pattern encapsulates everything required to take an action and allows the execution of the action to occur completely independently of any of that context.
If that is not a requirement for you then the pattern is probably not helpful for your problem space.

```java
interface Command {
    void execute();
}
```

```java
class Light {
    public Command turnOn();
    public Command turnOff();
}
```

```java
class AirConditioner {
    public Command setThermostat(Temperature temperature);
}
```

```java
class Button {
    public Button(String text, Command onPush);
}
```

```java
class Scheduler {
    public void addScheduledCommand(Time timeToExecute, Command command);
}
```

Then you can do things such as:

```java
new Button("Turn on light", light.turnOn());
scheduler.addScheduledCommand(new Time("15:12:07"), airCon.setThermostat(27));
scheduler.addScheduledCommand(new Time("15:13:02"), light.turnOff());
```

As you can see the Button and Scheduler don't need to know anything at all about the commands.
Scheduler is an example of a class that might hold a collection of commands.

We can use this pattern to do transition from a method-oriented interface to a command-oriented interface.
That means, we are encapsulating method calls into concrete commands along with necessary data.
It makes the code more readable yes but more importantly we can treat methods as objects which lets us easily add/remove/modify commands without increasing the complexity of the code.
So it makes it easy to manage as well easy to read.

Secondly, since we've our methods as objects, we can store/queue them to execute them later.
Or to cancel them even after we've executed them. This is where this pattern helps us to implement "Undo".

Finally, command pattern is also used to decouple command execution and commands themselves.

> It's like a waiter doesn't know about how to cook the orders that he received.
> He doesn't care. He doesn't have to know.
> If he'd know that, he'd be working as a cook as well.
> And if the restaurant owner wants to fire the waiter, he/she ends up with having no cook as well.
> Of course this definition is not special or related to command pattern only.

That explains why we need decoupling or dependency management in general.


> The goal of the command pattern is to decouple the invoker from the receiver.

The receiver must do the work, not the command itself, the command just knows what is the receiver method to call, or the command can execute other commands.
With the command pattern the invoker doesn't know what is being called except for the command.
So a command can be reused by many invokers to execute the same action on the receiver.

Imagine a class that can do couple of things, like `Duck`, it can `eat` and `quack`. `Duck` is a `receiver` in this example.
To apply command pattern here, you need to be able to wrap eating and quacking into a command.
They should be separate classes that derive from Command base class with `execute()` method because Duck can have only single `execute()` method.
So `EatCommand.execute()` calls `Duck.eat()` and `QuackCommand.execute()` calls `Duck.quack()`.