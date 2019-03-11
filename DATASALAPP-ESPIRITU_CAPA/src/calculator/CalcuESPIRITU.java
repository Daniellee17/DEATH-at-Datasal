package calculator;

import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 

public class CalcuESPIRITU extends GraphicsProgram
{
    public static void main(String[] args) 
    {
        new CalcuESPIRITU().start(args);
    } 

    double result;
    private IntToPost INFIX_POSTFIX;    
    public String GLABEL_InputLabel="";
    private String Input_SYSTEMPRINT = "";
    private String clicked="";
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 450;
     
    public GLabel GLABEL_Input = new GLabel ("", 20, 40);
    GOval plus = new GOval(15, 90, 60,60);
    GLabel pluslabel = new GLabel("+");
    GOval minus = new GOval(15, 155, 60,60);
    GLabel minuslabel = new GLabel("_");
    GOval times = new GOval(15, 220, 60,60);
    GLabel timeslabel = new GLabel("x");
    GOval divide = new GOval(15, 285, 60,60);
    GLabel dividelabel = new GLabel("/");    
    GOval one = new GOval(90, 90, 60,60);
    GLabel onelabel = new GLabel("1");
    GOval two = new GOval(155, 90, 60,60);
    GLabel twolabel = new GLabel("2");
    GOval three = new GOval(220, 90, 60,60);
    GLabel threelabel = new GLabel("3");
    GOval four = new GOval(90, 155, 60,60);
    GLabel fourlabel = new GLabel("4");
    GOval five = new GOval(155, 155, 60,60);
    GLabel fivelabel = new GLabel("5");
    GOval six = new GOval(220, 155, 60,60);
    GLabel sixlabel = new GLabel("6");
    GOval seven = new GOval(90, 220, 60,60);
    GLabel sevenlabel = new GLabel("7");
    GOval eight = new GOval(155, 220, 60,60);
    GLabel eightlabel = new GLabel("8");
    GOval nine = new GOval(220, 220, 60,60);
    GLabel ninelabel = new GLabel("9");
    GOval zero = new GOval(90, 285, 60,60);
    GLabel zerolabel = new GLabel("0");
    GOval dot = new GOval(155, 285, 60,60);
    GLabel dotlabel = new GLabel(".");
    GOval clear = new GOval(220, 285, 60,60);
    GLabel clearlabel = new GLabel("AC");
    GRect equals = new GRect(90, 360, 190,60);
    GLabel equalslabel = new GLabel("=");
    GLabel num = new GLabel("0");
    GOval plusminus = new GOval(20, 382, 20,20);
    GOval plusminuss2 = new GOval(45, 382, 20,20);
    GLabel plusminuslabel = new GLabel("+");
    GLabel plusminuss2label = new GLabel("-");
    
    @Override
    public void init()
    {
        screen();
        addd();
        subb();
        mult();
        divi();
        onee();
        twoo();
        threee();
        fourr();
        fivee();
        sixx();
        sevenn();
        eigthh();
        ninee();
        equall();
        zeroo();
        ccc();       
    }
   
     
     private void addd()  
     {
        add(plus);
        add(pluslabel, 35,130);
        pluslabel.setColor(Color.WHITE);
        pluslabel.setFont("Century Schoolbook L-32-italic");
        plus.setFilled(true);
        this.plus.setFillColor(Color.BLACK);
        
        plus.addMouseListener(new MouseAdapter() 
        {
           @Override
           public void mouseClicked(MouseEvent e) 
           {
               clicked = "+";
               Input_SYSTEMPRINT+=clicked;
               System.out.println(Input_SYSTEMPRINT);
               

           }     
           
           @Override
            public void mousePressed(MouseEvent e) 
            {

            plus.setFillColor(Color.YELLOW);
                    pluslabel.setColor(Color.BLACK);

            }

            public void mouseReleased(MouseEvent e) 
            {
                plus.setFillColor(Color.BLACK);
                pluslabel.setColor(Color.WHITE);
                remove(GLABEL_Input);
                GLABEL_InputLabel = GLABEL_InputLabel + "+";
                GLABEL_Input.setLabel(GLABEL_InputLabel);
                add(GLABEL_Input);
            }
        });    
    }
    
