import java.util.*;

public class Quote
{

//Creating the ArrayList that will hold Quotes as String objects. 
  private ArrayList<String> QuoteArray = new ArrayList<String>();
  
  
  //Constructor************************************************************************
  public Quote()
  {
    //Bruce Lee Quotes and some others that I like
   QuoteArray.add(0, "<html><p>Notice that the stiffest tree is most easily cracked, while the bamboo or willow survives by bending with the wind. -Bruce Lee </p></html>"); //Adding a quote at index 0
   QuoteArray.add(1, "<html><p>Life itself is your teacher, and you are in a state of constant learning. -Bruce Lee</p></html>");
   QuoteArray.add(2, "<html><p>If you love life, don't waste time, for time is what life is made up of.\n-Bruce Lee</p></html>");
   QuoteArray.add(3, "<html><p>A wise man can learn more from a foolish question than a fool can learn from a wise answer. -Bruce Lee </p></html>");
   QuoteArray.add(4, "<html><p>Knowledge will give you power, but character respect. -Bruce Lee </p></html>");
   QuoteArray.add(5, "<html><p>A quick temper will make a fool of you soon enough. -Bruce Lee </p></html>");
   QuoteArray.add(6, "<html><p>I'm not in this world to live up to your expectations and you're not in this world to live up to mine. -Bruce Lee </p></html>");
   QuoteArray.add(7, "<html><p>As you think, so shall you become. -Bruce Lee </p></html>");
   QuoteArray.add(8, "<html><p>Always be yourself, express yourself, do not go out and look for a successful personality and duplicate it. -Bruce Lee </p></html>");
   QuoteArray.add(9, "<html><p>Do not fear failure...in great attempts it is glorious even to fail. -Bruce Lee </p></html>");
   QuoteArray.add(10,"<html><p>Do not pray for an easy life. Pray for the strength to endure a difficult one. -Bruce Lee </p></html>"); 
   QuoteArray.add(11,"<html><p>In extreme situations, the entire universe becomes our foe; at such critical times, unity of mind and technique is essential - do not let your heart waver! -Morihei Ueshiba</p></html>"); 
   QuoteArray.add(12,"<html><p>Do not dwell in the past, do not dream of the future, concentrate the mind on the present moment. -Buddha</p></html>");
   QuoteArray.add(13,"<html><p>We are shaped by our thoughts; we become what we think. When the mind is pure, joy follows like a shadow that never leaves. -Buddha </p></html>"); 
   QuoteArray.add(14,"<html><p>By three methods we may learn wisdom: First, by reflection, which is noblest; Second, by imitation, which is easiest; and third by experience, which is the bitterest. -Confucius</p></html>");
   QuoteArray.add(15,"<html><p>To practice five things under all circumstances constitutes perfect virtue; these five are gravity, generosity of soul, sincerity, earnestness, and kindness. -Confucius </p></html>");
   QuoteArray.add(16, "<html><p>If I am walking with two other men, each of them will serve as my teacher. I will pick out the good points of the one and imitate them, and the bad points of the other and correct them in myself. -Confucius</p></html>");
  }// *******************************************************************
  

  
 /* Method that returns the string at a random index in the ArrayList */
  public String getQuote()
  {
    Random gen = new Random();
    int index = gen.nextInt(QuoteArray.size());
    String randomQuote = QuoteArray.get(index);
    return randomQuote;
  }
  
  // Method that returns the array in this class
  public ArrayList<String> getArray()
  {
    return QuoteArray;
  }
  
  //Method that returns a string at a specific index of arraylist
  public String getString(int index)
  {
    return QuoteArray.get(index);
  }
  

  


}
