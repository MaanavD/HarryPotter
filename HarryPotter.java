import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class HarryPotter //extends Applet
{
    public static void main (String args[])
    {
	new HarryPotter ();
    }


    char minefield[] [] = new char [5] [5];

    // Created by Maanav Dalal
    // November 10th, 2015
    // Game created for Daphne Bavelier's research on the brain

    // To fix: tictactoe, edit the valid statement for labyrinth
    public HarryPotter ()
    {
	char play = 'y';
	while (play != 'n')
	{
	    {
		int points = 0;
		int life = 1;

		title ();
		int difficulty = menu ();
		introtitle ();
		intro ();
		life = eightball (points, life);
		if (life == 1)
		{
		    boggartBattle (points);
		    char doesntmatter = IBIO.inputChar ("Type anything to proceed on your journey: ");
		    duelTransition ();
		    patronusBattle (points);
		    char doesntmatter2 = IBIO.inputChar ("Type anything to proceed on your journey: ");
		    dogTransition ();
		    TicTacToe (points);
		    char doesntmatter3 = IBIO.inputChar ("Type anything to proceed on your journey: ");
		    labyrinthTransition (difficulty);
		    life = labyrinth (points, difficulty, life);
		    endingTransition ();
		}
		endchoice (points, life);
	    }
	    play = IBIO.inputChar ("\nPlay again? (y/n) ");
	}
	printSlow ("Thanks for playing");
	printSlow (".\n.\n.\n.");
	printSlow ("  _   _  ______   __");
	printSlow (" | \\ | |/ __ \\ \\ / /");
	printSlow (" |  \\| | |  | \\ V / ");
	printSlow (" | . ` | |  | |> <  ");
	printSlow (" | |\\  | |__| / . \\ ");
	printSlow (" |_| \\_|\\____/_/ \\_\\ ");



    }


    public void diagram ()
    {
	JOptionPane.showMessageDialog (null, createImageIcon ("Picture2.png"), "Patronus Chart", JOptionPane.INFORMATION_MESSAGE);
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = HarryPotter.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}


	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }


    public void introtitle ()
    {
	System.out.println ("  ________                __                                     ____             _           ");
	System.out.println (" /_  __/ /_  ___         / /___  __  ___________  ___  __  __   / __ )___  ____ _(_)___  _____");
	System.out.println ("  / / / __ \\/ _ \\   __  / / __ \\/ / / / ___/ __ \\/ _ \\/ / / /  / __  / _ \\/ __ `/ / __ \\/ ___/");
	System.out.println (" / / / / / /  __/  / /_/ / /_/ / /_/ / /  / / / /  __/ /_/ /  / /_/ /  __/ /_/ / / / / (__  ) ");
	System.out.println ("/_/ /_/ /_/\\___/   \\____/\\____/\\__,_/_/  /_/ /_/\\___/\\__, /  /_____/\\___/\\__, /_/_/ /_/____/  ");
	System.out.println ("                                                    /____/              /____/                ");
    }


    public void star ()
    {
	System.out.println ("   .\t\t\t\t\t       .");
	System.out.println (" ./|\\,\t\t\t\t\t     ./|\\,");
	System.out.println ("<-=O=->\t\t~~~~~Magical Menu~~~~       <-=O=->");
	System.out.println (" '\\|/`\t\t\t\t\t     '\\|/`");
	System.out.println ("   '\t\t\t\t\t       '");
    }


    public void duelTransition ()
    {

	printSlow ("\nAfter Defence against the Dark Arts, you walk towards the courtyard to find Ron and Hermione, who you haven't seen all summer!");
	printSlow ("You walk through the hallways, exchanging smiles with Cho Chang, a pretty Ravenclaw.");
	printSlow ("Continuing down the hallway, as you make it towards the courtyard, you notice it's empty, and after all your classes it's rather late");
	printSlow ("Nobody seems to be outside at all, but the peace is rather nice, as you've missed hogwarts");
	char doesntmatter4 = IBIO.inputChar ("Type anything to proceed on your journey: ");
	printSlow ("\n*Sneer* Ahh, if it isn't Potter! Hey Potter, where are your friends? Nobody to help you this time?");
	printSlow ("You turn around to find someone you would have rather not seen, and could definitely go a long time without seeing");
	Malfoy ();
	printSlow ("\nIt's your adversary since the first year of school, Draco Malfoy!");
	printSlow ("He approaches you, in a scary fashion, almost agressively..");
	printSlow (".\n.\n.\nSTUPIFY!");
	printSlow ("All of a sudden, you see a spark from his wand, coming towards you");
	printSlow ("You quickly react, remembering what you learned from last year's Defence against the Dark Arts class");
	printSlow ("Expelliarmus!");
	printSlow ("\nMalfoy's wand goes flying, and you gather yourself for the battle to come, as you know he's going to be coming full force");
	printSlow ("You try to recall how you reacted to the dementors previously, remembering the fondest memories you have to empower your patronus");
	printSlow ("As Malfoy approaches, you put your wands to the ready and begin the battle!\n");


    }


    public void Malfoy ()
    {
	System.out.println ("");
	System.out.println ("MMMOD8=I7$O=:=III???~~::::,,,,,,,,:::~~~~=?7Z7MMMMMI?I?MMMMM");
	System.out.println ("MMDNZO7OI$$=~=II+??+~~~:::::,,,,,::::::~~=+IOOMMNMN$?I=MMMMM");
	System.out.println ("MMDM$I$OID7==+$+?7I+=~~~~~~~====+????+=~===$$NMMDM$O?I+MMMMM");
	System.out.println ("MMON$788IO?=~I7?IDZI+=~~~=+?OD888O8OZ$$I?==I78NMM$NM?=MMMMMM");
	System.out.println ("MMDMO78D78I+:I77?OD87+~~~=?7$$DD8O8$7$77I~+IZZNMNMM8?IMMMMMM");
	System.out.println ("MMMDOI8O7ZI++?I??NDN8+~::=+7OZ78MM8Z7$I?~~~I7NMMMMM$~MMMMMMM");
	System.out.println ("MMM$OI7$7$$+$?I?$OOZO7~,,~:~I?=~,,~II?===~I$NMMMMMM=7MMMMMMM");
	System.out.println ("MMM8NZZZ$$O+8II??$Z$7?:,,::,:==++=++=~~~=+$8NNMMMM+IMMMMMMMM");
	System.out.println ("MMNMDD$ZZ$O?O?77+77I?+:.,::::,,::::,,:,~~7O8NMDMZIZMMMMMMMMM");
	System.out.println ("MMMMDM8$OOO7+I7II77I?=:.,::::,,,,,,,,,:=?$8DNDDNOOMMMMMMMMMM");
	System.out.println ("MMMMMDN88N8Z=I?+II7I7~,.,:~~~:,,,,,,:::+IZ8NMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMNNDND8??I???I7+,,.,:~:=~:,,,,,,:~?$ODNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMDDMD7+?$?+??~,,.,:~:==:::,,,:~+IZ8DMMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMM8NMN87+I$7?ZD$+=IZO$=,,,:::,:=?$O8NMMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMM8MMNO$?7?I$888OOZI~,,,,,:::~+7ZODNMMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMN7?III7777I,,,,,,,,::~+I$O8DNNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMNDO777$I=:==~~~~~:::~=I7Z8DNNMMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMN8Z7I$Z8DOOZ$I===~~=?7Z8DNNNNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMNDO$$77I?+++=~~~~~+I$O8DNDDNNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMNDZII$ZZZ$I?+===+I$O8DDDDDDNNMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMN87+~:~~~~:::~+I$O8ND8OO8DNNMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMMNO?=~:,,:::~+I$8D8OZ$ZO8DNNMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMMMDZ?=~~~~==?ZO88OZ777ZODNNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMMMMNDO$7$ZOOOOOZ$77II$ZODDNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMNMMMNNDDD88OOZ$7II?I7$O8DDNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMOI78NNDD88OOZ$7I???I7Z8Z7DNMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMDZ7=:+ZDDD8OZ$7I???I$OI?O8DNO8NMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMM8I=+=:,=Z88OZ7I?+?7?+7$77IIODNDMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMN=:,~=:,:+OZ$I=,:~+????$O8D8O$NMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMM~:,,,~:=NMNMMMM,+III7$OOOZ$?NMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMZ:,,,:DMMNODDNNNI7$ZOZZ$?++MMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMM:,,~NMNZDI?DNMMMMZOZ$7++=MMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMNMMMMMMMMMMMM~,~NDDO~,??DNMMMMMIZI7=~MMMMMMMMMMMMMMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMMMM8,7I$$I~::$DODMMNNN~?+~=NMMMMMMMMMMMMMMMMM");
	System.out.println ("NMNNMMMMMMMMMMMMMMMNZ7$77?==NMMMMMDZ$8?~:$MMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNNNMMMMMMMMMMMMMMMNDOOZ$7NN$MMMMO??ZZ+NMMMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNNMMMMMMMMMMMMMMMMMMNDD8DZNIMMMMN?+7DMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNNMMMMMMMMMMMMMMMMMMMMNNM~MMMMNMND??MMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");
	System.out.println ("NNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN$77ZMMMM");
	System.out.println ("MNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMI+MIDMMM");
	System.out.println ("M8O~ODI$OOM+Z$+?+7OZDMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM?ZZMMMMM");
	System.out.println ("MMMMMMMMMMMMMMMIMM?NMMMMMMMMMMMMMMMMMMMMMMMMMMMMM8MNMNMMM$MM");
    }


    public void title ()
    {
	//This is the ASCII Art title of the whole game
	printSlow ("                                          _ __");
	printSlow ("         ___                             | '  \\");
	printSlow ("    ___  \\ /  ___         ,'\\_           | .-. \\        /|");
	printSlow ("    \\ /  | |,'__ \\  ,'\\_  |   \\          | | | |      ,' |_   /|");
	printSlow ("  _ | |  | |\\/  \\ \\ |   \\ | |\\_|    _    | |_| |   _ '-. .-',' |_   _");
	printSlow (" // | |  | |____| | | |\\_|| |__    //    |     | ,'_`. | | '-. .-',' `. ,'\\_");
	printSlow (" \\\\_| |_,' .-, _  | | |   | |\\ \\  //    .| |\\_/ | / \\ || |   | | / |\\  \\|   \\");
	printSlow ("  `-. .-'| |/ / | | | |   | | \\ \\//     |  |    | | | || |   | | | |_\\ || |\\_|");
	printSlow ("    | |  | || \\_| | | |   /_\\  \\ /      | |`    | | | || |   | | | .---'| |");
	printSlow ("    | |  | |\\___,_\\ /_\\ _      //       | |     | \\_/ || |   | | | |  /\\| |");
	printSlow ("    /_\\  | |           //_____//       .||`      `._,' | |   | | \\ `-' /| |");
	printSlow ("         /_\\           `------'        \\ |    AND       `.\\  | |  `._,' /_\\");
	printSlow ("                                        \\|        HIS         `.\\");
	printSlow ("  __  __             _           _               _                 _                  ");
	printSlow (" |  \\/  |           (_)         | |     /\\      | |               | |                 ");
	printSlow (" | \\  / | __ _  __ _ _  ___ __ _| |    /  \\   __| |_   _____ _ __ | |_ _   _ _ __ ___ ");
	printSlow (" | |\\/| |/ _` |/ _` | |/ __/ _` | |   / /\\ \\ / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\");
	printSlow (" | |  | | (_| | (_| | | (_| (_| | |  / ____ \\ (_| |\\ V /  __/ | | | |_| |_| | | |  __/");
	printSlow (" |_|  |_|\\__,_|\\__, |_|\\___\\__,_|_| /_/    \\_\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|");
	printSlow ("                __/ |                                                                 ");
	printSlow ("               |___/                                                                  \n\n\n");


    }


    public void intro ()
    {
	//This is the intro
	printSlow ("\n\nWelcome back to Hogwarts, the wonderful school of Witchcraft and Wizardry!");
	printSlow ("As you may know already, Harry my boy, this is your third year at the school, and much is expected of you.");
	printSlow ("... It seems that the school year has begun, go down to the main hall to hear what Professor Dumbledore \nhas to say about the upcoming year!\n");
	printSlow ("~You start to walk through the halls, unsure of what to expect. Not much has changed, except for the new year of students approaching in boats.\nEventually, you make it to the great hall, just in time for Dumbledore's speech.~");
	printSlow ("\nHello Students of Hogwarts. I am Professor Dumbledore, your headmaster here at Hogwarts.");
	printSlow ("As some of you may know, it is a very dark time here at Hogwarts, and there are many dark forces among us.");
	printSlow ("Should any students detect any such malicious sources, it would be in your best interest to \ninform me, or any of my fellow teachers, and we will do our best to uphold the saftey we pride ourselves with here at Hogwarts.\n\n");

    }


    public void endchoice (int points, int life)
    {
	if (life == 2)
	{
	    DivEnd ();
	}


	else if (life == 3)
	{
	    MineEnd ();
	}


	else
	{
	    if (points > 100)
		end1 ();
	    else if (points > 50)
		end2 ();
	    else
		end3 ();
	}
    }


    public void end1 ()
    {
	printSlow ("Although your adventure is over, you're extremely beaten and bruised by it, as it seems the battles with the Boggart, Malfoy\n,even Voldemort's Jinxes and the dog wore you down, now that you think of it.");
	printSlow ("Barely alive, you go to the nursery to heal up for the rest of the year. You're happy, but also paining everywhere, so you decide to call it a day");
	end ();
    }


    public void end2 ()
    {
	printSlow ("Slightly bruised, you walk home feeling rather victorious, knowing that although you fell a few times throughout your battles,\nfor the most part you were successful in your journey.");
	printSlow ("You decide you don't really need the help of any nursing, and sneak into your dorm, and fall asleep, with a few pains, but mostly good memories of your adventure");
	end ();
    }


    public void end3 ()
    {
	printSlow ("The adventure you had today leaves you feeling amazing. You didn't really lose many duels, you made it out of voldemort's trap alive, and overall had a fun time doing so");
	printSlow ("You slip into your dorm, feeling amazing and ready to tell Ron all about it.. tomorrow");
	end ();
    }


    public void DivEnd ()
    {
	System.out.println ("Sadly, you have perished due to a bad reading of The your leaf. You feel like you might have luck in the next life...");
	printSlow ("Game Over.");
    }


    public void MineEnd ()
    {
	printSlow ("You fall over, as everything becomes blurry, and you lose your vision");
	printSlow ("Voldemort's Jinxes ended up finishing you, and each moment hurts, as you were so close to winning!");
	printSlow ("Game Over.");
    }


    public void end ()
    {
	printSlow ("  _______ _            ______           _ ");
	printSlow (" |__   __| |          |  ____|         | |");
	printSlow ("    | |  | |__   ___  | |__   _ __   __| |");
	printSlow ("    | |  | '_ \\ / _ \\ |  __| | '_ \\ / _` |");
	printSlow ("    | |  | | | |  __/ | |____| | | | (_| |");
	printSlow ("    |_|  |_| |_|\\___| |______|_| |_|\\__,_|");
	printSlow ("                                          ");

    }


    public int menu ()
    {
	printSlow ("Before beginning your adventure in the wizarding world of Harry Potter,");
	printSlow ("you should probably configure the game to your liking.");
	printSlow ("The boss difficulty should be chosen based on how good at guessing you are,\nor how lucky you can be!\n");
	star ();

	// This is used to multiply a math problem in a later stage of the game
	int Bossdif = IBIO.inputInt ("Difficulty of final boss? (1-3) ");

	while (Bossdif < 1 || Bossdif > 3)
	{
	    System.out.println ("Error. Choose a difficulty between 1-3.");
	    Bossdif = IBIO.inputInt ("Difficulty of final boss? (1-3) ");
	}




	return Bossdif;

    }


    public int eightball (int points, int life)
    {
	//This is a random program that isn't very significant, but mostly about adding user engagement
	char doesntmatter = IBIO.inputChar ("Type anything to proceed on your journey: ");
	printSlow ("\nOff into the hallways, just like last year. As you glance at your schedule, you realize you have a new course - Divination?");
	printSlow ("You walk into your class, spotting a weird teacher with even weirder glasses, who calls your name and asks you to read a magical leaf");
	int prediction = (int) (Math.random () * 5) + 1;
	printSlow ("\n\n\t***The Divination Tea Leaf***");
	System.out.println ("\t\t     |");
	System.out.println ("\t\t   .'|'.");
	;
	System.out.println ("\t\t  /.'|\\ \\ ");
	System.out.println ("\t\t  | /|'.|");
	System.out.println ("\t\t   \\ |\\/");
	System.out.println ("\t\t    \\|/");
	System.out.println ("\t\t     ,   ");
	printSlow ("~Endorsed and encouraged by Hogwart's very own Prof. Trelawny~");
	printSlow ("Your inner eye believes that the following about your current quest is true:\n");

	//int yn = IBIO.inputInt ("Enter a yes or no question: ");
	// Maybe I can make ^ change something based on the Tea Leaf's output
	if (prediction == 1)
	{
	    printSlow ("The divination leaf seems to be in your favour, increasing your courage for future battles!\n\n");
	    points += 5;
	    return 1;
	}


	else if (prediction == 2)
	{
	    printSlow ("You feel empowered knowing that the odds of your victory in the future will be empowered.\n\n");
	    points += 10;
	    return 1;
	}


	else if (prediction == 3)
	{
	    printSlow ("You feel slightly weak after staring at a leaf for a long amount of time without any resolve\n\n");
	    points -= 5;
	    return 1;
	}


	else if (prediction == 4)
	{
	    printSlow ("You read through the leaf that your chances in the upcoming battle are greatly reduced.\n\n");
	    points -= 10;
	    return 1;
	}


	else
	{
	    printSlow ("Professor Trelawny runs over to you, and shrieks *AAAAAAAHHHH* before changing her tone of voice");
	    printSlow ("As someone must pass every year, this year the leaves say it SHALL be you!\n\n");
	    return 2;
	}
    }


    public void dogTransition ()
    {
	printSlow ("\nPicking yourself up and dusting yourself off after the duel with Malfoy isn't easy, you're still startled by what happened.");
	printSlow ("You think to yourself that you're lucky you made it out alive, and that you didn't get in trouble.");
	printSlow ("After your first year, you know the value of house points, and you're really keen on keeping Gryffindor's.");
	printSlow ("You decide to venture towards one of Hogwarts' hidden passageways, alone because Ron and Hermione have lots of potions homework for the night.");
	printSlow ("You walk into one, and look around, it seems familiar.");
	printSlow (".\n.\n.\nTHUD");
	printSlow ("The large stone door behind you shuts, and then it hits you! This is the same tunnel to Professor Quirrel, and the Philosopher's Stone from your first year.");
	printSlow ("You frantically search around, not wanting to go through that painful even again.");
	printSlow ("This time, there isn't any sort of Chess puzzle, which makes you happy, since you don't really enjoy wizard games like that anyway.");
	printSlow ("Then, all of a sudden, as you walk deeper in, you hear a weird repeating sound...");
	printSlow ("BARK BARK BARK");
	printSlow ("You see now, the three headed dog is in front of you, but this time, instead of being violent, it's insistent that it beats you in a simple muggle game.");
	printSlow ("It seems simple enough, just get three X's in a row before the dog can manage three paw prints, taking turns.");
	printSlow ("You move towards the dog, and it backs off, signalling to you that you're allowed to make the first move... \n");
    }


    public void endingTransition ()
    {
	printSlow ("After an extremely long day, you can be happy knowing your adventure is over, and that you've done so much in one day!");
	printSlow ("Defeated a Boggart, duelled Draco Malfoy, fought a Three-Headed-Dog, and even survived Voldemort's Traps!");
	printSlow ("Seems like a pretty normal day.. For Harry Potter, anyway!");
    }


    public void TicTacToe (int points)
    {

	int kills = 0;
	while (kills < 3)
	{

	    while (!winner ())
	    {
		printboard ();
		makemove (turn);
		if (turn == 'x')
		    turn = 'o';
		makecompmove (turn);
		turn = 'x';
	    }
	    printboard ();
	    if (printWinner () == 'x')
	    {
		kills++;
		printSlow ("Good job Harry! You defeated the 3-Headed dog " + kills + " times!");
	    }
	    else if (printWinner () == 't')
	    {
		printSlow ("You tied a mindless dog Harry! Let's hope you can win the next game :/");
		points +=5;
	    }
	    else
	    {
		printSlow ("Harry, you were defeated by the mindless the 3-Headed dog! Let's hope your next game will be better.");
		points += 10;
	    }
	    a = ' ';
	    b = ' ';
	    c = ' ';
	    d = ' ';
	    e = ' ';
	    f = ' ';
	    g = ' ';
	    h = ' ';
	    i = ' ';
	    turn = 'x';

	}
    }


    char a = ' ';
    char b = ' ';
    char c = ' ';
    char d = ' ';
    char e = ' ';
    char f = ' ';
    char g = ' ';
    char h = ' ';
    char i = ' ';
    char t = 't';
    char turn = 'x';

    public void printboard ()
    {
	System.out.println ("              1   2   3   ");
	System.out.println ("           1  " + a + " | " + b + " | " + c + "   ");
	System.out.println ("            ------------   ");
	System.out.println ("           2  " + d + " | " + e + " | " + f + "   ");
	System.out.println ("            ------------   ");
	System.out.println ("           3  " + g + " | " + h + " | " + i + "   ");
    }


    public void makemove (char piece)
    { //basically allows user to choose their location
	int x = IBIO.inputInt ("\nEnter the x-coordinate: ");
	int y = IBIO.inputInt ("Enter the y-coordinate: ");
	while (!isValid (x, y))
	{
	    System.out.println ("Error - invalid coordinate. Try again.");
	    x = IBIO.inputInt ("\nEnter the x-coordinate: ");
	    y = IBIO.inputInt ("Enter the y-coordinate: ");
	}


	if (x == 1 && y == 1)
	    a = piece;
	else if (x == 2 && y == 1)
	    b = piece;
	else if (x == 3 && y == 1)
	    c = piece;
	else if (x == 1 && y == 2)
	    d = piece;
	else if (x == 2 && y == 2)
	    e = piece;
	else if (x == 3 && y == 2)
	    f = piece;
	else if (x == 1 && y == 3)
	    g = piece;
	else if (x == 2 && y == 3)
	    h = piece;
	else if (x == 3 && y == 3)
	    i = piece;
    }


    public void makecompmove (char piece)
    {
	int x = (int) (Math.random () * 3) + 1;
	int y = (int) (Math.random () * 3) + 1;
	while (!isValid (x, y))
	{
	    x = (int) (Math.random () * 3) + 1;
	    y = (int) (Math.random () * 3) + 1;
	}


	if (x == 1 && y == 1)
	    a = piece;
	else if (x == 2 && y == 1)
	    b = piece;
	else if (x == 3 && y == 1)
	    c = piece;
	else if (x == 1 && y == 2)
	    d = piece;
	else if (x == 2 && y == 2)
	    e = piece;
	else if (x == 3 && y == 2)
	    f = piece;
	else if (x == 1 && y == 3)
	    g = piece;
	else if (x == 2 && y == 3)
	    h = piece;
	else if (x == 3 && y == 3)
	    i = piece;
	printSlow ("The Three-Headed Dog has made it's move. It moved its piece to (" + x + "," + y + ")\n");
    }


    public boolean isValid (int x, int y)
    {
	//make it return false if invalid
	// eg, x and y must be between 1 and 3
	// also they can't pick a position that is taken
	if ((x < 1 || x > 3) || (y < 1 || y > 3))
	    return false;
	else if (x == 1 && y == 1 && a != ' ')
	    return false;
	else if (x == 2 && y == 1 && b != ' ')
	    return false;
	else if (x == 3 && y == 1 && c != ' ')
	    return false;
	else if (x == 1 && y == 2 && d != ' ')
	    return false;
	else if (x == 2 && y == 2 && e != ' ')
	    return false;
	else if (x == 3 && y == 2 && f != ' ')
	    return false;
	else if (x == 1 && y == 3 && g != ' ')
	    return false;
	else if (x == 2 && y == 3 && h != ' ')
	    return false;
	else if (x == 3 && y == 3 && i != ' ')
	    return false;
	else
	    return true;
    }


    public boolean winner ()
    { //win conditions
	if (a == b && a == c && a != ' ')
	    return true;
	else if (d == e && d == f && d != ' ')
	    return true;
	else if (g == h && g == i && g != ' ')
	    return true;
	else if (a == d && a == g && a != ' ')
	    return true;
	else if (b == e && b == h && b != ' ')
	    return true;
	else if (c == f && c == i && c != ' ')
	    return true;
	else if (a == e && a == i && a != ' ')
	    return true;
	else if (g == e && g == c && g != ' ')
	    return true;
	else
	    return false;
    }


    public char printWinner ()
    { //returns who is in the winning condition
	//x, o, t=tie, n=no winner
	if (a == b && a == c && a != ' ')
	    return a;
	else if (d == e && d == f && d != ' ')
	    return d;
	else if (g == h && g == i && g != ' ')
	    return g;
	else if (a == d && a == g && a != ' ')
	    return a;
	else if (b == e && b == h && b != ' ')
	    return b;
	else if (c == f && c == i && c != ' ')
	    return c;
	else if (a == e && a == i && a != ' ')
	    return a;
	else if (g == e && g == c && g != ' ')
	    return g;
	else
	    return t;


    }


    public void cabinet ()
    {//Prints out Cabinet
	System.out.println ("\t\t                          .                         ..                          ");
	System.out.println ("\t\t                           ..ND.,             O.NM.                             ");
	System.out.println ("\t\t                             .NND~ .ON?778+ .8NNN..                             ");
	System.out.println ("\t\t                             .ZMDNNNNM$DINMNNDDMN.                              ");
	System.out.println ("\t\t                             NNNMM7ZNOZN78NO$MM8$8                              ");
	System.out.println ("\t\t                            .DOM$7,+~N~O~M~=8$ZDDN.                             ");
	System.out.println ("\t\t                           .I8ZN?M=~I?=O=~?~~8$INZ8                             ");
	System.out.println ("\t\t                           .8D7NN==~==8D8=====+II8O.                            ");
	System.out.println ("\t\t                          .88+=M8+===DO$======8$=?O$.                           ");
	System.out.println ("\t\t                          .$ZZ?M++==+O=$=O+=++NOIZOZ.                           ");
	System.out.println ("\t\t                          .8M+?M+?+++8+O+7+++?=I++88.                           ");
	System.out.println ("\t\t                          .8+I+MI$???+?D????I?II+?ZO.                           ");
	System.out.println ("\t\t                          .O???MD7???78O?I???ZNI???8.                           ");
	System.out.println ("\t\t                           N7?7MIIO?77DZI77I$7I$7?7O                            ");
	System.out.println ("\t\t                           DI7IMII$I77NNZ7I7I$III7IM                            ");
	System.out.println ("\t\t                          .I88$M7I7?=$$MN$=Z777D7DOZ.                           ");
	System.out.println ("\t\t                           8N$$MND7$7$ZOZ$ZZ$NN$$7D.                            ");
	System.out.println ("\t\t                          .8D$INM$$7$$N8O$$77$8Z7DD.                            ");
	System.out.println ("\t\t                            ONNMZ$$$$ZZ7IO$$$$$MO8O.                            ");
	System.out.println ("\t\t                            .O8MMZZZZM$8$ZZZZ$OOMN.                             ");
	System.out.println ("\t\t                            .NNMZMZZDO$87DOZD8ZOMO                              ");
	System.out.println ("\t\t                            .8$7N$ZNDNNDN88MZ$M8+O                              ");
	System.out.println ("\t\t                           .M8NNM88DMN$D8DNN8NNDDD?                             ");
	System.out.println ("\t\t                         .$DNDND8NO8MN$Z87DODM8DDZN8,.                          ");
	System.out.println ("\t\t                      ..,:OMNDDD88M$DMOI8MD7ND8NNNN8D=:..                       ");
	System.out.println ("\t\t                       ..,:+~~=:~:~=:~:,=~~,,+~:=I:+,...                        ");
	System.out.println ("\t\t                         ...............,..,,....,....       \n");
    }


    public void boggartBattle (int points)
    {//Basically A password, then a password
	char doesntmatter = IBIO.inputChar ("Type anything to proceed on your journey: ");
	printSlow ("\nAfter being completely confused out of your mind in Divination, you glance at your schedule and notice that");
	printSlow ("Defence Against the Dark Arts is your next class! Although in the past, you haven't had much luck with");
	printSlow ("Teachers in this subject, you have a really good feeling about this year.");
	printSlow ("You walk into class just in time as your teacher begins his lecture...\n");
	printSlow ("Welcome Third Year Students of Hogwarts, to you very first Defence against The Dark Arts Class of the Year.");
	printSlow ("My name is Remus Lupin, and for the duration of the year, I will be your guide to facing these awful Beasts");
	printSlow ("Many of the challenges you may face throughout this course are designed pretty simply - To end your life");
	printSlow ("Do not take these lightly, or you may not make it out alive!");
	System.out.print ("*Lupin Grins*");
	printSlow (" Alright then, onto our first lesson against an evil we may face out in the real world, a boggart!");
	printSlow ("These hide in cabinets, and will summon themselves as your greatest fear. The only way to defeat them is stare them in the eye, and shout...");
	printSlow ("\t\t\t\t\t\tRiddikulus!");
	printSlow ("For this challenge, your opponents will be controlled - you'll either face a dragon, aragog, a goblin, a death eater, or a dementor.");
	printSlow ("\nHarry my boy, you can be first up to the challenge, go ahead!\n");
	cabinet ();
	String evil = "boggart";
	//Generates your foe
	int randomnum = (int) (Math.random () * 5) + 1;
	String randomfoe = "idk";
	String foeText = "idk";
	if (randomnum == 1)
	{
	    randomfoe = "dragon";
	    foeText = "You see before you something that reminds you of a Muggle-lizard, with large metallic scales and enormous wings.\nThe foe seems warm, as if it might breath fire...";
	}


	else if (randomnum == 2)
	{
	    randomfoe = "aragog";
	    foeText = "The creature before you is an enormous spider, an adversary you've faced before, but barely escaped the clutches of.\nThis creature seems like something Hagrid would keep around...";
	}


	else if (randomnum == 3)
	{
	    randomfoe = "goblin";
	    foeText = "The creature before you seems very old, carrying coins as if it could work for a bank.\nAlthough initially not intimidating, you notice it's carrying a knife!";
	}


	else if (randomnum == 4)
	{
	    randomfoe = "death eater";
	    foeText = "A scary wizard appears before you, he is armed and seems to have a skull tattoo on his arm. This wizard looks to be aligned with Lord Voldemort...";
	}


	else
	{
	    randomfoe = "dementor";
	    foeText = "Your soul feels chilled as this ominous figure apppears from the wardrobe. This cloaked figure floats towards you, rather relatable to a muggle-ghost.\nAs it gets closer, you feel increasingly weaker."; // fix
	}


	printSlow (foeText);
	int scare = 0;
	//Add a timer if possible
	while (!evil.equals (randomfoe) && scare < 5)
	{
	    // If try is failed, add points and also generate an increasingly scary message

	    evil = IBIO.inputString ("\nWhat do you see before you? (Answer in lowercase) ");
	    scare++;
	    String scaremsg = "You almost get your head completely sliced off by the " + randomfoe + "!";
	    if (scare == 1)
		scaremsg = "\nYou stop the creature it it's tracks, it's unable to do anything before you identify it!";
	    else if (scare == 2)
	    {
		scaremsg = "\nThe creature now attacks you, scraping your leg!";
		points += 3;
	    }
	    else if (scare == 3)
	    {
		scaremsg = "\nThe creature now attacks again, bruising your arm!";
		points += 4;
	    }
	    else if (scare == 4)
	    {
		scaremsg = "\nThe creature cuts into your neck, and it starts bleeding badly.";
		points += 5;
	    }

	    printSlow (scaremsg);
	}


	if (scare >= 5)
	{
	    printSlow ("\nCome on Harry, you hove to know by now that it's a " + randomfoe + "!");
	    points += 10;
	}


	else
	{
	    printSlow ("Good Job Harry!");
	}


	String pword = "not riddikulus";
	while ((!pword.equals ("riddikulus") && !pword.equals ("Riddikulus") && !pword.equals ("riddikulus!") && !pword.equals ("Riddikulus!")))
	{
	    pword = IBIO.inputString ("Now that you know that you're against a/an " + randomfoe + ", how are you going to dispel it? ");
	    points += 5;
	    if (!pword.equals ("riddikulus") && !pword.equals ("Riddikulus") && !pword.equals ("riddikulus!") && !pword.equals ("Riddikulus!"))
	    {
		printSlow ("\nHarry my boy, think of something more.. Absurd!");
		printSlow ("Try to recall my lesson!\n");
	    }
	}
	if (scare == 0 || scare == 1)
	{
	    printSlow ("\nAmazing job Harry my boy!, you're a natural, just like your father!\n\n~You sit through all your classmates as they try to deal with their biggest fears. Neville's grandmother scares you almost as much as she scares him!~\nAlright, class dismissed. Good work today!\n");
	}
	else
	    printSlow ("\nAmazing job Harry my boy!, you got it in " + scare + " tries!\n\n~You sit through all your classmates as they try to deal with their biggest fears. Neville's grandmother scares you almost as much as she scares him!~\nAlright, class dismissed. Good work today!\n");
    }


    public void patronusBattle (int points)

    {
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	char playAgain = 'y';
	System.out.println ("-----Patronus Battle------\n"); //This is bascially rock paper scissors with patronuses
	printSlow ("In a Formal Patronus Balle, you may choose to conjure: \nA Stag, A Doe, A Phoenix, A Horse, or A Wolf");
	// This is where all the rules are in place (through image if possible)
	while (uPoint < 3)
	{
	    char info = 'n';
	    info = IBIO.inputChar ("Do you want to see the win conditions? (y/n) ");
	    if (info == 'y')
	    {
		diagram ();
	    }
	    info = 'n';
	    char user = userChoice ();
	    printSlow ("You have selected " + user);
	    char comp = compChoice ();
	    printSlow ("Malfoy chose to conjure a " + comp);
	    char win = winner (comp, user);
	    if (win == 'c')
	    {
		cPoint++;
		printSlow ("\nMalfoy won this one. Regain strength for the next fight, you can do this!");
		points += 2; //Possibly change to Draco?
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou win!");

	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Score: You: " + uPoint + " Malfoy: " + cPoint);
	    // playAgain = IBIO.inputChar ("\nBattle again? (y/n) "); //not req
	    System.out.println ("");
	}

	if (cPoint < 3)
	{
	    printSlow ("Nice! It took only " + cPoint + " losses before you could overcome Malfoy 3 times. Good job!\n");
	}
	else
	{
	    printSlow ("Ouch, it took " + cPoint + " losses before you could overcome Malfoy 3 times. It's alright Harry, you can forge on!\n");
	}
    }


    public boolean isValid (String c)
    {
	if (c.equalsIgnoreCase ("Stag") || c.equals ("s") || c.equals ("S") || c.equalsIgnoreCase ("Doe") || c.equals ("d") || c.equals ("D") || c.equalsIgnoreCase ("Phoenix") || c.equals ("p") || c.equals ("P") || c.equalsIgnoreCase ("Horse") || c.equals ("h") || c.equals ("H") || c.equalsIgnoreCase ("Wolf") || c.equals ("w") || c.equals ("W"))
	    return true;
	else
	    return false;
    }


    public char userChoice ()
    { //converts user input into a char the winner method can read
	String c = IBIO.inputString ("Stag, Doe, Phoenix, Horse, or Wolf? ");
	boolean Check = isValid (c);
	while (!isValid (c))
	{
	    printSlow ("Error, invalid input.");
	    c = IBIO.inputString ("Stag, Doe, Phoenix, Horse, or Wolf? ");
	}


	if (c.equalsIgnoreCase ("Stag") || c.equalsIgnoreCase ("s"))
	    return 's';
	else if (c.equalsIgnoreCase ("Doe") || c.equalsIgnoreCase ("d"))
	    return 'd';
	else if (c.equalsIgnoreCase ("Phoenix") || c.equalsIgnoreCase ("p"))
	    return 'p';
	else if (c.equalsIgnoreCase ("Horse") || c.equalsIgnoreCase ("h"))
	    return 'h';
	else
	    return 'w';

    }



    public char compChoice ()
    { //make a random number between 1 and 5
	//if the number is 1, return r; 2 return s; 3 return p
	int num = (int) (Math.random () * 5) + 1;
	if (num == 1)
	    return 's';
	else if (num == 2)
	    return 'd';
	else if (num == 3)
	    return 'p';
	else if (num == 4)
	    return 'h';
	else
	    return 'w';
    }


    public char winner (char comp, char user)
    {
	//Stags
	if (comp == 's' && user == 'd')
	    return 'u';
	else if (comp == 's' && user == 'p')
	    return 'c';
	else if (comp == 's' && user == 'h')
	    return 'c';
	else if (comp == 's' && user == 'w')
	    return 'u';
	//Doe
	else if (comp == 'd' && user == 's')
	    return 'c';
	else if (comp == 'd' && user == 'p')
	    return 'c';
	else if (comp == 'd' && user == 'h')
	    return 'u';
	else if (comp == 'd' && user == 'w')
	    return 'u';
	//Phoenix
	else if (comp == 'p' && user == 's')
	    return 'u';
	else if (comp == 'p' && user == 'd')
	    return 'u';
	else if (comp == 'p' && user == 'h')
	    return 'c';
	else if (comp == 'p' && user == 'w')
	    return 'c';
	//Horses
	else if (comp == 'h' && user == 's')
	    return 'u';
	else if (comp == 'h' && user == 'd')
	    return 'c';
	else if (comp == 'h' && user == 'p')
	    return 'u';
	else if (comp == 'h' && user == 'w')
	    return 'c';
	//Wolves
	else if (comp == 'w' && user == 's')
	    return 'c';
	else if (comp == 'w' && user == 'd')
	    return 'c';
	else if (comp == 'w' && user == 'p')
	    return 'u';
	else if (comp == 'w' && user == 'h')
	    return 'u';
	else
	    return 'b';

    }


    public void labyrinthTransition (int difficulty)
    {
	printSlow ("\nFinally, you manage to proceed, as you still know the corridor behind you is blocked.");
	printSlow ("Into the eerie cavern which is only getting darker as you go...");
	printSlow ("\nLumos\n");
	printSlow ("Now, you can see clearer, and you end upon the same room as last year, with seemingly nobody accompanying you...");
	printSlow ("All of a sudden, you hear an ominous voice...\n");
	printSlow ("A face appears from the stone tablet on a leactern in front of you...");
	Voldemort ();
	printSlow ("Harry, my boy... How have you been?");
	printSlow ("I know there weren't many times before this that I had the chance, but this time I'll be able to end you!");
	printSlow ("That is... unless you can somehow manage to escape this room, unharmed. There's jinxes on " + (4 * difficulty) + " spaces, which should spell your death");
	printSlow ("and then, once and for all, you shall not be known as the boy who lived, but the boy who Lord Voldemort spared as an example!");
	printSlow ("Sorry Harry, but your luck has run out!\n");
	printSlow ("Voldemort's face dissappears off the stone tablet, leaving you alone.");
    }


    public void Voldemort ()
    {
	System.out.println ("");
	System.out.println ("                                                            ");
	System.out.println ("                            .$NO.                           ");
	System.out.println ("                        87,,,,,,,,,,N                       ");
	System.out.println ("                     8..,,,,,,,,,,,,,,,O                    ");
	System.out.println ("                  .8,,,,,,,,,,,,,,,,,,,,,D.                 ");
	System.out.println ("                 Z.,,,,,,,,,,,,,,,,,,,,,,,..                ");
	System.out.println ("                M.,,,,,,,,,,,,,,,,,,,,,,,,,,8               ");
	System.out.println ("               8,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.              ");
	System.out.println ("             .7,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,O             ");
	System.out.println ("             N,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.            ");
	System.out.println ("            M,,,,,,,,,,,,,,,,,,,,,+=,,,,,,,,,,,,            ");
	System.out.println ("            ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.           ");
	System.out.println ("           D,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.           ");
	System.out.println ("           M,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,N,,M           ");
	System.out.println ("           M,,,,,,,,,,,,,,,,,,,,,,:7,,,,,,,,,D,,.           ");
	System.out.println ("           M,,,,,,I?OMN:,,,,,,,,,,,,,,,,,,,,,,,,.           ");
	System.out.println ("           N,,?,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,=,,.           ");
	System.out.println ("           Z,,,,,,,,,,,,,,,,,,,,,,,,~=:,,,,,?,,,..          ");
	System.out.println ("           D,,,,,,NN7MMN8O~,,,,,N,M,MMM7,MI~,,,,,.,,O       ");
	System.out.println ("       .:.,,,,,,:NIM?Z$,D?,M,,,,,,DIZN~,NN$?,,,,,,,ON       ");
	System.out.println ("        ,M,,,,.,,:,,,,,,D,N,,,,,,D,D,,,,?,,D,,,,,?M,O       ");
	System.out.println ("        DD?,:,,,,,,,,.,,,.,,,,,,,,,7,8,,,,,,,,,,~,,,D       ");
	System.out.println ("        ,,:,M,,,,,,,,,,,,,,,,,,,,,:,,,,,,,,,,,,,NM,$N       ");
	System.out.println ("        =,,,D,,,,,,,,,,,M,D,,,,,,,,.,,,,,,,,,,,,N=,,        ");
	System.out.println ("        :M,,M,,,,,,,,,,,,,,,,,,,M,,M,,,,,,,,,,,,N,,M        ");
	System.out.println ("         ,,,M,,,,,,,,,,N,.,M,,,,I,,,O,,,,,,,,,,,,~,.        ");
	System.out.println ("         8,,M.,,,,,,,,N,,,,,,,,M,,,,,,,,,,,,,,,N,,M         ");
	System.out.println ("          ,,,M,M,,,,,,,,,,,,,,,,,,,,,=,,,,,,8,,,,M.         ");
	System.out.println ("          .:,Z,$,,,,,Z,,,,,,,,,,,,,,7,Z,,,,D,,+Z.           ");
	System.out.println ("             .,,,,,,,.,?$,,,,,,,,,,,+,,,,,,+,,N             ");
	System.out.println ("              ,,I,,,N,,,,,?,D,,:8+,..,,,,,,+,,.             ");
	System.out.println ("              O,,,,,:,,?DMMMMI8MMMNMM$,,,,,,,M              ");
	System.out.println ("              ,,,,,,O.,,++++++++++7M,,.,,,,,,.              ");
	System.out.println ("               M,,,,,,,,,,,,,,,,,,,,,,,,,,,:,.              ");
	System.out.println ("               M,,,,,,,,,,,,,:I,,,,,,,,,,,D,,:              ");
	System.out.println ("              MM,,Z,,,,,,,,.,,,?,,,,,,,,D.,,,D              ");
	System.out.println ("             .DD,,,.,,,,,,,,,,,,,,,,,,,+,,,,,D.             ");
	System.out.println ("             ,DD$,,,,M,,,,,,,,,,,,,,,D=,,,8,NDD.            ");
	System.out.println ("            $MDDD,,,,~.D.,,,,,,,,,.M,,,,,,MDDDNDN           ");
	System.out.println ("          =DDMDDDD.,,,,,,,:,,,.~=,,,,,,,,,DDDDDDDDM.        ");
	System.out.println ("       ZNDDDDDDDDDD~,,,,,,,,,,,,,,,,,,,,=DDDDDDDDDDDDZ+.    ");
	System.out.println ("      O8DDDDDDDDDDDDM,,Z,,,,,,,,,,,,.,,MDDDDDDDDDDDDDZ=     ");
	System.out.println ("      $ODDDDDDDDDDDDDD,,,,,,,,,,,,,,,NDDDDDDDDDDDDDDD.      ");
	System.out.println ("      .7ZDDDDDDDDDDDDDDD,,,,N,,,,,.:DDDDDDDDDDDDDDDDD.      ");
	System.out.println ("      .ZZZZDDDDDDDDDDDDDDDN.,.,,,=DDDDDDDDDDDDDDDDD         ");
	System.out.println ("        ,..OODDDDDDDDDDDDDDDMM,,DDDDDDDDDDDDDDDDDZ7         ");
	System.out.println ("          .OOOODDDDDDDDDDDDDDDDDDDDDDDDDD8DDD888OZ:         ");
	System.out.println ("            I.88DD8D888$DDDD8DDDDD8OOOOZZ888888Z.. ");
    }


    public int labyrinth (int points, int difficulty, int life)
    {
	// Randomize these to be a value of s and m, with (4*difficulty) of 25 being a m, and rest being s
	// If 's', safe, if 'm', bomb!
	// 3 Strikes, and you die!, 5 Safes, you win!
	int mines = (4 * difficulty);

	for (int i = 0 ; i < 5 ; i++)
	{
	    for (int j = 0 ; j < 5 ; j++)
		minefield [i] [j] = 's';
	}


	for (int s = 0 ; s < mines ; s++)
	{
	    int k = (int) (Math.random () * 5);
	    int t = (int) (Math.random () * 5);
	    while (minefield [k] [t] == 'm')
	    {
		k = (int) (Math.random () * 5);
		t = (int) (Math.random () * 5);
	    }
	    minefield [k] [t] = 'm';
	}


	int minenum = 0;
	int safenum = 0;
	int square;
	while (safenum < 5 && minenum != 3)
	{
	    grid ();
	    do
	    {
		System.out.println ("  The Trapped Room");
		square = IBIO.inputInt ("\nEnter the square you want to pick: ");
	    }
	    while (square >= 25);
	    int x = (square / 5);
	    int y = (square % 5);
	    if (minefield [x] [y] == 'm')
	    {
		minenum++;
		points += 5;
		printSlow ("Ouch, you hit a jinx! Be careful, you only have " + (3 - minenum) + " before you perish!\n");
		minefield [x] [y] = 'b';
	    }
	    else if (minefield [x] [y] == 'b' || minefield [x] [y] == 'v')
	    {
		printSlow ("Nice try Harry, but you can't pick the same square twice!");
	    }
	    else
	    {
		safenum++;
		minefield [x] [y] = 'v';
		printSlow ("Good job, only " + (5 - safenum) + " until you're safe!\n");
	    }
	    if (minenum == 3)
		return 3;


	}

	printSlow ("Good job, you defeated Voldemort and his graveyard puzzle!");


	return 1;
    }


    public void grid ()
    {
	int n = 0;
	System.out.println (" --------------");
	for (int i = 0 ; i < 5 ; i++)
	{
	    System.out.print ("|");
	    for (int j = 0 ; j < 5 ; j++)
	    {
		if (minefield [i] [j] == 'v')
		    System.out.print (" s|");
		else if (minefield [i] [j] == 'b')
		    System.out.print (" m|");
		else if (n < 10)
		    System.out.print (" " + n + "|");
		else

		    System.out.print (n + "|");

		n++;

	    }
	    System.out.println ();
	    System.out.println (" --------------");
	}
    }


    public void printSlow (String s)
    {
	for (int i = 0 ; i < s.length () ; i++)
	{
	    System.out.print ("" + s.charAt (i));
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	}


	System.out.println ();
    }
}