     private void subb()  
     {
        add(minus);
        minus.setFilled(true);
        minus.setFillColor(Color.BLACK);  
        minuslabel.setFont("Century Schoolbook L-32-italic");
        minuslabel.setColor(Color.WHITE);
        add(minuslabel,35,180);
        
     minus.addMouseListener(new MouseAdapter() 
     {
        public void mouseClicked(MouseEvent e) 
        {
            clicked = "-";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        public void mousePressed(MouseEvent e) 
        {
        
            minus.setFillColor(Color.YELLOW);
            minuslabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        minus.setFillColor(Color.BLACK);
        minuslabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "-";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
     
    private void mult()  {
   times.setFilled(true);
        times.setFillColor(Color.BLACK);
        add(times);
        timeslabel.setFont("Century Schoolbook L-32-italic");
        timeslabel.setColor(Color.WHITE);
        add(timeslabel,35,260);
     times.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "*";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
         times.setFillColor(Color.YELLOW);
                timeslabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
       times.setFillColor(Color.BLACK);
                timeslabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "*";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    } 
     
    
    private void divi()  
    {
        divide.setFilled(true);
        divide.setFillColor(Color.BLACK);
        add(divide);
        dividelabel.setFont("Century Schoolbook L-32-italic");
        dividelabel.setColor(Color.WHITE);
        add(dividelabel,35,328);
        
     divide.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "/";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
        divide.setFillColor(Color.YELLOW);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        divide.setFillColor(Color.BLACK);
                dividelabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "/";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
     
    private void onee()  
    {
    one.setFilled(true);
        one.setFillColor(Color.BLACK);
        add(one);
        onelabel.setFont("Century Schoolbook L-32-italic");
        onelabel.setColor(Color.WHITE);
        add(onelabel,110,130); 
     one.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "1";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
         one.setFillColor(Color.RED);
                onelabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        one.setFillColor(Color.BLACK);
                onelabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "1";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
    private void twoo()  {    two.setFilled(true);
        two.setFillColor(Color.BLACK);
        add(two);
        twolabel.setFont("Century Schoolbook L-32-italic");
        twolabel.setColor(Color.WHITE);
        add(twolabel,175,130);
    
     two.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "2";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
         two.setFillColor(Color.CYAN);
                twolabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        two.setFillColor(Color.BLACK);
                twolabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "2";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
    private void threee()  {
         three.setFilled(true);
        three.setFillColor(Color.BLACK);
        add(three);
        threelabel.setFont("Century Schoolbook L-32-italic");
        threelabel.setColor(Color.WHITE);
        add(threelabel,240,130);
    
     three.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "3";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
        three.setFillColor(Color.GREEN);
                threelabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        three.setFillColor(Color.BLACK);
                threelabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "3";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
    private void fourr()  {   four.setFilled(true);
        four.setFillColor(Color.BLACK);
        add(four);
        fourlabel.setFont("Century Schoolbook L-32-italic");
        fourlabel.setColor(Color.WHITE);
        add(fourlabel,110,195);
     
     four.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "4";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
         four.setFillColor(Color.MAGENTA);
                fourlabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        four.setFillColor(Color.BLACK);
                fourlabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "4";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
    private void fivee()  {five.setFilled(true);
        five.setFillColor(Color.BLACK);
        add(five);
        fivelabel.setFont("Century Schoolbook L-32-italic");
        fivelabel.setColor(Color.WHITE);
        add(fivelabel,175,195);
     
     five.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "5";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
       five.setFillColor(Color.WHITE);
                fivelabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        five.setFillColor(Color.BLACK);
                fivelabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "5";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
    private void sixx()  { six.setFilled(true);
        six.setFillColor(Color.BLACK);
        add(six);
        sixlabel.setFont("Century Schoolbook L-32-italic");
        sixlabel.setColor(Color.WHITE);
        add(sixlabel,240,195);
     
     six.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "6";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
         six.setFillColor(Color.YELLOW);
                sixlabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
      six.setFillColor(Color.BLACK);
                sixlabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "6";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
     private void sevenn()  {seven.setFilled(true);
        seven.setFillColor(Color.BLACK);
        add(seven);
        sevenlabel.setFont("Century Schoolbook L-32-italic");
        sevenlabel.setColor(Color.WHITE);
        add(sevenlabel,110,260);
     
     seven.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "7";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
        seven.setFillColor(Color.RED);
                sevenlabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
         seven.setFillColor(Color.BLACK);
                sevenlabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "7";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
     
      private void eigthh()  {eight.setFilled(true);
        eight.setFillColor(Color.BLACK);
        add(eight);
        eightlabel.setFont("Century Schoolbook L-32-italic");
        eightlabel.setColor(Color.WHITE);
        add(eightlabel,175,260);
     
     eight.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "8";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
      eight.setFillColor(Color.GREEN);
                eightlabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
        eight.setFillColor(Color.BLACK);
                eightlabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "8";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    
       private void ninee()  { nine.setFilled(true);
        nine.setFillColor(Color.BLACK);
        add(nine);
        ninelabel.setFont("Century Schoolbook L-32-italic");
        ninelabel.setColor(Color.WHITE);
        add(ninelabel,240,260);
     
     nine.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "9";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
        nine.setFillColor(Color.CYAN);
                ninelabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
       nine.setFillColor(Color.BLACK);
                ninelabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "9";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
       
       private void ccc()  {
           clear.setFilled(true);
        clear.setFillColor(Color.BLACK);
        add(clear);
        clearlabel.setFont("Century Schoolbook L-30-italic");
        clearlabel.setColor(Color.WHITE);
        add(clearlabel,230,325);
     
     clear.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = " ";
            Input_SYSTEMPRINT= " ";
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
         clear.setFillColor(Color.YELLOW);
                clearlabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
         clear.setFillColor(Color.BLACK);
                clearlabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = " ";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
       
     
        private void equall()  {equals.setFilled(true);
        equals.setFillColor(Color.RED);
        add(equals);
        equalslabel.setFont("Century Schoolbook L-30-italic");
        equalslabel.setColor(Color.WHITE);
        add(equalslabel,175,400);
     
     equals.addMouseListener(new MouseAdapter() {
         
        
        public void mouseClicked(MouseEvent e) 
        {            
            System.out.println(Input_SYSTEMPRINT);
            INFIX_POSTFIX = new IntToPost();
            System.out.println("\nINTOPOST:  " + INFIX_POSTFIX.inttoposst(Input_SYSTEMPRINT));
            result = INFIX_POSTFIX.posttoans(INFIX_POSTFIX.inttoposst(Input_SYSTEMPRINT));
            System.out.println("Finals Answer (PostFix to Ans):  " + result);
            GLABEL_InputLabel=result+"";
            GLABEL_Input.setLabel(GLABEL_InputLabel);
            System.out.println("INPUT Before:  " + Input_SYSTEMPRINT);
            Input_SYSTEMPRINT = "" + result;
            System.out.println("INPUT After:  " + Input_SYSTEMPRINT);
        }
        
        
        public void mousePressed(MouseEvent e) {
        
         equals.setFillColor(Color.GREEN);
                equalslabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
             
                equals.setFillColor(Color.RED);
                equalslabel.setColor(Color.WHITE);
        
        }
        });    
    }
        
    private void zeroo()  {zero.setFilled(true);
        zero.setFillColor(Color.BLACK);
        add(zero);
        zerolabel.setFont("Century Schoolbook L-32-italic");
        zerolabel.setColor(Color.WHITE);
        add(zerolabel,110,325);
     
     zero.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            clicked = "0";
            Input_SYSTEMPRINT+=clicked;
            System.out.println(Input_SYSTEMPRINT);
        }

        
        public void mousePressed(MouseEvent e) {
        
        zero.setFillColor(Color.BLUE);
                zerolabel.setColor(Color.BLACK);
        }

        
        public void mouseReleased(MouseEvent e) {
        
             
                zero.setFillColor(Color.BLACK);
                zerolabel.setColor(Color.WHITE);
        remove(GLABEL_Input);
        GLABEL_InputLabel = GLABEL_InputLabel + "0";
        GLABEL_Input.setLabel(GLABEL_InputLabel);
        add(GLABEL_Input);
        }
        });    
    }
    public void screen(){
      GRect box = new GRect(0, 0, 300,450);
      box.setFilled(true);
      box.setColor(Color.BLACK);
      add(box);  
      
     GRect display = new GRect(10, 10, 280,40);
     display.setFilled(true);
     display.setColor(Color.LIGHT_GRAY);
     add(display);
     
      addMouseListeners();
        
     
    }
      
    
}
