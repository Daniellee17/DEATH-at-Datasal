
import acm.graphics.*;
import acm.program.*;
import breakout.BreakOutESPIRITU;
import calculator.CalcuESPIRITU;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import mylist.*;
import queue.*;

public class MAINCLASS extends GraphicsProgram {

    int thirdStreet_CHAR_TRUE = 0;
    int locationLabel_TRUE = 0;
    int secondStreet_CHAR_TRUE = 0;
    int theAlleyCHAR_TRUE = 0;
    int theEscapeCHAR_TRUE = 0;
    int YouWon = 0;
    int addToPack_TRUE = 0;
    int shampoo_TRUE = 0;
    int brickGame_TRUE = 0;
    int storyLine1_TRUE = 0;

    int ok = 0; 
    int check1 = 0;
    int check2 = 0;
    int check3 = 0;
    int check4 = 0;
    int check5 = 0;
    int check6 = 0;
    int check7 = 0;
    
    int checkk1 = 0;
    int checkk2 = 0;
    int checkk3 = 0;
    int checkk4 = 0;
    int checkk5 = 0;
    int checkk6 = 0;
    int checkk7 = 0;

    int casefile_pulot = 0;
    int display_casefile = 0;

    int secondStreet_TALK1_TRUE = 0;

    int gameOver_TRUE = 0;

    int thirdStreet_TALK1_TRUE = 0;
    int fourthStreet_TALK1_TRUE = 0;
    int fifthStreet_TALK1_TRUE = 0;
    int sixthStreet_TALK1_TRUE = 0;
    int seventhStreet_TALK1_TRUE = 0;
    int thirdStreet_q1 = 0;
    GImage casefile = new GImage("Case_File.png");
    int sixthStreet_dead = 0;

    int sixthStreet_q2 = 0;

    int mainRoad_TALK1_TRUE = 0;
    int mainRoad_POLICE_TRUE = 0;
    int turnonPack = 0;

    int z = 2;
    int c;

    String currentLocation = "Main Road";

    Font titleFONT = new Font("CHILLER", Font.BOLD, 350);
    Font titleFONT1 = new Font("CHILLER", Font.BOLD, 200);
    Font titleFONT00 = new Font("IMPACT", Font.BOLD, 170);
    Font titleFONT2 = new Font("IMPACT", Font.BOLD, 80);
    Font titleFONT3 = new Font("IMPACT", Font.BOLD, 50);

    Font normalFONT = new Font("Impact", Font.PLAIN, 60);
    Font storyFONT = new Font("Impact", Font.PLAIN, 40);
    Font locationFONT = new Font("Impact", Font.BOLD, 28);
    Font locationFONT2 = new Font("Impact", Font.BOLD, 23);
    Font locationFONT3 = new Font("Impact", Font.BOLD, 19);
    Font locationFONT4 = new Font("Impact", Font.BOLD, 15);
    Font locationFONT5 = new Font("Impact", Font.BOLD, 12);
    Font livesFONT = new Font("Impact", Font.BOLD, 15);
    Font currentLocationFONT = new Font("Impact", Font.PLAIN, 15);
    

    private MyList<String> BACKPACK = new MyList<String>();
    private MyQueue<String> LIVES = new MyQueue<String>();

    int lives_TRUE = 0;

