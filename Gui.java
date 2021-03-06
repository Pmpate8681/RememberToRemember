import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;

public class Gui extends JFrame
{
  
  private ArrayList<String> temp = new Quote().getArray(); //Declaring and constructing an array that refers to the array in class Quote!
  private JLabel primary;
  private JButton next, theme, eButton;
  Quote q;
  private int posX, posY;
  private static float trans = 0.6f;
  private static final float ONE = 0.1f; 
  private Timer timer; //Timer test code!!!!!!!!!
  
  //Constructor*********************************************************************************************************
  public Gui()
  {
    
    // Initializing the timer object!!!!!!!!
    timer = new Timer(60000, new ButtonListener());
    timer.start();
    
    //Lets make a object of class Quote and add the quote at index zero onto the panel
    Quote q = new Quote();
    String displayQuote = q.getQuote();
    
    //Creation of a ButtonListener class object
    ButtonListener listener = new ButtonListener();
    
 
    //Creation of a Font object. 
    
    Font font = new Font("Vivaldi", Font.BOLD, 35);
    
    
/*    try{
    Font font = Font.createFont(Font.TRUETYPE_FONT, new)
    } catch (IOException e)
    {
      e.printStackTrace();
    } catch (FontFormatException e)
    {
      e.printStackTrace();
    }
*/   
    
    //Creation of a JLabel
    primary = new JLabel("", SwingConstants.CENTER);
    primary.setPreferredSize(new Dimension(700, 285));
    primary.setFont(font);
    primary.setForeground(Color.WHITE);
    primary.setText(displayQuote);

    
    //Creation of a button
    next = new JButton("NEXT");
    next.setPreferredSize(new Dimension(400,30));
    next.setBackground(Color.BLACK);
    next.setBorderPainted(false); // Now this method here is awesome! Removes the border from a button!
    next.addActionListener(listener);
    
    //Creating the Color button
    theme = new JButton("THEME");
    theme.setPreferredSize(new Dimension(400,30));
    theme.setBackground(Color.BLACK);
    theme.setBorderPainted(false);  // Now this method here is awesome! Removes the border from a button!
    theme.addActionListener(listener);
    
    //creation of a button that adjusts transparency
    eButton = new JButton("X");
    eButton.setPreferredSize(new Dimension(50,30));
    eButton.setBorderPainted(false);  // Now this method here is awesome! Removes the border from a button!
    eButton.setBackground(Color.BLACK);
    eButton.addActionListener(listener);
    
    setLayout(new FlowLayout());
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  
    add(primary);
    add(next);
    add(theme);
    add(eButton);
    setPreferredSize(new Dimension(900, 330));
    
    //Adding listeners to the frame
    addMouseListener(listener);
    addMouseMotionListener(listener);

    
    //Setting background color here
    getContentPane().setBackground(Color.BLACK);
 
    setResizable(false);
    setUndecorated(true);
    com.sun.awt.AWTUtilities.setWindowOpacity(this, trans);
    pack();
    setVisible(true);
  } //Constructor ends**************************************************************************************************
  
  
  //ButtonListener class
  private class ButtonListener implements ActionListener, MouseListener, MouseMotionListener
  {
    
    int count = 0; // Used in the if statement below
  //  int speed = 60000; // 60k Milliseconds = 60 seconds
    
