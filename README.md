CS3343 Mahjong Calculation System (Group 23)

=========================================================================

Mahjong Calculation System

=========================================================================
<< Description>>
=========================================================================

< Background information > 
Mahjong Calculation System is a system to calculate the Fan point if the user enters a valid input with 14 tiles.


< Aim of the system >
This system is designed for the beginners who do not know much about Mahjong rules.They can use this system to learn how the basic rules of Mahjong, including how to form a valid type of hand, results of different combination of hand .


<Using the system>
For a valid tile, there are two part. 

The first part is suit, which is in string form. There are four different kinds of suit, “T” (筒子）, “S” （索子）, “M” （萬子）, “H” （番子）.
The second part is rank, which is an integer form. For different suit, it has corresponding rank. For “T”/ “S”/ “M”, the range of rank is from 1 to 9. For “H”, the range of rank is from 1 to 7. 
For a valid tile, we can combine the suit and rank. For example, for “T3”, it means “三筒”. Other tiles are in the same concept. However, for the title with suit “H”, with different rank, it has different meanings. For “H1”, it means “東” ; “H2”, it means “南“ ; “H3”, it means “西” ; “H4”, it means “北” ; “H5”, it means “紅中” ； “H6”, it means “發財” and “H7” means “白板”.

A detailed version is as follow:


< Rule of the system >
Player can input the 14 tiles in a sequence: 4 melds in the front and the 2 eyes at last.
For the rules and calculation of Fan points for basic type of hands, please refer to the following link:
https://en.wikipedia.org/wiki/Hong_Kong_Mahjong_scoring_rules#Criteria

=========================================================================
<< Installation >>
=========================================================================

1. In Windows environment, install Java SE/Java SE Development Kit (JDK)
http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. Execute the "run.bat" (if you are using window) inside the build folder
For Mac OSX, open terminal and execute "sh run.sh"
3. The program is now running in GUI.
4. To run the program, you can simply open .jar file

=========================================================================
<< User Guideline >>
=========================================================================
1.User enters 14 valid tiles.
2.System outputs the name of hand and corresponding Fan points.


-----------------------------------------------------------------------
<< End of User Guideline >>



