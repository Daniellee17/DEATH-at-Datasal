package calculator;


import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.util.Stack;

public class IntToPost extends GraphicsProgram
{
    private String ANSWER="";
    private Stack<String> STACK_Operator = new Stack<String>();
    private Stack<Double> STACK_Operand = new Stack<Double>();   
    
    public String inttoposst(String inputt)
    {
      for(int i=0; i<inputt.length(); i++)
      {
          char POSTFIX_Line = inputt.charAt(i);
          if(!isOperator(POSTFIX_Line)){
              ANSWER += Character.toString(POSTFIX_Line);
              
          }
          else{
              ANSWER = ANSWER + " ";
                if(STACK_Operator.empty()){ 
                    STACK_Operator.push(Character.toString(POSTFIX_Line));
                }
                
                else{
                    if(prior(Character.toString(POSTFIX_Line))<prior(STACK_Operator.peek())) {
                        ANSWER += STACK_Operator.pop();
                    }
                                                                                             
                    else if((prior(Character.toString(POSTFIX_Line))==prior(STACK_Operator.peek()))){
                        ANSWER  += STACK_Operator.pop();
                    }
                    STACK_Operator.push(Character.toString(POSTFIX_Line));
                }
          }  
          }
      while(!STACK_Operator.empty()) {
      ANSWER +=" " + STACK_Operator.pop() ;
      }
      return ANSWER;
    }
    String StringNUM_to_Double=" ";
    public Double posttoans(String res){
        double tempVal1=0, tempVal2=0;
        double resolt=0;
        
        for(int i=0; i<res.length(); i++) {
            char POSTFIX_Line = res.charAt(i);
           
            if(!isOperator(POSTFIX_Line) ){ 
                if(POSTFIX_Line!= ' '){
                StringNUM_to_Double+= POSTFIX_Line;
                }
                if(POSTFIX_Line== ' '){
                    if (StringNUM_to_Double!=" "){
                STACK_Operand.push(Double.parseDouble(StringNUM_to_Double));
                    }    
                StringNUM_to_Double = " ";
                }
            }
            else if(isOperator(POSTFIX_Line) ) {
                if(!STACK_Operand.empty()) {
                    performOp(POSTFIX_Line);
                }
            }   
        }        
        return STACK_Operand.peek();
    }
    
     public int prec;
     public int prior(String oprato){
            
            switch(oprato){
                case"+":
                {
                    prec=1;
                    break;
                }
                case"-":
                {
                     prec=1;
                    break;
                }
                   
                case"*":
                {
                    prec=3;
                    break;
                }
                case"/":
                {
                    prec=3;
                    break;
                }
                    
            }
            
     return prec;
     }
    
     public boolean isOperator(char input){
         
         switch(input){
                 case '+':
                 return true;
                 case '-':
                 return true;
                 case '*':
                 return true;
                 case '/':
                 return true;
         }
         return false;
      }
     
     
     public double performOp( char operatorr){
         double result=0;
         
         if (operatorr == '+'){
             double x = STACK_Operand.pop();
             double y = STACK_Operand.pop();
             result = x + y;
             STACK_Operand.push(result);
             
         }
         else if (operatorr == '-'){
            double x = STACK_Operand.pop();
             double y = STACK_Operand.pop();
             result = y - x;
             STACK_Operand.push(result);
         }
         else if (operatorr == '*'){
             double x = STACK_Operand.pop();
             double y = STACK_Operand.pop();
             result = x * y;
             STACK_Operand.push(result);
         }
         else if (operatorr =='/'){
             double x = STACK_Operand.pop();
             double y = STACK_Operand.pop();
             result = y / x;
             STACK_Operand.push(result);
         }
        return result;
     }
     
       public static void main(String[] args) {
        new IntToPost().start(args);
    }
}
