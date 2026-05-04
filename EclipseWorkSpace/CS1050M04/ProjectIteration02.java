import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Isabella Eaton
 * CS1050-004 (T/TH)
 * Project iteration 02- implement classes
 * Program description:the program reads athlete statistics from a txt file, calculates fitness metrics 
 * (BMI, MHR), and performs a comprehensive team analysis and returns these results.
 */

//================= PUBLIC CLASS =================
public class ProjectIteration02
{
	public static void main(String[] args)
	{
		//User story 1: display program overview 
		displayProgramSummary();

		// ===== TEST 1 =====
		//using test1.txt document created from team2.txt outline
		String fileName = "team1.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);
			Team team = new Team("Nuggets", 6);
			
			teamSetUp(fileName, team);
			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			//User story 3: read athlete data from file (handling "file not found" error)
			System.out.println("Error: Unable to find file " + fileName);
		}

		// ===== TEST 2 =====
		fileName = "team2.txt";

		try
		{
			System.out.println("\nTesting file: " + fileName);
			Team team = new Team("Team CS", 4);
			
			teamSetUp(fileName, team);
			runAnalysis(team);

		} catch (FileNotFoundException exception)
		{
			System.out.println("Error: Unable to find file " + fileName);
		}

		System.out.println("\nEnd of program");
	}//end main method

	
	/**
	 * Reads athlete data from the .txt file and adds them to the Team object
	 * @param fileName (path to text file)
	 * @param team (object)
	 * @throws FileNotFoundException(if input file foes not exist)
	 */
	public static void teamSetUp(String fileName, Team team) throws FileNotFoundException
	{
		//User story 3: read athlete data from a file
		File inputFile= new File(fileName);
		
		Scanner fileScanner= new Scanner(inputFile);
				
				while(fileScanner.hasNext()) 
				{
					String name=fileScanner.next();
					double weight=fileScanner.nextDouble();
					double height= fileScanner.nextDouble();
					int age= fileScanner.nextInt();
					
					//user story 3: create athlete object and add to team
					Athlete athlete=new Athlete( name, weight, height, age);
					team.addAthlete(athlete);
				}
		fileScanner.close();
	}

	/**
	 * completes team analysis and displays results in output
	 * @param Team object team used in analysis
	 */
	public static void runAnalysis(Team team) throws FileNotFoundException
	{
		System.out.println("\n========== Team Analysis ==========");
		System.out.println("Team: " + team.getTeamName());
		System.out.println("Total Athletes: " + team.getAthleteCount());
		System.out.println();

		//User story 6: display athlete BMI value, category, and max heart rate
		team.displayAthleteResults();
		
		//User story 7: list all athletes outside normal BMi range
		team.displayAthletesOutsideNormalBMI();
		
		//User story 8: calcualte and display average of the max heart rates
		double avg = team.calculateAverageMaxHeartRate();
		System.out.println("\nAverage Max Heart Rate: " + avg);
		
		//user story 10: list athletes above or equal to average MHR
		team.displayAthletesAboveAverageMHR(avg);
		
		//User story 9: identify athlete with highest max heart rate
		team.displayHighestMHR();
		
		//User story 12: smallest and largest height
		team.displaySmallestLargestHeight();
		
		//User story 13: write athlete results to file 
		String outputFileName = team.getTeamName() + ".txt";
		team.writeAthletesToFile(outputFileName);

	}

	// ================= DISPLAY PROGRAM OVERVIEW =================
/**
 * Provides an overview of the program tasks and in which order they will run.
 */
	public static void displayProgramSummary()
	{
		System.out.println("**************************************");
		System.out.println("Team and Athlete Analysis");
		System.out.println("**************************************");
		System.out.println("Reads athlete data from file\n"
				+"Displays athlete results\n"
				+"Performs team analysis\n"
				+"Writes results to file\n");
	}
}//end public class

// ================= ATHLETE CLASS =================

class Athlete
{
	//instance variables
	private String name;
	private double weight;
	private double height;
	private int age;
	
	/**constructor for an athlete 
	 * @param teamName name of the athlete
	 * @param weight of athlete in lbs
	 * @param heightof athlete in inches
	 * @param age of athlete in years
	 */
	public Athlete( String name, double weight, double height, int age)
	{
		this.name=name;
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * User Story 4: calculate BMI
	 * Calculates the BMI rate for an athlete 
	 * formula: (703*weight)/(height^2)
	 * @return athleteBMI (double)
	 */
	public Double calculateBMI()
	{
		double bmiConstant= 703.0;
		double athleteBMI=(bmiConstant* weight)/(height*height);
		return athleteBMI;
	}
	
	/**
	 * User story 6: determine category
	 * Determines the BMI category of a given athlete based on their calculated BMI rate
	 * uses the following BMI scale:
	 * Normal: 18.5 to 29.99
	 * Under weight:less than 18.5
	 * Over weight: 30.0 and higher
	 * @return category (string)
	 */
	public String determineBMICategory()
	{
		double bmiValue=calculateBMI();
		String category="Normal";
		
		if(bmiValue>=30.0)
		{
			category="High";
		}
		else if (bmiValue<18.5)
		{
			category="Underweight";
		}
		return category;
	}
	
	/**
	 * User story 5: calculate MHR
	 * Calculates maximum heart rate for an athlete given their age.
	 * formula: 220-athlete age
	 * @return mhr (int)
	 */
	public int calculateMaxHeartRate()
	{
		int mhrConstant=220;
		int mhr=mhrConstant-age;
		return mhr;
	}
	
	/**
	 * User story:6 display athlete metrics
	 * prints athlete overview after computing stats.
	 * displays:
	 * athlete name 
	 * BMi rounded to .1
	 * the athlete's associated BMI category
	 * the athletes maximum heart rate
	 */
	public void displayAthleteAnalysis()
	{
		System.out.println(name);
		System.out.printf("BMI: %.1f%n", calculateBMI());
		System.out.println("Category: "+determineBMICategory());
		System.out.println("MHR: "+calculateMaxHeartRate());
		System.out.println("\n       ");
	}
}

// ================= TEAM CLASS =================

/** 
 * computes averages and identifies min and max values for whole team, returns these values to the output.
 */
class Team
{
	//instance variables
	private String teamName;
	private Athlete[] athletes;
	private int athleteCount;

