# CountableCloneable
Java Exercise: App to Count Alligators and Count and clone Sheep. Uses interfaces and classes


### Operation
This application uses an Alligator class that implements a Countable interface to display Alligator objects as shown above.
This application uses a Sheep class that implements a Countable interface and the Cloneable interface to display and clone Sheep objects as shown above.

### Specifications
Create an interface named Countable that can be used to count an object. This interface should include these methods:

  **void incrementCount()**
  
  **void resetCount()**
  
  **int getCount()**
  
  **String getCountString()**

Create a class named Alligator that implements the Countable interface. This class should include an instance variable that stores the count and a method that returns the formatted count.

Create a class named CountUtil.  This class should include a static method that lets you count any Countable objects a specified number of times. For example:
  public static void count(Countable c, int maxCount)

Create a class named CountTestApp that uses the CountUtil class to count an Alligator object 3 times (see example output below)

Creat a class named Sheep that implements the Countable and Colneable interfaces. This class should include an instance variable that stores the count and the name of the sheep, and it should provide methods that can set and get the name of the sheep.

Modify the CountTestApp class so it(a)counts the first sheep 2 times, (b) clones the first sheep, changes the name, and counts it 3 times, and (c) counts the first sheep again 1 time.
###Console will look like: 

  Counting alligators...
  
  1 Alligator
  2 Alligator
  3 Alligator
  
  Counting sheep...
  
  1 Blackie
  2 Blackie
  
  1 Dolly
  2 Dolly
  3 Dolly
  
  1 Blackie
