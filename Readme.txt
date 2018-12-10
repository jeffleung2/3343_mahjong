CS3343 Mahjong Calculation System (Group 23)


=========================================================


Mahjong Calculation System


========================================================================
<< Description>>
========================================================================


< Background information > 


Mahjong Calculation System is a system to calculate the Fan point and hand type name if the user enters a legal hand type with valid 14 tiles.




< Aim of the system >


This system is designed for the beginners who do not know much about Mahjong rules.They can use this system to learn how the basic rules of Mahjong, including how to form a valid type of hand, results of different combination of hand .




< Using the system >


For a valid tile, there are two part. 


The first part is suit, which is in string form. There are four different kinds of suit, “T” (筒子）, “S” （索子）, “M” （萬子）, “H” （番子）.


The second part is rank, which is an integer form. For different suit, it has corresponding rank. For “T”/ “S”/ “M”, the range of rank is from 1 to 9. For “H”, the range of rank is from 1 to 7. 
For a valid tile, we can combine the suit and rank. For example, for “T3”, it means “三筒”. Other tiles are in the same concept. However, for the title with suit “H”, with different rank, it has different meanings. For “H1”, it means “東” ; “H2”, it means “南“ ; “H3”, it means “西” ; “H4”, it means “北” ; “H5”, it means “紅中” ； “H6”, it means “發財” and “H7” means “白板”.


________________


A detailed version is as follow:

（Chinese Version)

Rank\Suit	T	S	M	H
1		一筒	一索	一萬	東
2		二萬	二索	二萬	南
3		三萬	三索	三萬	西
4		四萬	四索	四萬	北
5		五萬	五索	五萬	紅中
6		六萬	六索	六萬	發財
7		七萬	七索	七萬	白板
8		八萬	八索	八萬	/
9  		九萬	九索	九萬	/



< Rule of the system >
Player can input the 14 tiles in a sequence: 4 melds in the front and the 2 eyes at last.


For the rules and calculation of Fan points for basic type of hands, please refer to the following link:
https://en.wikipedia.org/wiki/Hong_Kong_Mahjong_scoring_rules#Criteria




========================================================================
<< Installation >>
========================================================================

Windows User
1. Execute the "mahjong.bat" inside the build folder
2. The program is now running in command line.
3. If you wish to run the program in GUI, you can simply open "mahjong.jar" file

Mac User
1. Open terminal and execute "sh mahjong.sh"
2. The program is now running in command line.
3. If you wish to run the program in GUI, you can simply open "mahjong.jar" file



========================================================================
<< User Guideline >>
========================================================================


1.User enters 14 valid tiles no matter in which operating system.
2.System outputs the name of hand and the corresponding Fan points.
3.If you wish to terminate the program, type "exit".

For example,
14 valid tiles: M1M2M3 M4M5M6 M7M8M9 H7H7H7 H6H6
=> System outputs: Fan Point:	4
		   Hand Type:	Contain One Dragon Mix One Suit

========================================================================
<< Team member of the system >>
========================================================================


     Name		 SID	      	    Role
NGAI Ho Chun Jonathan  54806258		Project Manager
Wong Chun Yan	       54820308		Assistant Project Manager
Leung Chi Hin	       54820161		System Engineer
Wong Jyu Fung	       54817967		System Engineer
Wong Him Yau	       54792679		System Designer
Ho Kin Lok	       54812947		Testing Engineer
Lam Chun Kit	       54812413		Testing Engineer
	

-----------------------------------------------------------------------
<< End of User Guideline >>