    public void init() {

        this.setSize(1400, 750);
        GImage mainMenu_BG = new GImage("mainMenu_BG.jpg");
        mainMenu_BG.setSize(1400, 750);
        add(mainMenu_BG);
    }

    
    public void ifDONE()
    {
          if(check1 == 1)
          {
              
              checkk1 = 2;
              check1 = 0;
             
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
          
          if(check2 == 1)
          {
               checkk2 = 2;
           check2 = 0;
              println(ok);
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
          
          if(check3 == 1)
          {
               checkk3 = 2;
               check3 = 0;
              println(ok);
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
          
          if(check4 == 1)
          {
               checkk4 = 2;
               check4 = 0;
              println(ok);
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
          
          if(check5 == 1)
          {
               checkk5 = 2;
               check5 = 0;
              println(ok);
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
          
          if(check6 == 1)
          {
               checkk6 = 2;
               check6 = 0;
              println(ok);
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
          
          if(check7 == 1)
          {
               checkk7 = 2;
               check7 = 0;
              println(ok);
              ok = ok + 1;
               println("OK VALUE = " + ok);
          }
    
          if(ok == 7)
          {
              removeAll();
              DijksrasAlgoritm_METHOD();
          }
        
        
    }
    
    public void lives_METHOD() {
        if (LIVES.isEmpty()) {
            LIVES.add("ff");
            LIVES.add("ff");
            LIVES.add("ff");
            LIVES.add("ff");

        }
        if (locationLabel_TRUE == 1) {
            for (int i = 1; i < LIVES.size() + 1; i++) {
               
                GImage lives_LABEL = new GImage("Lives.png");

                lives_LABEL.setSize(40, 40);
                lives_LABEL.setLocation(1357 - (42 * i), 10);
                add(lives_LABEL);
            }

            if (lives_TRUE == 1) {
                LIVES.add("ff");
                lives_TRUE = 0;
            }

            if (lives_TRUE == 2) {

                if (LIVES.size() == 2) {
                    gameOver_TRUE = 1;
                    gameOver_METHOD();
                }

                LIVES.deque();
                LIVES.deque();
                lives_TRUE = 0;

            }

        }
    }

    public void gameOver_METHOD() {
        removeAll();
        this.setBackground(Color.black);
        GLabel STARTGAME_BUTTON4 = new GLabel("GAME OVER");
        STARTGAME_BUTTON4.setColor(Color.RED);
        STARTGAME_BUTTON4.setLocation(250, 420);
        STARTGAME_BUTTON4.setFont(titleFONT1);
        add(STARTGAME_BUTTON4);

        GLabel STARTGAME_BUTTON22 = new GLabel("YOU DIED");
        STARTGAME_BUTTON22.setColor(Color.RED);
        STARTGAME_BUTTON22.setLocation(1150, 680);
        STARTGAME_BUTTON22.setFont(titleFONT3);
        add(STARTGAME_BUTTON22);

    }

    public void winner_METHOD() {
        removeAll();
        this.setBackground(Color.BLACK);
        GImage Winner = new GImage("winnerBG.png");
        Winner.setSize(1400, 750);
        add(Winner);
        GLabel STARTGAME_BUTTON45 = new GLabel("CASE CLOSED");
        STARTGAME_BUTTON45.setColor(Color.RED);
        STARTGAME_BUTTON45.setLocation(210, 420);
        STARTGAME_BUTTON45.setFont(titleFONT00);
        add(STARTGAME_BUTTON45);
    }

    public void run() {

        LIVES.create();
        BACKPACK.createList();

        addToPack();
        displayPack();

        startMenuButtons();

    }

    public void startBREAKOUT() {
        JFrame breakoutwindow = new JFrame("BREAKOUT GAME");
        BreakOutESPIRITU B = new BreakOutESPIRITU();
        breakoutwindow.setSize(400, 600);
        breakoutwindow.setVisible(true);
        breakoutwindow.add(B);
        B.addMouseListeners();
        B.start();
    }

    public void startCALCULATOR() {
        JFrame calculatorwindow = new JFrame("CALCULATOR APP");
        CalcuESPIRITU C = new CalcuESPIRITU();
        calculatorwindow.setSize(315, 465);
        calculatorwindow.setVisible(true);
        C.init();
        calculatorwindow.add(C);
        C.addMouseListeners();
        C.start();

    }

    public void currentLocation_METHOD() {
        if (locationLabel_TRUE == 1) {
            GLabel currentLocation_LABEL = new GLabel("Location: ");
            currentLocation_LABEL.setColor(Color.BLACK);
            currentLocation_LABEL.setLocation(1190, 70);
            currentLocation_LABEL.setFont(locationFONT3);
            add(currentLocation_LABEL);

            GLabel currentLocation_LABEL2 = new GLabel(currentLocation);
            currentLocation_LABEL2.setColor(Color.ORANGE);
            currentLocation_LABEL2.setLocation(1280, 70);
            currentLocation_LABEL2.setFont(locationFONT4);
            add(currentLocation_LABEL2);
        }

    }

    public void currentMap_METHOD() {

        GImage currentMap = new GImage("Map.png");
        {
            if (locationLabel_TRUE == 1) {

                currentMap.setSize(200, 200);
                currentMap.setLocation(0, 0);
                add(currentMap);

                GLabel goTo = new GLabel("TRAVEL TO:");
                goTo.setFont(locationFONT3);
                goTo.setLocation(35, 225);
                add(goTo);

                if (seventhStreet_TALK1_TRUE != 0) {
                    
                    if( checkk7 != 2)
                    {
                        check7 = 1;
                    }
                    
                    
                    GLabel c7 = new GLabel("/");
                    c7.setLocation(78, 35);
                    c7.setColor(Color.RED);
                    c7.setFont(locationFONT);
                    add(c7);

                }

                if (mainRoad_TALK1_TRUE != 0) {
                    if( checkk1 != 2)
                    {
                        check1 = 1;
                    }
                    
                  
                    GLabel c1 = new GLabel("/");
                    c1.setLocation(88, 173);
                    c1.setColor(Color.RED);
                    c1.setFont(locationFONT);
                    add(c1);

                }

                if (secondStreet_TALK1_TRUE != 0) {
                    if( checkk2 != 2)
                    {
                        check2 = 1;
                    }
                    
                    GLabel c2 = new GLabel("/");
                    c2.setLocation(150, 155);
                    c2.setColor(Color.RED);
                    c2.setFont(locationFONT);
                    add(c2);

                }

                if (thirdStreet_TALK1_TRUE != 0) {
                    if( checkk3 != 2)
                    {
                        check3 = 1;
                    }
                    
                    GLabel c3 = new GLabel("/");
                    c3.setLocation(35, 125);
                    c3.setColor(Color.RED);
                    c3.setFont(locationFONT);
                    add(c3);

                }

                if (fourthStreet_TALK1_TRUE != 0) {
                   if( checkk4 != 2)
                    {
                        check4 = 1;
                    }
                    
                    GLabel c4 = new GLabel("/");
                    c4.setLocation(145, 110);
                    c4.setColor(Color.RED);
                    c4.setFont(locationFONT);
                    add(c4);

                }

                if (fifthStreet_TALK1_TRUE != 0) {
                    if( checkk5 != 2)
                    {
                        check5 = 1;
                    }
                    
                    GLabel c5 = new GLabel("/");
                    c5.setLocation(90, 95);
                    c5.setColor(Color.RED);
                    c5.setFont(locationFONT);
                    add(c5);

                }

                if (sixthStreet_TALK1_TRUE != 0) {
                    if( checkk6 != 2)
                    {
                        check6 = 1;
                    }
                    
                    GLabel c6 = new GLabel("/");
                    c6.setLocation(47, 65);
                    c6.setColor(Color.RED);
                    c6.setFont(locationFONT);
                    add(c6);

                }

            }
        }
    }

    public void startMenuButtons() {

        GLabel STARTGAME_BUTTON = new GLabel("DEATH");
        STARTGAME_BUTTON.setColor(Color.RED);
        STARTGAME_BUTTON.setLocation(250, 450);
        STARTGAME_BUTTON.setFont(titleFONT);
        add(STARTGAME_BUTTON);

        GLabel STARTGAME_BUTTON2 = new GLabel("AT DATASAL");
        STARTGAME_BUTTON2.setColor(Color.BLACK);
        STARTGAME_BUTTON2.setLocation(700, 470);
        STARTGAME_BUTTON2.setFont(titleFONT2);
        add(STARTGAME_BUTTON2);

        GLabel QUITGAME_BUTTON = new GLabel("QUIT");
        QUITGAME_BUTTON.setColor(Color.RED);
        QUITGAME_BUTTON.setLocation(1250, 680);
        QUITGAME_BUTTON.setFont(normalFONT);
        add(QUITGAME_BUTTON);
        

        STARTGAME_BUTTON.addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                STARTGAME_BUTTON.setColor(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                STARTGAME_BUTTON.setColor(Color.RED);
                if (storyLine1_TRUE == 0) {
                    removeAll();
                    GImage storyLine1BG = new GImage("story1.jpg");
                    storyLine1BG.setSize(1400, 750);
                    add(storyLine1BG);
                    storyLine1_TRUE = 1;
                    locationLabel_TRUE = 1;
                }

                removeAll();
                turnonPack = 1;
                brickGame_TRUE = 1;
                mainRoad_METHOD();
            }

        });

        QUITGAME_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                gameOver_METHOD();
            }

        });

    }

    public void useButtons() {

        GLabel playBrickGame = new GLabel("Use");
        GLabel calculatorApp = new GLabel("Use");
        GLabel casefileButton = new GLabel("Use");
        playBrickGame.setColor(Color.RED);
        playBrickGame.setLocation(1193, 107);
        playBrickGame.setFont(locationFONT4);

        calculatorApp.setColor(Color.RED);
        calculatorApp.setLocation(1193, 129);
        calculatorApp.setFont(locationFONT4);
        add(playBrickGame);
        add(calculatorApp);

        if (casefile_pulot == 1) {
            casefileButton.setColor(Color.RED);
            casefileButton.setLocation(1193, 146);
            casefileButton.setFont(locationFONT4);
            add(casefileButton);

        }

        playBrickGame.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                startBREAKOUT();
            }

        });

        casefileButton.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                GImage casefile = new GImage("Case_File.png");
                casefile.setLocation(300, -10);
                casefile.setSize(700, 700);
                add(casefile);

                casefile.addMouseListener(new MouseAdapter() {

                    public void mousePressed(MouseEvent e) {
                        remove(casefile);

                        display_casefile = 0;
                    }

                });

            }

        });

        calculatorApp.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                startCALCULATOR();

            }

        });

        if (brickGame_TRUE == 1) {

            calculatorApp.setColor(Color.RED);
            playBrickGame.setLocation(1193, 113);
            playBrickGame.setFont(locationFONT4);
            add(playBrickGame);
        }

    }

    public void displayPack() {

        currentLocation_METHOD();
        currentMap_METHOD();

        lives_METHOD();
      
        
        
        
        if (turnonPack == 1) {

            for (int i = 1; i <= BACKPACK.size(); i++) {
                GLabel packTitle = new GLabel("Backpack");
                packTitle.setFont(locationFONT3);
                packTitle.setColor(Color.BLACK);
                add(packTitle, 1229, 94);
                useButtons();

                GLabel item = new GLabel(BACKPACK.get(i));
                item.setFont(locationFONT5);
                item.setColor(Color.ORANGE);
                add(item, 1223, 95 + (17 * i));
            }
        }
        
          ifDONE();
    }

    public void addToPack() {
        if (BACKPACK.isEmpty()) {
            BACKPACK.add(1, "BrickGame Device");
            BACKPACK.add(2, "Calculator");
        }
        if (addToPack_TRUE == 1) {

        }

    }

    public void mainRoad_METHOD() {
        
        ifDONE();

        currentLocation = "Main Road";

        GImage mainRoad_BG = new GImage("street.jpg");
        mainRoad_BG.setSize(1400, 750);
        add(mainRoad_BG);

        if (mainRoad_POLICE_TRUE == 0) {
            GImage mainRoad_police = new GImage("Police-01.png");
            mainRoad_police.setLocation(375, 100);
            mainRoad_police.setSize(600, 600);
            add(mainRoad_police);

        }

        GImage mainRoad_talk1 = new GImage("police_talk1.png");
        mainRoad_talk1.setLocation(270, 455);
        mainRoad_talk1.setSize(800, 210);

        GLabel fourthStreet_BUTTON = new GLabel("4th Street.");
        fourthStreet_BUTTON.setColor(Color.ORANGE);
        fourthStreet_BUTTON.setLocation(42, 320);
        fourthStreet_BUTTON.setFont(locationFONT3);
        add(fourthStreet_BUTTON);

        GLabel secondStreet_BUTTON = new GLabel("2nd Street.");
        secondStreet_BUTTON.setColor(Color.ORANGE);
        secondStreet_BUTTON.setLocation(42, 290);
        secondStreet_BUTTON.setFont(locationFONT3);
        add(secondStreet_BUTTON);

        GLabel thirdStreet_BUTTON = new GLabel("3rd Street");
        thirdStreet_BUTTON.setColor(Color.ORANGE);
        thirdStreet_BUTTON.setLocation(42, 260);
        thirdStreet_BUTTON.setFont(locationFONT3);
        add(thirdStreet_BUTTON);

        displayPack();

        if (mainRoad_TALK1_TRUE == 0) {
            add(mainRoad_talk1);
            mainRoad_talk1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    GImage mainRoad_talk2 = new GImage("police_talk2.png");
                    mainRoad_talk2.setLocation(270, 455);
                    mainRoad_talk2.setSize(800, 210);
                    add(mainRoad_talk2);

                    mainRoad_talk2.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            mainRoad_talk1.setVisible(false);
                            mainRoad_talk2.setVisible(false);
                            GImage mainRoad_casefile = new GImage("Case_File.png");
                            mainRoad_casefile.setLocation(300, -10);
                            mainRoad_casefile.setSize(700, 700);
                            add(mainRoad_casefile);
                            casefile_pulot = 1;
                            BACKPACK.add(3, "CP12 Case File");
                            displayPack();

                            mainRoad_casefile.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {
                                    mainRoad_casefile.setVisible(false);
                                    GImage mainRoad_alibis = new GImage("alibis.png");
                                    mainRoad_alibis.setLocation(300, -10);
                                    mainRoad_alibis.setSize(700, 700);
                                    add(mainRoad_alibis);

                                    mainRoad_alibis.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {
                                            removeAll();
                                            mainRoad_TALK1_TRUE = 1;
                                            mainRoad_POLICE_TRUE = 1;
                                            mainRoad_METHOD();

                                        }
                                    });

                                }
                            });

                        }
                    });

                }

            });
        }

        secondStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();

                secondStreet_METHOD();

            }

        });

        secondStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();

                secondStreet_METHOD();

            }

        });

        fourthStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                fourthStreet_BUTTON.setColor(Color.ORANGE);
                removeAll();
                fourthStreet_METHOD();

            }

        });

        thirdStreet_BUTTON.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                thirdStreet_METHOD();

            }

        });

    }

    public void secondStreet_METHOD() {
        ifDONE();
        currentLocation = "2th Street";

        GImage secondStreet_BG = new GImage("Hospital.jpg");
        secondStreet_BG.setSize(1400, 750);
        add(secondStreet_BG);

        GImage secondStreet_CHAR = new GImage("Doctor-01.png");
        secondStreet_CHAR.setLocation(375, 100);
        secondStreet_CHAR.setSize(600, 600);
        add(secondStreet_CHAR);

        GLabel secondStreet_BACKTO_mainRoad = new GLabel("Main Road");
        secondStreet_BACKTO_mainRoad.setColor(Color.ORANGE);
        secondStreet_BACKTO_mainRoad.setLocation(42, 260);
        secondStreet_BACKTO_mainRoad.setFont(locationFONT3);
        add(secondStreet_BACKTO_mainRoad);

        GLabel secondStreet_BACKTO_thirdStreet = new GLabel("3rd St.");
        secondStreet_BACKTO_thirdStreet.setColor(Color.ORANGE);
        secondStreet_BACKTO_thirdStreet.setLocation(42, 290);
        secondStreet_BACKTO_thirdStreet.setFont(locationFONT3);
        add(secondStreet_BACKTO_thirdStreet);

        if (secondStreet_TALK1_TRUE != 0) {
            GImage secondStreet_talk10 = new GImage("doctor_nothing.png");
            secondStreet_talk10.setLocation(270, 455);
            secondStreet_talk10.setSize(800, 210);
            add(secondStreet_talk10);
        } else {
            GImage secondStreet_talk1 = new GImage("me1.png");
            secondStreet_talk1.setLocation(270, 455);
            secondStreet_talk1.setSize(800, 210);
            add(secondStreet_talk1);

            secondStreet_talk1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    secondStreet_talk1.setVisible(false);
                    GImage secondStreet_talk2 = new GImage("doctor1.png");
                    secondStreet_talk2.setLocation(270, 455);
                    secondStreet_talk2.setSize(800, 210);
                    add(secondStreet_talk2);

                    secondStreet_talk2.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            secondStreet_talk2.setVisible(false);
                            GImage secondStreet_talk3 = new GImage("me2.png");
                            secondStreet_talk3.setLocation(270, 455);
                            secondStreet_talk3.setSize(800, 210);
                            add(secondStreet_talk3);

                            secondStreet_talk3.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {

                                    secondStreet_talk3.setVisible(false);
                                    GImage secondStreet_talk4 = new GImage("doctor2.png");
                                    secondStreet_talk4.setLocation(270, 455);
                                    secondStreet_talk4.setSize(800, 210);
                                    add(secondStreet_talk4);

                                    secondStreet_talk4.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {

                                            secondStreet_talk4.setVisible(false);
                                            GImage secondStreet_talk5 = new GImage("me5.png");
                                            secondStreet_talk5.setLocation(270, 455);
                                            secondStreet_talk5.setSize(800, 210);
                                            add(secondStreet_talk5);

                                            secondStreet_talk5.addMouseListener(new MouseAdapter() {

                                                public void mousePressed(MouseEvent e) {

                                                    secondStreet_talk5.setVisible(false);
                                                    secondStreet_CHAR.setVisible(false);

                                                    GImage secondStreet_smallclue = new GImage("pills.png");
                                                    secondStreet_smallclue.setLocation(170, 520);
                                                    secondStreet_smallclue.setSize(30, 50);
                                                    add(secondStreet_smallclue);

                                                    secondStreet_smallclue.addMouseListener(new MouseAdapter() {

                                                        public void mousePressed(MouseEvent e) {

                                                            secondStreet_smallclue.setVisible(false);

                                                            GImage secondStreet_MAINclue = new GImage("pills.png");
                                                            secondStreet_MAINclue.setLocation(550, 100);
                                                            secondStreet_MAINclue.setSize(250, 450);
                                                            add(secondStreet_MAINclue);

                                                            secondStreet_MAINclue.addMouseListener(new MouseAdapter() {

                                                                public void mousePressed(MouseEvent e) {

                                                                    secondStreet_MAINclue.setVisible(false);
                                                                    secondStreet_CHAR.setVisible(true);
                                                                    secondStreet_MAINclue.sendToBack();

                                                                    GImage secondStreet_talk6 = new GImage("doctor3.png");
                                                                    secondStreet_talk6.setLocation(270, 455);
                                                                    secondStreet_talk6.setSize(800, 210);
                                                                    add(secondStreet_talk6);

                                                                    secondStreet_talk6.addMouseListener(new MouseAdapter() {

                                                                        public void mousePressed(MouseEvent e) {

                                                                            secondStreet_talk6.setVisible(false);

                                                                            GImage secondStreet_talk7 = new GImage("me4.png");
                                                                            secondStreet_talk7.setLocation(270, 455);
                                                                            secondStreet_talk7.setSize(800, 210);
                                                                            add(secondStreet_talk7);

                                                                            secondStreet_talk7.addMouseListener(new MouseAdapter() {

                                                                                public void mousePressed(MouseEvent e) {

                                                                                    secondStreet_talk7.setVisible(false);

                                                                                    GImage secondStreet_talk8 = new GImage("doctor4.png");
                                                                                    secondStreet_talk8.setLocation(270, 455);
                                                                                    secondStreet_talk8.setSize(800, 210);
                                                                                    add(secondStreet_talk8);

                                                                                    secondStreet_talk8.addMouseListener(new MouseAdapter() {

                                                                                        public void mousePressed(MouseEvent e) {

                                                                                            secondStreet_talk8.setVisible(false);

                                                                                            GImage secondStreet_talk9 = new GImage("doctor5.png");
                                                                                            secondStreet_talk9.setLocation(270, 455);
                                                                                            secondStreet_talk9.setSize(800, 210);
                                                                                            add(secondStreet_talk9);

                                                                                            secondStreet_talk9.addMouseListener(new MouseAdapter() {
                                                                                                public void mousePressed(MouseEvent e) {

                                                                                                    secondStreet_talk9.setVisible(false);

                                                                                                    GImage secondStreet_talk10 = new GImage("doctor_nothing.png");
                                                                                                    secondStreet_talk10.setLocation(270, 455);
                                                                                                    secondStreet_talk10.setSize(800, 210);
                                                                                                    add(secondStreet_talk10);

                                                                                                    secondStreet_TALK1_TRUE = 1;

                                                                                                }
                                                                                            });

                                                                                        }
                                                                                    });

                                                                                }
                                                                            });

                                                                        }
                                                                    });

                                                                }
                                                            });

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }
            });

        }

        displayPack();

        secondStreet_BACKTO_thirdStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                secondStreet_BACKTO_thirdStreet.setColor(Color.ORANGE);
                removeAll();
                displayPack();
                thirdStreet_METHOD();

            }

        });

        secondStreet_BACKTO_mainRoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                secondStreet_BACKTO_mainRoad.setColor(Color.WHITE);
                secondStreet_BACKTO_mainRoad.setColor(Color.ORANGE);
                removeAll();
                displayPack();
                mainRoad_METHOD();
            }

        });

    }

    public void thirdStreet_METHOD() {
        ifDONE();
        currentLocation = "3rd Street";

        GImage thirdStreet_BG = new GImage("restaurant.png");
        thirdStreet_BG.setSize(1400, 750);
        add(thirdStreet_BG);

        GLabel thirdStreet_BACKTO_firstStreet = new GLabel("Main Road");
        thirdStreet_BACKTO_firstStreet.setColor(Color.ORANGE);
        thirdStreet_BACKTO_firstStreet.setLocation(42, 260);
        thirdStreet_BACKTO_firstStreet.setFont(locationFONT3);
        add(thirdStreet_BACKTO_firstStreet);

        GLabel thirdStreet_BACKTO_secondStreet = new GLabel("2nd Street");
        thirdStreet_BACKTO_secondStreet.setColor(Color.ORANGE);
        thirdStreet_BACKTO_secondStreet.setLocation(42, 290);
        thirdStreet_BACKTO_secondStreet.setFont(locationFONT3);
        add(thirdStreet_BACKTO_secondStreet);

        GLabel thirdStreet_BACKTO_sixthStreet = new GLabel("6th Street");
        thirdStreet_BACKTO_sixthStreet.setColor(Color.ORANGE);
        thirdStreet_BACKTO_sixthStreet.setLocation(42, 350);
        thirdStreet_BACKTO_sixthStreet.setFont(locationFONT3);
        add(thirdStreet_BACKTO_sixthStreet);

        GLabel thirdStreet_BACKTO_fifthStreet = new GLabel("5th Street");
        thirdStreet_BACKTO_fifthStreet.setColor(Color.ORANGE);
        thirdStreet_BACKTO_fifthStreet.setLocation(42, 320);
        thirdStreet_BACKTO_fifthStreet.setFont(locationFONT3);
        add(thirdStreet_BACKTO_fifthStreet);
        displayPack();

        if (thirdStreet_q1 == 0) {

            GImage question1 = new GImage("q1.png");
            question1.setLocation(375, 100);
            question1.setSize(600, 600);
            add(question1);

            GLabel q1a = new GLabel("Choose A");
            q1a.setLocation(850, 300);
            q1a.setColor(Color.RED);
            q1a.setFont(locationFONT);
            add(q1a);

            GLabel q1b = new GLabel("Choose B");
            q1b.setLocation(850, 330);
            q1b.setColor(Color.RED);
            q1b.setFont(locationFONT);
            add(q1b);

            GLabel q1c = new GLabel("Choose C");
            q1c.setLocation(850, 360);
            q1c.setColor(Color.RED);
            q1c.setFont(locationFONT);
            add(q1c);

            GLabel q1d = new GLabel("Choose D");
            q1d.setLocation(850, 390);
            q1d.setColor(Color.RED);
            q1d.setFont(locationFONT);
            add(q1d);

            q1a.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {

                    thirdStreet_q1 = 1;
                    lives_TRUE = 2;
                    lives_METHOD();
                    removeAll();
                    thirdStreet_METHOD();

                }
            });

            q1b.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    q1b.setVisible(false);
                    GImage q1b = new GImage("nothing.png");
                    q1b.setLocation(270, 455);
                    q1b.setSize(800, 210);
                    add(q1b);
                    thirdStreet_q1 = 1;
                    lives_TRUE = 2;
                    lives_METHOD();
                    removeAll();
                    thirdStreet_METHOD();

                }
            });

            q1c.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    q1c.setVisible(false);
                    GImage q1c = new GImage("nothing.png");
                    q1c.setLocation(270, 455);
                    q1c.setSize(800, 210);
                    add(q1c);
                    thirdStreet_q1 = 1;

                    removeAll();
                    thirdStreet_METHOD();

                }
            });

            q1d.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    q1d.setVisible(false);
                    GImage q1d = new GImage("nothing.png");
                    q1d.setLocation(270, 455);
                    q1d.setSize(800, 210);
                    add(q1d);
                    thirdStreet_q1 = 1;
                    lives_TRUE = 2;
                    lives_METHOD();
                    removeAll();
                    thirdStreet_METHOD();

                }
            });

        }

        if (thirdStreet_q1 != 0) {

            GImage thirdStreet_CHAR = new GImage("Baker-01.png");
            thirdStreet_CHAR.setLocation(375, 100);
            thirdStreet_CHAR.setSize(600, 600);
            add(thirdStreet_CHAR);

            if (thirdStreet_TALK1_TRUE != 0) {
                GImage thirdStreet_talk10 = new GImage("nothing.png");
                thirdStreet_talk10.setLocation(270, 455);
                thirdStreet_talk10.setSize(800, 210);
                add(thirdStreet_talk10);
            } else {
                GImage thirdStreet_talk1 = new GImage("choice1.png");
                thirdStreet_talk1.setLocation(270, 455);
                thirdStreet_talk1.setSize(800, 210);
                add(thirdStreet_talk1);

                thirdStreet_talk1.addMouseListener(new MouseAdapter() {

                    public void mousePressed(MouseEvent e) {
                        thirdStreet_talk1.setVisible(false);
                        GImage thirdStreet_talk2 = new GImage("speech1.png");
                        thirdStreet_talk2.setLocation(270, 455);
                        thirdStreet_talk2.setSize(800, 210);
                        add(thirdStreet_talk2);

                        thirdStreet_talk2.addMouseListener(new MouseAdapter() {

                            public void mousePressed(MouseEvent e) {
                                thirdStreet_talk2.setVisible(false);
                                GImage thirdStreet_talk3 = new GImage("choice3.png");
                                thirdStreet_talk3.setLocation(270, 455);
                                thirdStreet_talk3.setSize(800, 210);
                                add(thirdStreet_talk3);

                                thirdStreet_talk3.addMouseListener(new MouseAdapter() {

                                    public void mousePressed(MouseEvent e) {

                                        thirdStreet_talk3.setVisible(false);
                                        GImage thirdStreet_talk4 = new GImage("speech2.png");
                                        thirdStreet_talk4.setLocation(270, 455);
                                        thirdStreet_talk4.setSize(800, 210);
                                        add(thirdStreet_talk4);

                                        thirdStreet_talk4.addMouseListener(new MouseAdapter() {

                                            public void mousePressed(MouseEvent e) {

                                                thirdStreet_talk4.setVisible(false);
                                                thirdStreet_CHAR.setVisible(false);

                                                GImage thirdStreet_smallclue = new GImage("wine_note.png");
                                                thirdStreet_smallclue.setLocation(700, 420);
                                                thirdStreet_smallclue.setSize(120, 50);
                                                add(thirdStreet_smallclue);

                                                thirdStreet_smallclue.addMouseListener(new MouseAdapter() {

                                                    public void mousePressed(MouseEvent e) {

                                                        thirdStreet_smallclue.setVisible(false);
                                                        GImage thirdStreet_MAINclue = new GImage("wine_note.png");
                                                        thirdStreet_MAINclue.setLocation(380, 200);
                                                        thirdStreet_MAINclue.setSize(700, 250);
                                                        add(thirdStreet_MAINclue);

                                                        thirdStreet_MAINclue.addMouseListener(new MouseAdapter() {
                                                            public void mousePressed(MouseEvent e) {

                                                                thirdStreet_MAINclue.setVisible(false);
                                                                thirdStreet_MAINclue.sendToBack();
                                                                thirdStreet_CHAR.setVisible(true);
                                                                GImage thirdStreet_talk5 = new GImage("choice4.png");
                                                                thirdStreet_talk5.setLocation(270, 455);
                                                                thirdStreet_talk5.setSize(800, 210);
                                                                add(thirdStreet_talk5);

                                                                thirdStreet_talk5.addMouseListener(new MouseAdapter() {
                                                                    public void mousePressed(MouseEvent e) {
                                                                        thirdStreet_talk5.setVisible(false);
                                                                        GImage thirdStreet_talk6 = new GImage("speech3.png");
                                                                        thirdStreet_talk6.setLocation(270, 455);
                                                                        thirdStreet_talk6.setSize(800, 210);
                                                                        add(thirdStreet_talk6);

                                                                        thirdStreet_talk6.addMouseListener(new MouseAdapter() {
                                                                            public void mousePressed(MouseEvent e) {
                                                                                thirdStreet_talk6.setVisible(false);
                                                                                GImage thirdStreet_talk7 = new GImage("speech4.png");
                                                                                thirdStreet_talk7.setLocation(270, 455);
                                                                                thirdStreet_talk7.setSize(800, 210);
                                                                                add(thirdStreet_talk7);

                                                                                thirdStreet_talk7.addMouseListener(new MouseAdapter() {
                                                                                    public void mousePressed(MouseEvent e) {
                                                                                        thirdStreet_talk7.setVisible(false);
                                                                                        GImage thirdStreet_talk8 = new GImage("speech5.png");
                                                                                        thirdStreet_talk8.setLocation(270, 455);
                                                                                        thirdStreet_talk8.setSize(800, 210);
                                                                                        add(thirdStreet_talk8);

                                                                                        thirdStreet_talk8.addMouseListener(new MouseAdapter() {
                                                                                            public void mousePressed(MouseEvent e) {
                                                                                                thirdStreet_talk8.setVisible(false);
                                                                                                GImage thirdStreet_talk9 = new GImage("nothing.png");
                                                                                                thirdStreet_talk9.setLocation(270, 455);
                                                                                                thirdStreet_talk9.setSize(800, 210);
                                                                                                add(thirdStreet_talk9);
                                                                                                thirdStreet_TALK1_TRUE = 1;

                                                                                            }
                                                                                        });

                                                                                    }
                                                                                });

                                                                            }
                                                                        });

                                                                    }
                                                                });

                                                            }
                                                        });

                                                    }
                                                });

                                            }
                                        });

                                    }
                                });

                            }
                        });

                    }
                });

            }

            displayPack();

            thirdStreet_BACKTO_firstStreet.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    removeAll();
                    displayPack();
                    mainRoad_METHOD();
                }

            });

            thirdStreet_BACKTO_secondStreet.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    removeAll();
                    displayPack();
                    secondStreet_METHOD();
                }

            });
            thirdStreet_BACKTO_sixthStreet.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    removeAll();
                    displayPack();
                    sixthStreet_METHOD();
                }

            });

            thirdStreet_BACKTO_fifthStreet.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    removeAll();
                    displayPack();
                    fifthStreet_METHOD();
                }

            });

        }

    }

    public void fourthStreet_METHOD() {
        ifDONE();
        currentLocation = "4th Street";
        GImage fourthStreet_BG = new GImage("Station.jpg");
        fourthStreet_BG.setSize(1400, 750);
        add(fourthStreet_BG);

        GImage fourthStreet_CHAR = new GImage("Police-01.png");
        fourthStreet_CHAR.setLocation(375, 100);
        fourthStreet_CHAR.setSize(600, 600);
        add(fourthStreet_CHAR);

        GLabel fourthStreet_BACKTO_mainRoad = new GLabel("Main Road");
        fourthStreet_BACKTO_mainRoad.setColor(Color.ORANGE);
        fourthStreet_BACKTO_mainRoad.setLocation(42, 260);
        fourthStreet_BACKTO_mainRoad.setFont(locationFONT3);
        add(fourthStreet_BACKTO_mainRoad);

        GLabel fourthStreet_BACKTO_fifthStreet = new GLabel("5th Street");
        fourthStreet_BACKTO_fifthStreet.setColor(Color.ORANGE);
        fourthStreet_BACKTO_fifthStreet.setLocation(42, 290);
        fourthStreet_BACKTO_fifthStreet.setFont(locationFONT3);
        add(fourthStreet_BACKTO_fifthStreet);

        GLabel fourthStreet_BACKTO_seventhStreet = new GLabel("7th Street");
        fourthStreet_BACKTO_seventhStreet.setColor(Color.ORANGE);
        fourthStreet_BACKTO_seventhStreet.setLocation(42, 320);
        fourthStreet_BACKTO_seventhStreet.setFont(locationFONT3);
        add(fourthStreet_BACKTO_seventhStreet);
        
         if (fourthStreet_TALK1_TRUE != 0) {
            GImage secondStreet_talk10 = new GImage("police_nothing.png");
            secondStreet_talk10.setLocation(270, 455);
            secondStreet_talk10.setSize(800, 210);
            add(secondStreet_talk10);
        } else {
             
             GImage fourthStreet_talk = new GImage("ask1.png");
             fourthStreet_talk.setLocation(270, 455);
            fourthStreet_talk.setSize(800, 210);
            add(fourthStreet_talk);
             
            fourthStreet_talk.addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                    fourthStreet_talk.setVisible(false);
                    GImage fourthStreet_talk1 = new GImage("police_talk3.png");
                    fourthStreet_talk1.setLocation(270, 455);
                    fourthStreet_talk1.setSize(800, 210);
                    add(fourthStreet_talk1);

                    fourthStreet_talk1.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            fourthStreet_talk1.setVisible(false);
                            GImage fourthStreet_talk2 = new GImage("ask2.png");
                            fourthStreet_talk2.setLocation(270, 455);
                            fourthStreet_talk2.setSize(800, 210);
                            add(fourthStreet_talk2);

                            fourthStreet_talk2.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {
                                    fourthStreet_talk2.setVisible(false);
                                    GImage fourthStreet_talk3 = new GImage("police_talk4.png");
                                    fourthStreet_talk3.setLocation(270, 455);
                                    fourthStreet_talk3.setSize(800, 210);
                                    add(fourthStreet_talk3);

                                    fourthStreet_talk3.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {

                                            fourthStreet_talk3.setVisible(false);
                                            GImage fourthStreet_talk4 = new GImage("ask3.png");
                                            fourthStreet_talk4.setLocation(270, 455);
                                            fourthStreet_talk4.setSize(800, 210);
                                            add(fourthStreet_talk4);

                                            fourthStreet_talk4.addMouseListener(new MouseAdapter() {

                                                public void mousePressed(MouseEvent e) {

                                                    fourthStreet_talk4.setVisible(false);
                                                    GImage fourthStreet_talk5 = new GImage("police_talk5.png");
                                                    fourthStreet_talk5.setLocation(270, 455);
                                                    fourthStreet_talk5.setSize(800, 210);
                                                    add(fourthStreet_talk5);

                                                    fourthStreet_talk5.addMouseListener(new MouseAdapter() {

                                                        public void mousePressed(MouseEvent e) {

                                                            fourthStreet_talk5.setVisible(false);
                                                            GImage fourthStreet_talk6 = new GImage("police_talk6.png");
                                                            fourthStreet_talk6.setLocation(270, 455);
                                                            fourthStreet_talk6.setSize(800, 210);
                                                            add(fourthStreet_talk6);

                                                            fourthStreet_talk6.addMouseListener(new MouseAdapter() {

                                                                public void mousePressed(MouseEvent e) {
                                                                        GImage fourthStreet_talk10 = new GImage("police_nothing.png");
                                                                        fourthStreet_talk10.setLocation(270, 455);
                                                                        fourthStreet_talk10.setSize(800, 210);
                                                                        add(fourthStreet_talk10);

                                                                        fourthStreet_TALK1_TRUE = 1;
                                                                }
                                                            });

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });
                    
                }
                }
              );
            
           
        }

        displayPack();



        fourthStreet_BACKTO_mainRoad.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                mainRoad_METHOD();
            }

        });

        fourthStreet_BACKTO_fifthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                fifthStreet_METHOD();
            }

        });

        fourthStreet_BACKTO_seventhStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                seventhStreet_METHOD();
            }

        });

    }

    public void fifthStreet_METHOD() {
        ifDONE();
        currentLocation = "5th Street";
        GImage fifthStreet_BG = new GImage("CrimeScene.jpg");
        fifthStreet_BG.setSize(1400, 750);
        add(fifthStreet_BG);

        GLabel fifthStreet_BACKTO_secondStreet = new GLabel("2nd Street");
        fifthStreet_BACKTO_secondStreet.setColor(Color.ORANGE);
        fifthStreet_BACKTO_secondStreet.setLocation(42, 260);
        fifthStreet_BACKTO_secondStreet.setFont(locationFONT3);
        add(fifthStreet_BACKTO_secondStreet);

        GLabel fifthStreet_BACKTO_thirdStreet = new GLabel("3rd Street");
        fifthStreet_BACKTO_thirdStreet.setColor(Color.ORANGE);
        fifthStreet_BACKTO_thirdStreet.setLocation(42, 290);
        fifthStreet_BACKTO_thirdStreet.setFont(locationFONT3);
        add(fifthStreet_BACKTO_thirdStreet);

        GLabel fifthStreet_BACKTO_fourthStreet = new GLabel("4th Street");
        fifthStreet_BACKTO_fourthStreet.setColor(Color.ORANGE);
        fifthStreet_BACKTO_fourthStreet.setLocation(42, 320);
        fifthStreet_BACKTO_fourthStreet.setFont(locationFONT3);
        add(fifthStreet_BACKTO_fourthStreet);

        GLabel fifthStreet_BACKTO_seventhStreet = new GLabel("7th Street");
        fifthStreet_BACKTO_seventhStreet.setColor(Color.ORANGE);
        fifthStreet_BACKTO_seventhStreet.setLocation(42, 350);
        fifthStreet_BACKTO_seventhStreet.setFont(locationFONT3);
        add(fifthStreet_BACKTO_seventhStreet);

        displayPack();
        fifthStreet_TALK1_TRUE = 1;

        fifthStreet_BACKTO_secondStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                secondStreet_METHOD();
            }

        });

        fifthStreet_BACKTO_thirdStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                thirdStreet_METHOD();
            }

        });

        fifthStreet_BACKTO_fourthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                fourthStreet_METHOD();
            }

        });

        fifthStreet_BACKTO_seventhStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                seventhStreet_METHOD();
            }

        });

    }

    public void sixthStreet_METHOD() {
        ifDONE();

        currentLocation = "6th Street";
        GImage sixthStreet_BG = new GImage("Site.jpg");
        sixthStreet_BG.setSize(1400, 750);
        add(sixthStreet_BG);

        GLabel sixthStreet_BACKTO_thirdStreet = new GLabel("3rd Street");
        sixthStreet_BACKTO_thirdStreet.setColor(Color.ORANGE);
        sixthStreet_BACKTO_thirdStreet.setLocation(42, 260);
        sixthStreet_BACKTO_thirdStreet.setFont(locationFONT3);
        add(sixthStreet_BACKTO_thirdStreet);

        GLabel sixthStreet_BACKTO_seventhStreet = new GLabel("7th Street");
        sixthStreet_BACKTO_seventhStreet.setColor(Color.ORANGE);
        sixthStreet_BACKTO_seventhStreet.setLocation(42, 290);
        sixthStreet_BACKTO_seventhStreet.setFont(locationFONT3);
        add(sixthStreet_BACKTO_seventhStreet);

        displayPack();

        if (sixthStreet_q2 == 0) {

            GImage question2 = new GImage("q2.png");
            question2.setLocation(375, 100);
            question2.setSize(560, 600);
            add(question2);

            GLabel q2a = new GLabel("Choose A");
            q2a.setLocation(850, 300);
            q2a.setColor(Color.RED);
            q2a.setFont(locationFONT);
            add(q2a);

            GLabel q2b = new GLabel("Choose B");
            q2b.setLocation(850, 330);
            q2b.setColor(Color.RED);
            q2b.setFont(locationFONT);
            add(q2b);

            GLabel q2c = new GLabel("Choose C");
            q2c.setLocation(850, 360);
            q2c.setColor(Color.RED);
            q2c.setFont(locationFONT);
            add(q2c);

            GLabel q2d = new GLabel("Choose D");
            q2d.setLocation(850, 390);
            q2d.setColor(Color.RED);
            q2d.setFont(locationFONT);
            add(q2d);

            q2a.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {

                    sixthStreet_q2 = 1;
                    lives_TRUE = 2;
                    lives_METHOD();
                    removeAll();
                    sixthStreet_dead = 1;
                    sixthStreet_METHOD();

                }
            });

            q2b.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {

                    sixthStreet_q2 = 1;
                    lives_TRUE = 2;
                    lives_METHOD();
                    sixthStreet_dead = 1;
                    removeAll();
                    sixthStreet_METHOD();

                }
            });

            q2c.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {

                    sixthStreet_q2 = 1;

                    removeAll();
                    sixthStreet_METHOD();

                }
            });

            q2d.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {

                    sixthStreet_q2 = 1;
                    lives_TRUE = 2;
                    lives_METHOD();
                    sixthStreet_dead = 1;
                    removeAll();
                    sixthStreet_METHOD();

                }
            });

        }

        if (sixthStreet_q2 != 0) {
            if (sixthStreet_dead == 1) {

                gameOver_METHOD();
            } else {

                GImage sixthStreet_CHAR = new GImage("Construction-01.png");
                sixthStreet_CHAR.setSize(600, 600);
                sixthStreet_CHAR.setLocation(375, 100);
                add(sixthStreet_CHAR);

                if (sixthStreet_TALK1_TRUE != 0) {

                    GImage secondStreet_talk10 = new GImage("worker_nothing.png");
                    secondStreet_talk10.setLocation(270, 455);
                    secondStreet_talk10.setSize(800, 210);
                    add(secondStreet_talk10);

                } else {
                    GImage sixthStreet_talk1 = new GImage("question1.png");
                    sixthStreet_talk1.setLocation(270, 455);
                    sixthStreet_talk1.setSize(800, 210);
                    add(sixthStreet_talk1);

                    sixthStreet_talk1.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            sixthStreet_talk1.setVisible(false);
                            GImage sixthStreet_talk2 = new GImage("worker1.png");
                            sixthStreet_talk2.setLocation(270, 455);
                            sixthStreet_talk2.setSize(800, 210);
                            add(sixthStreet_talk2);

                            sixthStreet_talk2.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {
                                    sixthStreet_talk2.setVisible(false);
                                    GImage sixthStreet_talk3 = new GImage("worker2.png");
                                    sixthStreet_talk3.setLocation(270, 455);
                                    sixthStreet_talk3.setSize(800, 210);
                                    add(sixthStreet_talk3);

                                    sixthStreet_talk3.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {

                                            sixthStreet_talk3.setVisible(false);
                                            GImage sixthStreet_talk4 = new GImage("question2.png");
                                            sixthStreet_talk4.setLocation(270, 455);
                                            sixthStreet_talk4.setSize(800, 210);
                                            add(sixthStreet_talk4);

                                            sixthStreet_talk4.addMouseListener(new MouseAdapter() {

                                                public void mousePressed(MouseEvent e) {

                                                    sixthStreet_talk4.setVisible(false);
                                                    GImage sixthStreet_talk5 = new GImage("worker3.png");
                                                    sixthStreet_talk5.setLocation(270, 455);
                                                    sixthStreet_talk5.setSize(800, 210);
                                                    add(sixthStreet_talk5);

                                                    sixthStreet_talk5.addMouseListener(new MouseAdapter() {

                                                        public void mousePressed(MouseEvent e) {

                                                            sixthStreet_talk5.setVisible(false);
                                                            GImage sixthStreet_talk6 = new GImage("question3.png");
                                                            sixthStreet_talk6.setLocation(270, 455);
                                                            sixthStreet_talk6.setSize(800, 210);
                                                            add(sixthStreet_talk6);

                                                            sixthStreet_talk6.addMouseListener(new MouseAdapter() {

                                                                public void mousePressed(MouseEvent e) {

                                                                    sixthStreet_talk6.setVisible(false);
                                                                    sixthStreet_CHAR.setVisible(false);

                                                                    GImage sixthStreet_smallclue = new GImage("hollowblocks.png");
                                                                    sixthStreet_smallclue.setLocation(350, 500);
                                                                    sixthStreet_smallclue.setSize(300, 200);
                                                                    add(sixthStreet_smallclue);

                                                                    sixthStreet_smallclue.addMouseListener(new MouseAdapter() {

                                                                        public void mousePressed(MouseEvent e) {

                                                                            sixthStreet_smallclue.setVisible(false);

                                                                            GImage sixthStreet_MAINclue = new GImage("hollowblocks.png");
                                                                            sixthStreet_MAINclue.setLocation(550, 250);
                                                                            sixthStreet_MAINclue.setSize(450, 250);
                                                                            add(sixthStreet_MAINclue);

                                                                            sixthStreet_MAINclue.addMouseListener(new MouseAdapter() {

                                                                                public void mousePressed(MouseEvent e) {

                                                                                    sixthStreet_MAINclue.setVisible(false);
                                                                                    sixthStreet_CHAR.setVisible(true);
                                                                                    sixthStreet_MAINclue.sendToBack();

                                                                                    GImage sixthStreet_talk7 = new GImage("worker5.png");
                                                                                    sixthStreet_talk7.setLocation(270, 455);
                                                                                    sixthStreet_talk7.setSize(800, 210);
                                                                                    add(sixthStreet_talk7);

                                                                                    sixthStreet_talk7.addMouseListener(new MouseAdapter() {

                                                                                        public void mousePressed(MouseEvent e) {

                                                                                            sixthStreet_talk7.setVisible(false);

                                                                                            GImage sixthStreet_talk8 = new GImage("worker6.png");
                                                                                            sixthStreet_talk8.setLocation(270, 455);
                                                                                            sixthStreet_talk8.setSize(800, 210);
                                                                                            add(sixthStreet_talk8);

                                                                                            sixthStreet_talk8.addMouseListener(new MouseAdapter() {
                                                                                                public void mousePressed(MouseEvent e) {
                                                                                                    sixthStreet_talk8.setVisible(false);
                                                                                                    sixthStreet_CHAR.sendToFront();

                                                                                                    GImage sixthStreet_talk10 = new GImage("worker_nothing.png");
                                                                                                    sixthStreet_talk10.setLocation(270, 455);
                                                                                                    sixthStreet_talk10.setSize(800, 210);
                                                                                                    add(sixthStreet_talk10);

                                                                                                    sixthStreet_TALK1_TRUE = 1;

                                                                                                }

                                                                                            });

                                                                                        }
                                                                                    });

                                                                                }
                                                                            });

                                                                        }
                                                                    });

                                                                }
                                                            });

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }

                displayPack();

                sixthStreet_BACKTO_seventhStreet.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {

                        sixthStreet_BACKTO_seventhStreet.setColor(Color.ORANGE);
                        removeAll();

                        seventhStreet_METHOD();

                    }

                });

                sixthStreet_BACKTO_thirdStreet.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        sixthStreet_BACKTO_thirdStreet.setColor(Color.WHITE);
                        sixthStreet_BACKTO_thirdStreet.setColor(Color.ORANGE);
                        removeAll();
                        displayPack();
                        thirdStreet_METHOD();
                    }

                });
            }

        }

    }

    public void seventhStreet_METHOD() {
        ifDONE();
        currentLocation = "7th Street";
        GImage seventhStreet_BG = new GImage("Clubroom.jpg");
        seventhStreet_BG.setSize(1400, 750);
        add(seventhStreet_BG);

        GImage seventhStreet_CHAR = new GImage("Student-01.png");
        seventhStreet_CHAR.setLocation(375, 100);
        seventhStreet_CHAR.setSize(600, 600);
        add(seventhStreet_CHAR);

        GLabel seventhStreet_BACKTO_fifthStreet = new GLabel("5th Street");
        seventhStreet_BACKTO_fifthStreet.setColor(Color.ORANGE);
        seventhStreet_BACKTO_fifthStreet.setLocation(42, 290);
        seventhStreet_BACKTO_fifthStreet.setFont(locationFONT3);
        add(seventhStreet_BACKTO_fifthStreet);

        GLabel seventhStreet_BACKTO_sixthStreet = new GLabel("6th Street");
        seventhStreet_BACKTO_sixthStreet.setColor(Color.ORANGE);
        seventhStreet_BACKTO_sixthStreet.setLocation(42, 320);
        seventhStreet_BACKTO_sixthStreet.setFont(locationFONT3);
        add(seventhStreet_BACKTO_sixthStreet);

        GLabel seventhStreet_BACKTO_fourthStreet = new GLabel("4th Street");
        seventhStreet_BACKTO_fourthStreet.setColor(Color.ORANGE);
        seventhStreet_BACKTO_fourthStreet.setLocation(42, 260);
        seventhStreet_BACKTO_fourthStreet.setFont(locationFONT3);
        add(seventhStreet_BACKTO_fourthStreet);

        if (seventhStreet_TALK1_TRUE != 0) {
            GImage secondStreet_talk10 = new GImage("student_nothing.png");
            secondStreet_talk10.setLocation(270, 455);
            secondStreet_talk10.setSize(800, 210);
            add(secondStreet_talk10);
        } else {
            GImage seventhStreet_talk1 = new GImage("student1.png");
            seventhStreet_talk1.setLocation(270, 455);
            seventhStreet_talk1.setSize(800, 210);
            add(seventhStreet_talk1);

            seventhStreet_talk1.addMouseListener(new MouseAdapter() {

                public void mousePressed(MouseEvent e) {
                    seventhStreet_talk1.setVisible(false);
                    GImage seventhStreet_talk2 = new GImage("us1.png");
                    seventhStreet_talk2.setLocation(270, 455);
                    seventhStreet_talk2.setSize(800, 210);
                    add(seventhStreet_talk2);

                    seventhStreet_talk2.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            seventhStreet_talk2.setVisible(false);
                            GImage seventhStreet_talk3 = new GImage("student2.png");
                            seventhStreet_talk3.setLocation(270, 455);
                            seventhStreet_talk3.setSize(800, 210);
                            add(seventhStreet_talk3);

                            seventhStreet_talk3.addMouseListener(new MouseAdapter() {

                                public void mousePressed(MouseEvent e) {

                                    seventhStreet_talk3.setVisible(false);
                                    GImage seventhStreet_talk4 = new GImage("us3.png");
                                    seventhStreet_talk4.setLocation(270, 455);
                                    seventhStreet_talk4.setSize(800, 210);
                                    add(seventhStreet_talk4);

                                    seventhStreet_talk4.addMouseListener(new MouseAdapter() {

                                        public void mousePressed(MouseEvent e) {

                                            seventhStreet_talk4.setVisible(false);
                                            GImage seventhStreet_talk5 = new GImage("student3.png");
                                            seventhStreet_talk5.setLocation(270, 455);
                                            seventhStreet_talk5.setSize(800, 210);
                                            add(seventhStreet_talk5);

                                            seventhStreet_talk5.addMouseListener(new MouseAdapter() {

                                                public void mousePressed(MouseEvent e) {

                                                    seventhStreet_talk5.setVisible(false);
                                                    GImage seventhStreet_talk6 = new GImage("student4.png");
                                                    seventhStreet_talk6.setLocation(270, 455);
                                                    seventhStreet_talk6.setSize(800, 210);
                                                    add(seventhStreet_talk6);

                                                    seventhStreet_talk6.addMouseListener(new MouseAdapter() {

                                                        public void mousePressed(MouseEvent e) {

                                                            seventhStreet_talk6.setVisible(false);
                                                            seventhStreet_CHAR.setVisible(false);

                                                            GImage seventhStreet_smallclue = new GImage("poster.png");
                                                            seventhStreet_smallclue.setLocation(1000, 200);
                                                            seventhStreet_smallclue.setSize(90, 90);
                                                            add(seventhStreet_smallclue);

                                                            seventhStreet_smallclue.addMouseListener(new MouseAdapter() {

                                                                public void mousePressed(MouseEvent e) {

                                                                    seventhStreet_smallclue.setVisible(false);

                                                                    GImage seventhStreet_MAINclue = new GImage("poster.png");
                                                                    seventhStreet_MAINclue.setLocation(450, 150);
                                                                    seventhStreet_MAINclue.setSize(450, 450);
                                                                    add(seventhStreet_MAINclue);

                                                                    seventhStreet_MAINclue.addMouseListener(new MouseAdapter() {

                                                                        public void mousePressed(MouseEvent e) {

                                                                            seventhStreet_MAINclue.setVisible(false);
                                                                            seventhStreet_CHAR.setVisible(true);
                                                                            seventhStreet_MAINclue.sendToBack();

                                                                            GImage seventhStreet_talk7 = new GImage("student5.png");
                                                                            seventhStreet_talk7.setLocation(270, 455);
                                                                            seventhStreet_talk7.setSize(800, 210);
                                                                            add(seventhStreet_talk7);

                                                                            seventhStreet_talk7.addMouseListener(new MouseAdapter() {

                                                                                public void mousePressed(MouseEvent e) {

                                                                                    seventhStreet_talk7.setVisible(false);

                                                                                    GImage seventhStreet_talk8 = new GImage("student6.png");
                                                                                    seventhStreet_talk8.setLocation(270, 455);
                                                                                    seventhStreet_talk8.setSize(800, 210);
                                                                                    add(seventhStreet_talk8);

                                                                                    seventhStreet_talk8.addMouseListener(new MouseAdapter() {
                                                                                        public void mousePressed(MouseEvent e) {
                                                                                            seventhStreet_talk8.setVisible(false);
                                                                                            seventhStreet_CHAR.sendToFront();

                                                                                            GImage seventhStreet_talk10 = new GImage("student_nothing.png");
                                                                                            seventhStreet_talk10.setLocation(270, 455);
                                                                                            seventhStreet_talk10.setSize(800, 210);
                                                                                            add(seventhStreet_talk10);

                                                                                            seventhStreet_TALK1_TRUE = 1;

                                                                                        }

                                                                                    });

                                                                                }
                                                                            });

                                                                        }
                                                                    });

                                                                }
                                                            });

                                                        }
                                                    });

                                                }
                                            });

                                        }
                                    });

                                }
                            });

                        }
                    });

                }
            });

        }

        displayPack();

        seventhStreet_BACKTO_fifthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                fifthStreet_METHOD();
            }

        });

        seventhStreet_BACKTO_sixthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                sixthStreet_METHOD();
            }

        });

        seventhStreet_BACKTO_fourthStreet.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                displayPack();
                fourthStreet_METHOD();
            }

        });

    }

    public void DijksrasAlgoritm_METHOD(){
        removeAll();
        this.setBackground(Color.orange);
        GImage updated_alibi = new GImage("suspectlist.png");
        updated_alibi.setLocation(100, 0);
        updated_alibi.setSize(700, 700);
        add(updated_alibi);
        
        GImage seventhStreet_CHAR = new GImage("shortestpath.png");
        seventhStreet_CHAR.setLocation(690, 130);
        seventhStreet_CHAR.setSize(500, 260);
        add(seventhStreet_CHAR);
        
        GLabel FINAL_METHOD = new GLabel("SOLVE CASE");
        FINAL_METHOD.setColor(Color.black);
        FINAL_METHOD.setLocation(1000, 680);
        FINAL_METHOD.setFont(normalFONT);
        add(FINAL_METHOD);
        
        FINAL_METHOD.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {

                removeAll();
                killer_METHOD();
            }

        });
    }
    
    public void killer_METHOD(){
        currentLocation = "4th Street";
        GImage killerStreet_BG = new GImage("Station.jpg");
        killerStreet_BG.setSize(1400, 750);
        add(killerStreet_BG);
        
        GImage killerStreet_MAINclue = new GImage("noteMayor.png");
        killerStreet_MAINclue.setLocation(375, 20);
        killerStreet_MAINclue.setSize(700, 700);
        add(killerStreet_MAINclue);

            killerStreet_MAINclue.addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e){
                    killerStreet_MAINclue.setVisible(false);
                    
                    GImage killerStreet_CHAR = new GImage("Police-01.png");
                    killerStreet_CHAR.setLocation(375, 100);
                    killerStreet_CHAR.setSize(600, 600);
                    add(killerStreet_CHAR);
                    
          
                    GImage killerStreet_talk1 = new GImage("LastText.png");
                    killerStreet_talk1.setLocation(270, 455);
                    killerStreet_talk1.setSize(800, 210);
                    add(killerStreet_talk1);

                    killerStreet_talk1.addMouseListener(new MouseAdapter() {

                        public void mousePressed(MouseEvent e) {
                            GLabel h = new GLabel("A. MELVIN");
                            h.setLocation(850, 270);
                            h.setColor(Color.RED);
                            h.setFont(normalFONT);
                            add(h);

                            GLabel f = new GLabel("B. KONG");
                            f.setLocation(850, 350);
                            f.setColor(Color.RED);
                            f.setFont(normalFONT);
                            add(f);

                            GLabel c = new GLabel("C. CABATUAN");
                            c.setLocation(850, 430);
                            c.setColor(Color.RED);
                            c.setFont(normalFONT);
                            add(c);
                            
                               c.addMouseListener(new MouseAdapter() {
                               public void mousePressed(MouseEvent e) {
                                   
                                   removeAll();
                                   winner_METHOD();

                               }
                           });
                               
                               f.addMouseListener(new MouseAdapter() {
                               public void mousePressed(MouseEvent e) {
                                   
                                   removeAll();
                                   winner_METHOD();

                               }
                           });
                               
                               h.addMouseListener(new MouseAdapter() {
                               public void mousePressed(MouseEvent e) {
                                   
                                   removeAll();
                                   winner_METHOD();

                               }
                           });
                          }
                    });
                    
                }
                }
              );
            
           
        }
        
}


    