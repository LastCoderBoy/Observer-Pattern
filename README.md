********* WEATHER MONITORING APPLICATION *********

There are three players in the system are the weather station (the physical device that acquires the actual weather data), the WeatherData object (that tracks the data coming from the Weather Station and updates the displays), 
and the display that shows users the current weather conditions.

The WeatherData object knows how to talk to the physical Weather Station, to get updated data. The WeatherData object then updates its displays for the three different
display elements: Current Conditions (shows temperature, humidity, and pressure), Weather Statistics, and a simple forecast.


  1. The WeatherData class has getter methods for three measurement values: temperature, humidity and barometric pressure.
  2. The measurementsChanged() method is called any time new weather measurement data is available. (We don’t know or care how this method is called; we just know that it is.)
  3. We need to implement three display elements that use the weather data: a current conditions display, a statistics display and a forecast display. These displays must be updated each time WeatherData has new measurements.
  4. The system must be expandable—other developers can create new custom display elements and users can add or remove as many display elements as they want to the application.
     Currently, we know about only the initial three display types (current conditions, statistics and forecast)


**The Observer Pattern** defines a one-to-many relationship between a set of objects. When the state of one object changes, all of its dependents are notified

**Using Java’s built-in Observer Pattern**
Java has built-in support in several of its APIs. The most general is the Observer interface and the Observable class in the java.util package.
The most obvious difference is that WeatherData (our subject) now extends the Observable class and inherits the add, delete and notify Observer methods (among a few others).
The java.util.Observable has implemented its notifyObservers() method such that the Observers are notified in a different order than our own implementation.
