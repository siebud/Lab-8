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