	/**constructor for a team of athletes
	 * @param teamName name for team
	 * @param maxAthletes the size of the athletes array
	 */
	public Team(String teamName, int maxAthletes)
	{
		this.teamName=teamName;
		this.athletes= new Athlete[maxAthletes];
		this.athleteCount=0;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	
	public int getAthleteCount()
	{
		return athleteCount;
	}
	
	/**adds an athlete to the team if space is not available 
	 * @param athlete the athlete object 
	 */
	public void addAthlete(Athlete athlete)
	{
		if(athleteCount<athletes.length)
		{
			athletes[athleteCount]=athlete;
					athleteCount++;
		}
		else
		{
			//User story 3: message when team is full.
			System.out.println("Team is full. Can't add "+ athlete.getName());
		}
	}
	
	//loops through and displays results for every athlete on the team
	public void displayAthleteResults()
	{
		for(int i=0;i<athleteCount;i++)
		{
		athletes[i].displayAthleteAnalysis();	
		}
	}
	
	/** 
	 * User story 7: filters and displays athletes with non-normal BMI values.
	 */
	public void displayAthletesOutsideNormalBMI()
	{
		System.out.println("Athletes outside notmal BMI range: ");
		for (int i=0; i<athleteCount;i++)
		{
			String category=athletes[i].determineBMICategory();
			if(category.equals("High"))
			{
				System.out.println("\nAbove normal: "+athletes[i].getName());
			}
			else if (category.equals("Underweight"))
				{
				System.out.println("\nBelow normal: " +athletes[i].getName());
				}
		}
	}
	/**
	 * User story 8: calculates the mean MHR of the entire team
	 * @return average max heart rate
	 */
	public double calculateAverageMaxHeartRate()
	{
		double totalMHR=0;
		for(int i=0; i<athleteCount;i++)
		{
			totalMHR=totalMHR+athletes[i].calculateMaxHeartRate();
		}
		double avg=0;
		if (athleteCount>0)
		{
			avg=totalMHR/athleteCount;
		}
		return avg;
	}
	/**
	 * User story 10: lists athletes above or equal to max heart rate average
	 * @param avg the team average to make comparisons with
	 */
	public void displayAthletesAboveAverageMHR(double avg)
	{
		System.out.println("\nAthletes above or equal to average MHR: ");
		for(int i=0; i<athleteCount;i++)
		{
			if(athletes[i].calculateMaxHeartRate()>=avg);
			{
				System.out.println(athletes[i].getName());
			}
			
		}
	}
	/**
	 * user story 9: identifies the athlete with the highest MHR
	 */
	public void displayHighestMHR()
	{
		int maxMHR=0;
		String name="";
		for(int i=0;i<athleteCount;i++)
		{
			if(athletes[i].calculateMaxHeartRate()>maxMHR)
			{
			maxMHR=athletes[i].calculateMaxHeartRate();
			name=athletes[i].getName();
			}
		}
		System.out.println("\nHighest max heart rate: ");
		System.out.println(name+ ": "+maxMHR);
	}
	/**
	 * user story 12: finds and displays the range of heights in the group 
	 * displays smallest to largest 
	 */
	public void displaySmallestLargestHeight()
	{
		double minHeight=athletes[0].getHeight();
		double maxHeight=athletes[0].getHeight();
		String minName=athletes[0].getName();
		String maxName=athletes[0].getName();
		
		for(int i=0; i<athleteCount;i++)
		{
			if(athletes[i].getHeight()<minHeight)
			{
				minHeight=athletes[i].getHeight();
				minName=athletes[i].getName();
			}
			if (athletes[i].getHeight()>maxHeight)
			{
				maxHeight=athletes[i].getHeight();
				maxName=athletes[i].getName();
			}
		}
		System.out.println("\nShortest Athlete:\n " + minName + " - " + minHeight+ " inches");
		System.out.println("\nTallest Athlete:\n " + maxName + " - " + maxHeight+ " inches");
	}
	/**
	 * user story 13: write athlete results to a .txt file.
	 * @param fileName name of the file to create  ([teamName].txt)
	 */
	public void writeAthletesToFile(String fileName)
	{
		//specifies file name and where to store file
		File outputFile= new File(fileName);
		try
		{
			PrintWriter writer= new PrintWriter(outputFile);
			//create file header
			writer.println("Team: "+ teamName);
			writer.println("Total athletes: "+ athleteCount);
			//loops through athlete data and writes result into txt file
			for (int i=0; i<athleteCount;i++)
			{
				writer.println(athletes[i].getName());
				writer.printf("\nBMI: %.2f%n", athletes[i].calculateBMI());
				writer.println("Category: " + athletes[i].determineBMICategory());
				writer.println("MHR: " + athletes[i].calculateMaxHeartRate() + "\n");
			}
			//completes writing process to save to file
			writer.close();
			System.out.println("\nResults written to file: " + outputFile.getAbsolutePath());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error writing to file.");	
		}
	}

}










