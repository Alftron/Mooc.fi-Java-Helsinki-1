
import nhlstats.NHLStatistics;

public class Main
{

    public static void main(String[] args)
    {
        // Top ten goalscorers
        System.out.println("Top 10 goalscorers:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("");
        
        // Top 25 penalty takers
        System.out.println("Top 25 penalty takers:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("");
        
        // Show Sidney Crosby
        System.out.println("Sidney Crosby Stats:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("");
        
        // Show Philidelphia Flyers stats
        System.out.println("PHI Stats:");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("");
        
        // Show Anaheim Ducks players
        System.out.println("ANA Players:");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
