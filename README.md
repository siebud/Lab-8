# Lab-8
Our task was based again on the Mesonet text file. The assignment this time was to take one station ID, find out how many 
and which other stations have the same average ASCII value, and to then return that list, and then that list sorted 
alphabetically/ lexicographically.  The key skills to practice with this lab revolve around using Maps, specifically HashMap
and its different methods and uses. We had to input, retrieve, and use the data with a HashMap. I also used a TreeMap, which 
was possible because of its similarity to a HashMap in terms of its methods.

To begin this project, I first read though the project description on canvas a couple times until I felt reasonably assured 
about the goal. I then downloaded and read through the given files to understand what to do and how the project would implement 
that, especially related to parent classes and inheritance. I then preceded to construct a skeleton of each class based on its 
name and the information provided in the writeup. After that I went back and read up on the HashMap java API to understand its 
methods better. I started with what I perceived to be the most straightforward task, writing the method for finding the average 
ASCII value of a MesoStation. I started here because we had already had to do the same thing in our previous project, so felt 
most confident there. I then wrote a first draft for the MesoEquals class, utilizing the same BufferedReader solution that I used 
in previous projects. I then wrote a first draft for the StationLexicographical class, which proved quite difficult. After 
that was a lot of trial and error in terns of troubleshooting. During this time, I also went back and forth many times with 
the java API to find an effective way to sort a Map.

The alphabetical sorting of the Map definitely gave me the most trouble. I got stuck for quite some time trying to figure 
out why my return HashMap was the same as the unsorted one when I had created it out of a sorted List. I then figured it 
out after reading over the API again. I then decided to use a TreeMap in order to preserve the alphabetized order. This 
was a fairly simple solution, as it is very similar to the HashMap I was already using. I then had trouble iterating 
though and finding how to print the right values out for the lexicographical part. I looked back over the already provided 
code in the main class to figure out how to do it. Another area that gave me trouble way reading in the Mesonet.txt file
correctly, as I had to make little adjustments until it was accessing the right part of each line to use to call the other
methods.  After that there were many formatting and casting issues that I had to figure out until variable types agreed 
and would correctly compare. I did learn much more about HashMaps and how to use their methods in these classes. I 
struggled a bit with the put() method because of the fact that I had to be using Integers instead of ints, but eventually
it became easier to know how to call methods and cast in such a way that it would be effective.

Class list: Main, MesoAscii, MesoAsciiAbstract, MesoEqual, MesoSortedAbstract, MesoStation, StationLexicographical

MesoStation
This public class initializes and saves the ID data for a station, as well as providing methods to access this data.

MesoAsciiAbstract
This is an abstract class that has one required method, a calAverage method with no parameters that returns an int.

MesoSortedAbstract
This is an abstract class that has one required method, a sortedMap method with parameter of a HashMap with String and Integer values. The return type for sortedMap is a Map with String and Integer values.

MesoAscii
This class extends the MesoAsciiAbstract class. The purpose of this class is to calculate the numerical ASCII average of a station name. It contains a constructor that saves the station Id to a private string. Because it is a subclass of MesoAsciiAbstract it has to override the calAverage method. This has no parameters but returns the calculated ASCII average of a stations name. My implementation iterates through each character of the String name, adds the individual ASCII values to an integer total and then divides the total by a double four to get a double for the average. It then utilizes an if – else statement to determine how to round. If the decimal is .5 or higher, the average is rounded up. If it is .4 or smaller then it rounds down.

MesoEqual
This class compares the calculated ASCII average of a station name to the averages of each station name in the Mesonet.txt file. It has a constructor that saves the station ID to a private string. It includes the constructor and a calAsciiEqual method. calAsciiEqual has no parameters but does have an IO exception throw as it contains implementation to read from an input file. This method returns a HashMap with String and Integer values. Stored in the HashMap is the string name of the station as the key, and it’s ASCII average as the assigned value. Implementation includes a BufferedReader to access the lines from the text file which then gets split into an array so that only one part, the name, actually gets compared. This method calls a MesoAscii constructor and the calAverage method for each line from the text file. The method then adds and names that have the same ASCII average as the original MesoStation to the return HashMap.

StationLexicographical
This class is for sorting the HashMap from MesoEqual into a Map of the same station names and averages. The goal is to sort them in alphabetical, or lexicographical, order. It contains a constructor that saves the HashMap<String, Integer> parameter as a local HashMap<String, Integer> and provides implementation to print out the information from the HashMap in the same way documented in the provided Main code. The sortedMap method has a parameter of a HashMap<String, Integer> and returns a TreeMap of String and Integer values. In the implementation I made a string List of the key set from the input hashmap, and then use a for loop to iterate through the List and add each instance to the TreeMap. Because of the properties of a TreeMap, it automatically preserves alphabetical order. This map is then called in the return line. 
