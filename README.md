The project has been refactored (new type and polymorphism) in accordance to the video. The changes are as follows:

- The `Price` class is an abstract class that other classes extend their functionality from
- Movie classes (each of them is associated with their unique genre), such as `ScifiPrice`, were created. All of them extend the `Price` class.
- Methods `getPriceCode`, `charge` and `getFrequentRenterPoints` were removed from the `Movie` class as their responsibilities were transferred to the `Price` strategy classes.
- The `MovieType` enum was removed and its functions are now distributed between classes that extend `Price` class
- Since the `MovieType` enum has been removed, the `Main` class behavior is now based on `Price` class and its movie genre subclasses
- A new movie type has beed added: SciFi; it was implemented as a class that extends the `Price` class
- Also, SciFi movie "2001 Space Odyssey" has been added as `SPACE_ODYSSEY` in the `Main` class to implement the new movie type