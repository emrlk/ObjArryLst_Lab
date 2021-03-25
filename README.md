# ObjArryLst_Lab

Driver creates an Array List "businesses" and fills it with Business objects which are created using data from the text file. 
Users can choose options from a menu to sort or display certain data from all objects. 

#Lab instructions

Design a class named Business that contains:

-JavaDoc comments on the entire class definition only
-JavaDoc at the top of the class application only
-A String attribute named name for the Business name
-A String attribute named symbol for the Business’s stock symbol
-A double attribute named lastPrice that stores the stock price one month ago
-A double attribute named currentPrice that stores the stock price for the current time
-A default constructor
-An overloaded constructor that creates a Business with a specified Business stock symbol and name
-An overloaded constructor with all attributes
 Accessors and mutators for each attribute
-A copy Constructor   
-An Equals Method   
-A toString() method to display current state of the object, formatted!

Create a BusinessDriver application.

-setBusinessData() - this reads the data from the file (call the file businessData.txt)
-displayBusinessData() - this displays the data to the screen, calling the toString() method of all objects
-sortData() - This will sort the data by choice either name of stock or current price. Pick one.
-Create an arraylist of the 10 Business objects
Create a menu:
Options
1 = List the objects in the arraylist
2 = List just the Business names of the array list
3 = List just the Business Name and current stock price
4  = Sort by name or by price Your choice
5 = Exit
Read the data for the array from a file (see below)
Call each method as described above then list the menu and loop until the user exits.
BusinessData.txt (the data is set up like this: Business symbol, Business name, lastprice, current price - copy and paste this into a .txt file)

GPRO  
GoPro, Inc.
10.71
13.69
SBUX
Starbucks
59.53
58.46
JCP
JC Penney
7.73
10.78
AMZN
Amazon
531.07
576.32
AE
Adams Resources and Energy
34.96
33.77
KO
Coca-Cola
42.72
43.60
MCD
McDonald's
121.47
115.99
TSLA
Tesla Motors
173.48
187.90
AAPL
Apple Inc
96.35
100.67
FB
Facebook
112.69
108.93
