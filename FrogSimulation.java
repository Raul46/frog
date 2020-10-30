import java.lang.Math;

public class FrogSimulation 
{
    /** Distance, in inches, from the starting position to the goal */
    private int goalDistance;
    
    /** Maximum number of hops allowed to reach the goal */
    private int maxHops;
    
    /**
     * Constructs a FrogSimulation.
     * 
     * @param dist  the distance, in inches, from the starting position to the goal.
     * @param numHops   the maximum number of hops allowed to reach the goal
     * 
     * Precondition: dist > 0; numHops > 0
     */
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }
    
    /**
     * @return an integer representing the distance, in inches, to be moved when the frog hops
     */
    private int hopDistance()
    {
        int max = 10;
        int min = -10;
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    
    /**
    * Simulates a frog attempting to reach the goal as described in part (a).
    * 
    * @return true if the frog successfully reached or passed the goal during the simulation.
    */
    public boolean simulate()
    {
      
    }
    
    /**
     * Runs num simulations and returns the proportion of simulations in
     * which the frog successfully reached or passed the goal.
     * 
     * @return the proportion of simulations in which the frog successfully reaches the goal.
     */
    public double runSimulations(int num)
    {
        
    }
    
}
