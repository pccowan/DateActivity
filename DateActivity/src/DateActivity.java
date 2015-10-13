import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class DateActivity {

	public static void main(String[] args) {
		
		
		
		String input = "";
		String game = "";
		
		Date now = new Date();
		long elapsedNow = now.getTime() / (24 * 60 * 60 * 1000);
/*THis is the code I will need to pass for todays date
		
		System.out.println(dateFormat.format(now));
*/		
		Scanner keyboard = new Scanner(System.in);
		
		do{
			
		
		
		System.out.print("What is the date you are asking about? (MM/DD/YYYY) \t:");
		input = keyboard.nextLine();
		
		Scanner parse = new Scanner(input).useDelimiter("/");
		
		int month =parse.nextInt();
		int day = parse.nextInt();
		int year = parse.nextInt();
		
		now.setDate(day);
		now.setMonth(month-1);
		now.setYear(year-1900);
		int n = now.getDay();
		String DoW = dayOfTheWeek(n);
		
		long elapsedThen = now.getTime() / (24 * 60 * 60 * 1000);
		long daysPassed = (elapsedNow - elapsedThen);
		
		
		System.out.println("That was a "+DoW+". "+weekDay(n)+" "+daysPassed+" days have passed since then.\n");
		System.out.println("Would you like to continue entering dates? Yes/No");
		game = keyboard.nextLine().toLowerCase();
		
		
	
	}while(game.equals("yes"));
		keyboard.close();
		}
	

	public static String dayOfTheWeek(Integer b){
		String[] w = new String [7];
		w[0] = "Sunday";
		w[1] = "Monday";
		w[2] = "Tuesday";
		w[3] = "Wednesday";
		w[4] = "Thursday";
		w[5] = "Friday";
		w[6] = "Saturday";
		
		
		return w[b];
		
		
	}
	
	public static String weekDay(Integer a) {
	
		String[] day = new String [7];
		day[0] = "It was a sunny day and the temperature averaged 78 degress.";
		day[1] = "It was a really hot day and the temperature averaged 94 degrees.";
		day[2] = "That was a rainy day and I stayed inside playing video games...I couldn't tell you what the temperature averaged that day.";
		day[3] = "That was a windy day and I was on the golf course...What a horrible score.";
		day[4] = "That was an extremely foggy day and I got in a car accident with the car in front of me at a stoplight.";
		day[5] = "There was a lunar eclipse that day and I couldn't see it because it was so cloudy.";
		day[6] = "That was the day that I published my first book titled, PS4 \"for Noobs\".";
		
		
		Random r = new Random();
		int randDay = r.nextInt(7);
		return day[randDay];
		
		
	
	}

}


/*What is the date that you are asking about?    :  9/27/70
That was a Saturday. It was a sunny day and the temperature averaged 78 degrees. It was 23000 days ago.
What is the date that you are asking about?    :  
You can randomly generate the text about the weather and temperature that day, but you should know enough by now to accurately identify the day of the week and the number of days between that day and the current date.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Helpful Hint

First create a class that given a date has a method stub to return the output sentence.
Next, create methods stubs to find the day of the week, the number of days, the weather and the temperature.
One by one, fill in those method stubs to make them operational.
*/