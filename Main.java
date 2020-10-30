class Main 
{
  public static void main(String[] args) 
  {
    FrogSimulation fs = new FrogSimulation(50, 8);
    System.out.println(fs.simulate());
    System.out.println(fs.runSimulations(50));
  }
}