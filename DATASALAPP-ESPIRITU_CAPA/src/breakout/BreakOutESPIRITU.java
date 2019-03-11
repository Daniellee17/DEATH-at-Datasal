package breakout;

import mylist.MyList;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;

    public class BreakOutESPIRITU extends GraphicsProgram 
    {       
        public static void main(String[] args)
        {     new BreakOutESPIRITU().start(args);     } 
         
        private int x =0;
        private int p = 0;
        private int Lives = 3;
        private int GamesPlayed =1;
        private int brickCounter = 100;
        public static final int APPLICATION_WIDTH = 400;
        public static final int APPLICATION_HEIGHT = 600;  
        private static final int WIDTH = APPLICATION_WIDTH;
        private static final int HEIGHT = APPLICATION_HEIGHT;
        private static final int PADDLE_WIDTH = 60;
        private static final int PADDLE_HEIGHT = 10;
        private static final int PADDLE_Y_OFFSET = 30;
        private static final int NBRICKS_PER_ROW = 10;
        private static final int NBRICK_ROWS = 10;
        private static final int BRICK_SEP = 4;
        private static final int BRICK_WIDTH =
        (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;
        private static final int BRICK_HEIGHT = 8;
        private static final int BALL_RADIUS = 15;
        private static final int BRICK_Y_OFFSET = 70;
        private static final int NTURNS = 3;
        private double vx, vy;	
        private RandomGenerator rgen = RandomGenerator.getInstance();
        private static final int DELAY = 10;
        
        private MyList<Integer> list1 = new MyList<Integer>();

        private GLabel lbl = new GLabel("CLICK TO START",WIDTH/2-110 ,HEIGHT/2);        
        private GImage img;
        private GLabel LivesLeft = new GLabel("Lives: "+ Lives,300 ,35);
        
        private void drawImg() 
        {
            img = new GImage("111.gif");            
            lbl.setColor(Color.YELLOW);
            lbl.setFont(new Font("Serif", Font.BOLD, 30));
            hScore.setFont(new Font("Serif", Font.BOLD, 15));
            add(img,0,0);
            add(lbl);           
            this.waitForClick();
        }     
        
        public void run() 
        {          
            this.setBackground(Color.pink);
            list1.createList();
            
            for(;;)
            {
                println("GAME " + GamesPlayed + " is Starting......");
                x=0;
                hScore.setLabel("SCORE: 0");
                drawPaddle();
                drawBricks( getWidth()/2, BRICK_Y_OFFSET);
                for(int Lives=NTURNS; Lives > 0; Lives--)                 
                {   
                    LivesLeft.setColor(Color.RED);
                    LivesLeft.setFont(new Font("Serif", Font.BOLD, 15));
                    LivesLeft.setLabel("Lives Left: " + Lives);
                    add(LivesLeft);
                    setUpGame();                
                    playGame();                 

                    if(brickCounter == 0) 
                    {
                        ball.setVisible(false);
                        printWinner();
                        break;
                    }
                }
            
                if(brickCounter > 0) 
                {
                        printGameOver();
                        GLabel SeeScore = new GLabel("Click on Screen to View High Scores");
                        SeeScore.setFont(new Font("Serif", Font.BOLD, 15));
                        SeeScore.setColor(Color.BLACK);
                        add(SeeScore,WIDTH/2-120 ,550);    
                        this.waitForClick();
                        removeAll();
                        HighScore();

                        this.waitForClick();

                        removeAll();
                        GamesPlayed++;

                } 
            } 
        }
             
        private GLabel hScore = new GLabel("SCORE: "+ x);
        private void HighScore()
        {
            MethodList1();
            
            GLabel ScoreTitle0 = new GLabel("TOP 5");
            ScoreTitle0.setFont(new Font("Serif", Font.BOLD, 23));
            ScoreTitle0.setColor(Color.BLACK);
            add(ScoreTitle0,WIDTH/2-90 ,60); 
            
            GLabel ScoreTitle = new GLabel("HIGH SCORES");
            ScoreTitle.setFont(new Font("Serif", Font.BOLD, 30));
            ScoreTitle.setColor(Color.RED);
            add(ScoreTitle,WIDTH/2-90 ,80); 

            for(int i = 1; i <= list1.size(); i++)
            {
                GLabel item = new GLabel(""+ i +".  " + list1.get(i) + "pts");
                item.setFont(new Font("Serif", Font.BOLD, 20));
                item.setColor(Color.BLACK);
                add(item,WIDTH/2-40 ,100+(20*i));                        
            }  
            
            GLabel PlayAgain = new GLabel("Click on Screen to Play Again");
            PlayAgain.setFont(new Font("Serif", Font.BOLD, 15));
            PlayAgain.setColor(Color.BLACK);
            add(PlayAgain,WIDTH/2-90 ,550);      
        }

        private void setUpGame() 
        {
            drawImg();
            drawBall();
            add(hScore,300,15);

        }
        
        private GRect brick;
        private void drawBricks(double cx, double cy)
        {
            for( int row = 0; row < NBRICK_ROWS; row++ ) 
            {
                for (int column = 0; column < NBRICKS_PER_ROW; column++) 
                {
                    double x = cx - (NBRICKS_PER_ROW*BRICK_WIDTH)/2 - ((NBRICKS_PER_ROW-1)*BRICK_SEP)/2 + column*BRICK_WIDTH + column*BRICK_SEP;
                    double y = cy + row*BRICK_HEIGHT + row*BRICK_SEP;
                    brick = new GRect( x , y , BRICK_WIDTH , BRICK_HEIGHT );
                    add (brick);
                    brick.setFilled(true);

                    if (row < 2) 
                    {
                            brick.setColor(Color.RED);
                    }
                    
                    if (row == 2 || row == 3) 
                    {
                            brick.setColor(Color.ORANGE);
                    }
                    
                    if (row == 4 || row == 5) 
                    {
                            brick.setColor(Color.YELLOW);
                    }
                    
                    if (row == 6 || row == 7) 
                    {
                            brick.setColor(Color.GREEN);
                    }
                    
                    if (row == 8 || row == 9) 
                    {
                            brick.setColor(Color.CYAN);

                    }
                }
            }
        }

        private GRect paddle;
        private void drawPaddle() 
        {
                double x = getWidth()/2 - PADDLE_WIDTH/2; 
                double y = getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT;
                paddle = new GRect (x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
                paddle.setFilled(true);
                paddle.setColor(Color.ORANGE);
                add (paddle);
                addMouseListeners();
        }

        public void mouseMoved(MouseEvent e) 
        {
            if ((e.getX() < getWidth() - PADDLE_WIDTH/2) && (e.getX() > PADDLE_WIDTH/2)) 
            {
                paddle.setLocation(e.getX() - PADDLE_WIDTH/2, getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT);
            }
        }

        private GOval ball; 
        private void drawBall()
        {
            double x = getWidth()/2 - BALL_RADIUS;
            double y = getHeight()/2 - BALL_RADIUS;
            ball = new GOval(x, y, BALL_RADIUS + 11, BALL_RADIUS + 11);
            ball.setFilled(true);
            ball.setColor(Color.WHITE);
            add(ball);
        }

        private void playGame()
        {
            remove(lbl);
            vy = -3;
            getBallVelocity();

            while (true) 
            {
                moveBall();
                if (ball.getY() >= getHeight())
                {   break;  }
                if(brickCounter == 0) 
                {   break;  }
                
            }
        }
        
        private void setHighScore(int g)
        {   x=g;               
        }
        
        private int getHighScore()
        {   return x;  }

        private void getBallVelocity() 
        {
            vy=vy;
            vx = rgen.nextDouble(1.0, 6.0);
        }

        private void moveBall()
        {

            ball.move(vx, vy);
            if ((ball.getX() - vx <= 0 && vx < 0 )|| (ball.getX() + vx >= (getWidth() - BALL_RADIUS*2) && vx>0)) 
            {   vx=-vx;  }
            if ((ball.getY() - vy <= 0 && vy < 0 )) 
            {   vy=-vy;  }

            GObject collider = getCollidingObject();
            if (collider == paddle) 
            {	
                if(ball.getY() >= getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 && ball.getY() < getHeight() - PADDLE_Y_OFFSET - PADDLE_HEIGHT - BALL_RADIUS*2 + 4)
                {   vy = -vy;   }
            } 

            else if (collider != null) 
            {                       
                if(collider.getColor()==Color.RED)
                {
                    setHighScore(getHighScore()+500);
                    hScore.setLabel("SCORE: "+getHighScore());
                }
                
                else if(collider.getColor()==Color.YELLOW)
                {
                    setHighScore(getHighScore()+300);
                    hScore.setLabel("SCORE: "+getHighScore());
                }
                
                else if(collider.getColor()==Color.ORANGE)
                {
                    setHighScore(getHighScore()+400);
                     hScore.setLabel("SCORE: "+getHighScore());
                }
                else if(collider.getColor()==Color.GREEN)
                {
                    setHighScore(getHighScore()+200);
                    hScore.setLabel("SCORE: "+getHighScore());
                }
                
                else if(collider.getColor()==Color.CYAN)
                {
                    setHighScore(getHighScore()+100);
                    hScore.setLabel("SCORE: "+getHighScore());
                }
                
                remove(collider);
                brickCounter--;
                vy = -vy;
            }
            
            pause (DELAY);
        }

        private GObject getCollidingObject() 
        {

            if((getElementAt(ball.getX(), ball.getY())) != null) 
            {   return getElementAt(ball.getX(), ball.getY());   }
            
            else if (getElementAt( (ball.getX() + BALL_RADIUS*2), ball.getY()) != null )
            {   return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY());   }
            
            else if(getElementAt(ball.getX(), (ball.getY() + BALL_RADIUS*2)) != null )
            {   return getElementAt(ball.getX(), ball.getY() + BALL_RADIUS*2);   }
            
            else if(getElementAt((ball.getX() + BALL_RADIUS*2), (ball.getY() + BALL_RADIUS*2)) != null )
            {   return getElementAt(ball.getX() + BALL_RADIUS*2, ball.getY() + BALL_RADIUS*2);  }
            
            else
            {    return null;   }
        }

        private void printGameOver() 
        {
            removeAll();
            GLabel gameOver = new GLabel ("Game Over", getWidth()/2, getHeight()/2);
            gameOver.move(-gameOver.getWidth()/2, -gameOver.getHeight());
            gameOver.setColor(Color.RED);
            gameOver.setFont(new Font("Serif", Font.BOLD, 30));
            add(gameOver,WIDTH/2-70 ,HEIGHT/2-30);
            add(hScore,WIDTH/2-43 ,HEIGHT/2);
        } 
        
        private void printWinner() 
        {
            GLabel Winner = new GLabel ("You won", getWidth()/2, getHeight()/2);
            Winner.move(-Winner.getWidth()/2, -Winner.getHeight());
            Winner.setColor(Color.RED);
            add (Winner);
        }
        
        private void MethodList1()
        {    
            int n=0;
            if(list1.isEmpty())
            {
                list1.add(1, x);
            }
            
            else
            {
                for(int i=1; i<=list1.size();i++ )
                {
                    if(x>=list1.get(i))
                    {
                        if(list1.size()==5)
                        list1.remove(5);
                        list1.add(i,x);
                        n=1;
                        break;        
                    }                 
                }
                
                if(n==0)
                {
                    list1.add(list1.size()+1,x);
                } 
            }
            
            println("\nSCORE = " + x);
            println("Total Games Played = " + GamesPlayed);
            println("Current Size of List = " + list1.size() + "\n\n");   
        }
    }	