    public void actionPerformed(ActionEvent event)
    {
      
      q = new Quote();
      String ranQuote = q.getQuote();
      primary.setText(ranQuote);
      
      //If the next button is clicked
 /*     if(event.getSource() == next)
      {
        q = new Quote();
        String ranQuote = q.getQuote();
        primary.setText(ranQuote);
      }  */
      
      //If the theme button is clicked
      if(event.getSource() == theme)
      {
        count++;
        
        switch(count)
        {
          case 1:
            //Change frame background color
            getContentPane().setBackground(Color.BLUE);
            primary.setForeground(Color.WHITE);
            next.setBackground(Color.BLUE);
            next.setForeground(Color.WHITE);
            theme.setBackground(Color.BLUE);
            theme.setForeground(Color.WHITE);
            eButton.setBackground(Color.BLUE);
            eButton.setForeground(Color.WHITE);
            
            break;
            
          case 2:
            getContentPane().setBackground(Color.YELLOW);
            primary.setForeground(Color.BLACK);
            next.setBackground(Color.YELLOW);
            next.setForeground(Color.BLACK);
            theme.setBackground(Color.YELLOW);
            theme.setForeground(Color.BLACK);
            eButton.setBackground(Color.YELLOW);
            eButton.setForeground(Color.BLACK);
            break;
          
          case 3:
            getContentPane().setBackground(new Color(112, 12, 19));
            primary.setForeground(Color.WHITE);
            next.setBackground(new Color(112, 12, 19));
            next.setForeground(Color.WHITE);
            theme.setBackground(new Color(112, 12, 19));
            theme.setForeground(Color.WHITE);
            eButton.setBackground(new Color(112, 12, 19));
            eButton.setForeground(Color.WHITE);
            break;
            
          case 4:
            getContentPane().setBackground(Color.BLACK);
            primary.setForeground(Color.WHITE);
            next.setBackground(Color.BLACK);
            next.setForeground(Color.WHITE);
            theme.setBackground(Color.BLACK);
            theme.setForeground(Color.WHITE);
            eButton.setBackground(Color.BLACK);
            eButton.setForeground(Color.WHITE);
            break;
            
          case 5:
            getContentPane().setBackground(Color.PINK);
            primary.setForeground(Color.BLACK);
            next.setBackground(Color.PINK);
            next.setForeground(Color.BLACK);
            theme.setBackground(Color.PINK);
            theme.setForeground(Color.BLACK);
            eButton.setBackground(Color.PINK);
            eButton.setForeground(Color.BLACK);
            break;
            
           case 6:
            getContentPane().setBackground(new Color(188, 247, 188));
            primary.setForeground(Color.BLACK);
            next.setBackground(new Color(188, 247, 188));
            next.setForeground(Color.BLACK);
            theme.setBackground(new Color(188, 247, 188));
            theme.setForeground(Color.BLACK);
            eButton.setBackground(new Color(188, 247, 188));
            eButton.setForeground(Color.BLACK);
            break;
            
          case 7:
            getContentPane().setBackground(new Color(222, 121, 7));
            primary.setForeground(Color.BLACK);
            next.setBackground(new Color(222, 121, 7));
            next.setForeground(Color.BLACK);
            theme.setBackground(new Color(222, 121, 7));
            theme.setForeground(Color.BLACK);
            eButton.setBackground(new Color(222, 121, 7));
            eButton.setForeground(Color.BLACK);
            break;
          
            
          default:
            getContentPane().setBackground(Color.WHITE);
            primary.setForeground(Color.BLACK);
            next.setBackground(Color.WHITE);
            next.setForeground(Color.BLACK);
            theme.setBackground(Color.WHITE);
            theme.setForeground(Color.BLACK);
            eButton.setBackground(Color.WHITE);
            eButton.setForeground(Color.BLACK);
            break;
        }
             if(count > 7)
                  {
                     count = 0;
                  }

      
      }
      
      //If the X button is clicked
      if(event.getSource()== eButton)
      {
        System.exit(0); // This method closes the program!
      }
    }
    
    public void mousePressed(MouseEvent event)
    {
      posX = event.getX();
      posY = event.getY();
    }
    public void mouseReleased(MouseEvent event){}
    public void mouseExited(MouseEvent event)
    {
    //  next.setVisible(false);
    //  theme.setVisible(false);
    }
    public void mouseEntered(MouseEvent event)
    {
    //  next.setVisible(true);
    // theme.setVisible(true);
    }
    public void mouseClicked(MouseEvent event){}
    public void mouseMoved(MouseEvent event){}
    
    public void mouseDragged(MouseEvent event)
    {
       setLocation(event.getXOnScreen() - posX, event.getYOnScreen() - posY);
    }
  
  }
  
}