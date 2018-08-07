package cs1302.calc;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import java.util.Arrays;
import java.awt.font.*;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;

/**
* This class is used to run the calculator application.
*/
 
public class Driver extends Application {

IterativeMath im = new IterativeMath();
RecursiveMath rm = new RecursiveMath();
    /**
    * This method is used in order to launch the calculator.
    *
    * @param args the arguments taken in by the program
    */
    public static void main(String[] args) {
        launch(args);
    } // main
    
    /**
    * This method is used to create the stage and perform all
    * the opeartions of the calculator.
    *
    * @param primaryStage creates the stage for the calculator
    */
    @Override
    public void start(Stage primaryStage) {
    
    // anchor pane that holds all elements 
	  FlowPane fp = new FlowPane();
    // scene of calculator 
     Scene scene = new Scene(fp,640,480);
    // hbox that holds input TextField 
    HBox hbI = new HBox();
    hbI.prefWidthProperty().bind(primaryStage.widthProperty());
    // hbox that holds output TextField 
    HBox hbO = new HBox();
    hbO.prefWidthProperty().bind(primaryStage.widthProperty());
    // hbox that holds bianary label 
    HBox hbB = new HBox();
    hbB.setPadding( new Insets(24,24,24,24));
    hbB.prefWidthProperty().bind(primaryStage.widthProperty());
    // vbox that holds number buttons and some function buttons 
    VBox vb = new VBox();
    vb.setPadding( new Insets(8,8,8,8));
    vb.setSpacing(10);
    // vbox that holds other components 
    VBox vb2 = new VBox();
    vb2.setPadding( new Insets(8,8,8,8));
    vb2.setSpacing(10);
    //hbox for first row of vb 
    HBox hb = new HBox();
    hb.setSpacing(10);
    //hbox for second row of vb 
    HBox hb2 = new HBox();
    hb2.setSpacing(10);
    //hbox for third row of vb 
    HBox hb3 = new HBox();
    hb3.setSpacing(10);
    //hbox for fourth row of vb 
    HBox hb4 = new HBox();
    hb4.setSpacing(10);
    //hbox for first row of vb2
    HBox hb21 = new HBox();
    hb21.setSpacing(10);
    //hbox for second row of vb2
    HBox hb22 = new HBox();
    hb22.setSpacing(10);
    //hbox for third row of vb2
    HBox hb23 = new HBox();
    hb23.setSpacing(10);
    //hbox for fourth row of vb2
    HBox hb24 = new HBox();
    hb24.setSpacing(10);
   
   // button #1 
   Button btn1 = new Button("1");
   btn1.setStyle("-fx-font: 30 arial;");
   btn1.setMinWidth(60);
   
   // button #2 
   Button btn2 = new Button("2");
   btn2.setStyle("-fx-font: 30 arial;");
   btn2.setMinWidth(60);
   
   // button #3
   Button btn3 = new Button("3");
   btn3.setStyle("-fx-font: 30 arial;");
   btn3.setMinWidth(60);
   
   // button #4
  Button btn4 = new Button("4");
  btn4.setStyle("-fx-font: 30 arial;");
  btn4.setMinWidth(60);
  
  // button #5
   Button btn5 = new Button("5");
   btn5.setStyle("-fx-font: 30 arial;");
   btn5.setMinWidth(60);
   
  // button #6
  Button btn6 = new Button("6");
  btn6.setStyle("-fx-font: 30 arial;");
  btn6.setMinWidth(60);
  
  // button #7
   Button btn7= new Button("7");
   btn7.setStyle("-fx-font: 30 arial;");
   btn7.setMinWidth(60);
   
  // button 8
   Button btn8 = new Button("8");
   btn8.setStyle("-fx-font: 30 arial;");
   btn8.setMinWidth(60);
   
  // button # 9 
   Button btn9 = new Button("9");
   btn9.setStyle("-fx-font: 30 arial;");
   btn9.setMinWidth(60);
   
  //button #0
   Button btn0 = new Button("0");
   btn0.setStyle("-fx-font: 30 arial;");
   btn0.setMinWidth(60);
   
  //additon Button 
   Button btnAdd = new Button(" + ");
   btnAdd.setStyle("-fx-font: 28 arial;");
   btnAdd.setMinWidth(60);
   
  //subtraction button 
   Button btnSub = new Button(" - ");
   btnSub.setStyle("-fx-font: 30 arial;");
   btnSub.setMinWidth(60);
   
  //division button 
   Button btnDiv = new Button(" / ");
   btnDiv.setStyle("-fx-font: 30 arial;");
   btnDiv.setMinWidth(60);
   
 // Equals Button 
   Button btnEqu= new Button(" = ");
   btnEqu.setStyle("-fx-font: 30 arial;-fx-base:  #90EE90");
   btnEqu.setMinWidth(130);
   
  // multiplication button 
   Button btnMul = new Button(" * ");
   btnMul.setStyle("-fx-font: 30 arial;");
   btnMul.setMinWidth(60);
   
  //factorial button 
   Button btnFac= new Button(" !");
   btnFac.setStyle("-fx-font: 30 arial;");
   btnFac.setMinWidth(80);
   
  // exponent button 
   Button btnEx = new Button(" ^ ");
   btnEx.setStyle("-fx-font: 30 arial;");
   btnEx.setMinWidth(80);
   
  //delete button 
   Button btnDel = new Button("<");
   btnDel.setStyle("-fx-font: 30 arial;-fx-base:#FFA500");
   btnDel.setMinWidth(80);
   
  // Binary button 
   Button btnBi= new Button("Hide Binary");
   btnBi.setStyle("-fx-font: 30 arial;-fx-base: #00CED1");
   btnBi.setMinWidth(260);
   
  //Recursion button 
   Button btnRec= new Button("Use Recursion");
   btnRec.setStyle("-fx-font: 30 arial;-fx-base: #00CED1");
   btnRec.setMinWidth(260);
   
  //clear button 
   Button btnClr= new Button("X");
   btnClr.setStyle("-fx-font: 30 arial;-fx-base:#FFA500");
   btnClr.setMinWidth(80);
   
  //button that moves right 
   Button btnR= new Button(">>");
   btnR.setStyle("-fx-font:24 arial;-fx-base:#FFA500");
   btnR.setMinWidth(80);
   
  //button that moves left 
  Button btnL= new Button("<<");
  btnL.setStyle("-fx-font: 24 arial;-fx-base:#FFA500");
  btnL.setMinWidth(80);
  
  // Binary Label 
  Label bf= new Label();
  bf.prefWidthProperty().bind(primaryStage.widthProperty());
  bf.setAlignment(Pos.BOTTOM_RIGHT);
  bf.setText(" 0000 0000 0000 0000 0000 0000 0000 0000");
  bf.setStyle("-fx-font: 24 arial");
  bf.setOnMouseClicked((mouseEvent) -> {
            bf.setText(" 0000 0000 0000 0000 0000 0000 0000 0000");
        });
        
  // bit 1
  Label bit1 = new Label();
  bit1.setText("0");
  bit1.setStyle("-fx-font: 24 arial");
  
  // bit 2
  Label bit2 = new Label();
  bit2.setText("0");
   bit2.setStyle("-fx-font: 24 arial");
  
  // bit 3
  Label bit3 = new Label();
  bit3.setText("0");
  bit3.setStyle("-fx-font: 24 arial");
  
  // bit 4
  Label bit4 = new Label();
  bit4.setText(" 0");
  bit4.setStyle("-fx-font: 24 arial");
  
  
  // bit 5
  Label bit5 = new Label();
  bit5.setText("0");
  bit5.setStyle("-fx-font: 24 arial");
  
  // bit 6
  Label bit6 = new Label();
  bit6.setText("0");
  bit6.setStyle("-fx-font: 24 arial");
  
  // bit 7
  Label bit7 = new Label();
  bit7.setText("0");
  bit7.setStyle("-fx-font: 24 arial");
  
  // bit 8
  Label bit8 = new Label();
  bit8.setText(" 0");
  bit8.setStyle("-fx-font: 24 arial");
  
  // bit 9
  Label bit9 = new Label();
  bit9.setText("0");
  bit9.setStyle("-fx-font: 24 arial");
  
  // bit 10
  Label bit10 = new Label();
  bit10.setText("0");
  bit10.setStyle("-fx-font: 24 arial");
  
  // bit 11
  Label bit11 = new Label();
  bit11.setText("0");
  bit11.setStyle("-fx-font: 24 arial");
  
  // bit 12
  Label bit12 = new Label();
  bit12.setText(" 0");
  bit12.setStyle("-fx-font: 24 arial");
  
  // bit 13
  Label bit13 = new Label();
  bit13.setText("0");
  bit13.setStyle("-fx-font: 24 arial");
  
  // bit 14
  Label bit14 = new Label();
  bit14.setText("0");
  bit14.setStyle("-fx-font: 24 arial");
  
  // bit 15
  Label bit15 = new Label();
  bit15.setText("0");
  bit15.setStyle("-fx-font: 24 arial");
  
  // bit 16
  Label bit16 = new Label();
  bit16.setText(" 0");
  bit16.setStyle("-fx-font: 24 arial");
  // bit 17
  Label bit17 = new Label();
  bit17.setText("0");
  bit17.setStyle("-fx-font: 24 arial");
  
  // bit 18
  Label bit18 = new Label();
  bit18.setText("0");
  bit18.setStyle("-fx-font: 24 arial");
  
  // bit 19
  Label bit19 = new Label();
  bit19.setText("0");
  bit19.setStyle("-fx-font: 24 arial");
  
  //bit 20
  Label bit20 = new Label();
  bit20.setText(" 0");
  bit20.setStyle("-fx-font: 24 arial");
  
  // bit 21
  Label bit21 = new Label();
  bit21.setText("0");
  bit21.setStyle("-fx-font: 24 arial");
  
  // bit 22
  Label bit22 = new Label();
  bit22.setText("0");
  bit22.setStyle("-fx-font: 24 arial");
  
  // bit 23
  Label bit23 = new Label();
  bit23.setText("0");
  bit23.setStyle("-fx-font: 24 arial");
  
  // bit 24
  Label bit24 = new Label();
  bit24.setText(" 0");
  bit24.setStyle("-fx-font: 24 arial");
  
  // bit 25
  Label bit25 = new Label();
  bit25.setText("0");
  bit25.setStyle("-fx-font: 24 arial");
  
  // bit 26
  Label bit26 = new Label();
  bit26.setText("0");
  bit26.setStyle("-fx-font: 24 arial");
  
  // bit 27
  Label bit27 = new Label();
  bit27.setText("0");
  bit27.setStyle("-fx-font: 24 arial");
  
  // bit 28
  Label bit28 = new Label();
  bit28.setText(" 0");
  bit28.setStyle("-fx-font: 24 arial");
  
  // bit 29
  Label bit29 = new Label();
  bit29.setText("0");
  bit29.setStyle("-fx-font: 24 arial");
  
  // bit 30
  Label bit30 = new Label();
  bit30.setText("0");
  bit30.setStyle("-fx-font: 24 arial");
  
  // bit 31
  Label bit31 = new Label();
  bit31.setText("0");
  bit31.setStyle("-fx-font: 24 arial");
  
  
  //label Array
  Label[] bitLabels ={bit31,bit30,bit29,bit28,bit27,bit26,bit25,bit24,bit23,bit22,bit21,bit20,bit19,bit18,bit17,bit16,bit15,bit14,bit13,bit12,bit11,bit10,bit9,bit8,bit7,bit6,bit5,bit4,bit3,bit2,bit1};
  
  //temporary string array that holds the text value of Label Array
  String[] temp = new String[31];
  
  // Input Text Field    
  TextField input= new TextField();
  input.prefWidthProperty().bind(hbI.widthProperty());
  input.setMinHeight(50);
  input.setStyle("-fx-focus-color: #F8F8FF;");
  input.setStyle("-fx-border-color: #F8F8FF;");
  input.setAlignment(Pos.BOTTOM_RIGHT);
 
  // Output Text Field
  TextField output = new TextField();
  output.prefWidthProperty().bind(hbI.widthProperty());
  output.setMinHeight(50);
  output.setStyle("-fx-focus-color: #F8F8FF;-fx-font-size: 30px;");
  output.setAlignment(Pos.BOTTOM_RIGHT);
       
       // prints 1 to TextField
      btn1.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        
        });
        // prints 2 to TextField
      btn2.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 3 to TextField
        btn3.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 4 to TextField
        btn4.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 5 to TextField
        btn5.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 6 to TextField
        btn6.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 7 to TextField
        btn7.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 8 to TextField
        btn8.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 9 to TextField
        btn9.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints 0 to TextField
        btn0.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints / to TextField
        btnDiv.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints * to TextField
        btnMul.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints - to TextField
        btnSub.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints + to TextField
        btnAdd.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints ! to TextField
        btnFac.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints ^ to TextField
        btnEx.setOnAction(new EventHandler<ActionEvent>(){
        public void handle(ActionEvent e){
      
      String value = ((Button) e.getSource()).getText();
      input.setText(input.getText()+value);
        }
        });
        // prints changes Recursion to Interation 
        btnRec.setOnAction(new EventHandler<ActionEvent>(){
          public void handle(ActionEvent e){
        
            if(btnRec.getText().equalsIgnoreCase("Use Recursion")){
              btnRec.setText("Use Iteration");
            }//if
          
            else if (btnRec.getText().equalsIgnoreCase("Use Iteration")){
              btnRec.setText("Use Recursion");
            }//if 
         
        }// handle 
      });// btnRec
      
      
        //Equal button function 
        btnEqu.setOnAction(new EventHandler<ActionEvent>(){
          public void handle(ActionEvent e){
          
          if(btnRec.getText().equalsIgnoreCase("Use Iteration")){
            // use recursion 
              String expression = input.getText();
              String[] infix = expression.split(" ");
              String[] postfix = ReversePolishNotation.infixToPostfix(infix);
              int result = ReversePolishNotation.evaluate(im,postfix);
              String fResult = String.valueOf(result);
              output.setText(fResult);
              
                String[] binaryArray = new String[31];
                String binaryConversion = Integer.toBinaryString(result);
                int i =0;
                
                for(int y =binaryArray.length - binaryConversion.length(); y<binaryArray.length; y++){
                  binaryArray[y] = binaryConversion.substring(i ,i+1);
                  i++;
                }
                for(int x = 0; x< binaryArray.length-binaryConversion.length(); x++){ 
                  binaryArray[x] = "0";
                }
                String finalStringArray = Arrays.toString(binaryArray)
                .replace(",", "")  //remove the commas
                .replace("[", "") //remove the right bracket
                .replace("]", "")
                .trim(); 
 
                bit1.setText(binaryArray[30]);
                bit2.setText(binaryArray[29]);
                bit3.setText(binaryArray[28]);
                bit4.setText(binaryArray[27]);
                bit5.setText(binaryArray[26]+" ");
                bit6.setText(binaryArray[25]);
                bit7.setText(binaryArray[24]);
                bit8.setText(binaryArray[23]);
                bit9.setText(binaryArray[22]+" ");
                bit10.setText(binaryArray[21]);
                bit11.setText(binaryArray[20]);
                bit12.setText(binaryArray[19]);
                bit13.setText(binaryArray[18]+" ");
                bit14.setText(binaryArray[17]);
                bit15.setText(binaryArray[16]);
                bit16.setText(binaryArray[15]);
                bit17.setText(binaryArray[14]+" ");
                bit18.setText(binaryArray[13]);
                bit19.setText(binaryArray[12]);
                bit20.setText(binaryArray[11]);
                bit21.setText(binaryArray[10]+" ");
                bit22.setText(binaryArray[9]);
                bit23.setText(binaryArray[8]);
                bit24.setText(binaryArray[7]);
                bit25.setText(binaryArray[6]+" ");
                bit26.setText(binaryArray[5]);
                bit27.setText(binaryArray[4]);
                bit28.setText(binaryArray[3]);
                bit29.setText(binaryArray[2]+" ");
                bit30.setText(binaryArray[1]);
                bit31.setText(binaryArray[0]);            
            }//if
          else if (btnRec.getText().equalsIgnoreCase("Use Recursion")){
              // use iteration
              String expression = input.getText();
              String[] infix = expression.split(" ");
              String[] postfix = ReversePolishNotation.infixToPostfix(infix);
              int result = ReversePolishNotation.evaluate(rm,postfix);
              String fResult = String.valueOf(result);
              output.setText(fResult);
              String[] binaryArray = new String[31];
              
                String binaryConversion = Integer.toBinaryString(result);
                int i =0;
                for(int y =binaryArray.length - binaryConversion.length(); y<binaryArray.length; y++){
                  binaryArray[y] = binaryConversion.substring(i ,i+1);
                  i++;
                }
                for(int x = 0; x< binaryArray.length-binaryConversion.length(); x++){ 
                  binaryArray[x] = "0";
                }
                String finalStringArray = Arrays.toString(binaryArray)
                .replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  
                .trim(); 
                
               //binary field list 
               bit1.setText(binaryArray[30]);
                bit2.setText(binaryArray[29]);
                bit3.setText(binaryArray[28]);
                bit4.setText(binaryArray[27]);
                bit5.setText(binaryArray[26]+" ");
                bit6.setText(binaryArray[25]);
                bit7.setText(binaryArray[24]);
                bit8.setText(binaryArray[23]);
                bit9.setText(binaryArray[22]+" ");
                bit10.setText(binaryArray[21]);
                bit11.setText(binaryArray[20]);
                bit12.setText(binaryArray[19]);
                bit13.setText(binaryArray[18]+" ");
                bit14.setText(binaryArray[17]);
                bit15.setText(binaryArray[16]);
                bit16.setText(binaryArray[15]);
                bit17.setText(binaryArray[14]+" ");
                bit18.setText(binaryArray[13]);
                bit19.setText(binaryArray[12]);
                bit20.setText(binaryArray[11]);
                bit21.setText(binaryArray[10]+" ");
                bit22.setText(binaryArray[9]);
                bit23.setText(binaryArray[8]);
                bit24.setText(binaryArray[7]);
                bit25.setText(binaryArray[6]+" ");
                bit26.setText(binaryArray[5]);
                bit27.setText(binaryArray[4]);
                bit28.setText(binaryArray[3]);
                bit29.setText(binaryArray[2]+" ");
                bit30.setText(binaryArray[1]);
                bit31.setText(binaryArray[0]);
            }// else if 
          }// handle
        });//btnEqu
        
        //clears text field
        btnClr.setOnAction(new EventHandler<ActionEvent>(){
          public void handle(ActionEvent e){
            input.setText("");
            output.setText("");
                for (int i = 0; i < bitLabels.length; i++) {
                if(i%4==0){
                  bitLabels[i].setText("0 ");
                  }// if
                else{
                  bitLabels[i].setText("0");
                  }//else
                }//for
          }//handle
        });//btnClr
        
        //Backspace one character 
          btnDel.setOnAction(new EventHandler<ActionEvent>(){
          
            public void handle(ActionEvent e){
            String currentText = input.getText();
              if(currentText.substring(currentText.length()-1,currentText.length()).equals(" ")){
                
                input.setText(currentText.substring(0,currentText.length()-3));
              }//if
              else{
              
                
                input.setText(currentText.substring(0,currentText.length()-1));
              }//else
          }// handle
        });// btnDel
        
        // Hides Binary and shows Binary 
        btnBi.setOnAction(new EventHandler<ActionEvent>(){
          public void handle (ActionEvent e){
           
              
            if(!bit1.getText().equals("")){
              btnBi.setText("Show Binary");
                for (int i = 0; i < bitLabels.length; i++) {
                  bitLabels[i].setText("");
                }//for
            }//if
            
          else if(bit1.getText().equals("")){
          
            btnBi.setText("Hide Binary");
           String expression = input.getText();
              String[] infix = expression.split(" ");
              String[] postfix = ReversePolishNotation.infixToPostfix(infix);
              int result = ReversePolishNotation.evaluate(rm,postfix);
              String fResult = String.valueOf(result);
              output.setText(fResult);
              String[] binaryArray = new String[31];
              
                String binaryConversion = Integer.toBinaryString(result);
                int i =0;
                for(int y =binaryArray.length - binaryConversion.length(); y<binaryArray.length; y++){
                  binaryArray[y] = binaryConversion.substring(i ,i+1);
                  i++;
                }
                for(int x = 0; x< binaryArray.length-binaryConversion.length(); x++){ 
                  binaryArray[x] = "0";
                }
              for (int x = 0; x < bitLabels.length; x++) {
                bitLabels[x].setText(binaryArray[x]);
              }//for
          }//else if
          }// handle
        });//btnBi
        
         // shifts binary to left
        btnL.setOnAction(new EventHandler<ActionEvent>(){
          public void handle(ActionEvent e){
          
            for(int i = temp.length-1;i>0;i--){
             temp[i-1] = bitLabels[i].getText();
             } //for
             temp[temp.length-1] = "0";
            
                bit1.setText(temp[30].replace(" ",""));
                bit2.setText(temp[29].replace(" ",""));
                bit3.setText(temp[28].replace(" ",""));
                bit4.setText(temp[27].replace(" ",""));
                bit5.setText(temp[26].replace(" ","")+" ");
                bit6.setText(temp[25].replace(" ",""));
                bit7.setText(temp[24].replace(" ",""));
                bit8.setText(temp[23].replace(" ",""));
                bit9.setText(temp[22].replace("  ","")+" ");
                bit10.setText(temp[21].replace(" ",""));
                bit11.setText(temp[20].replace(" ",""));
                bit12.setText(temp[19].replace(" ",""));
                bit13.setText(temp[18].replace("  ","")+" ");
                bit14.setText(temp[17].replace(" ",""));
                bit15.setText(temp[16].replace(" ",""));
                bit16.setText(temp[15].replace(" ",""));
                bit17.setText(temp[14].replace("  ","")+" ");
                bit18.setText(temp[13].replace(" ",""));
                bit19.setText(temp[12].replace(" ",""));
                bit20.setText(temp[11].replace(" ",""));
                bit21.setText(temp[10].replace("  ","")+" ");
                bit22.setText(temp[9].replace(" ",""));
                bit23.setText(temp[8].replace(" ",""));
                bit24.setText(temp[7].replace(" ",""));
                bit25.setText(temp[6].replace("  ","")+" ");
                bit26.setText(temp[5].replace(" ",""));
                bit27.setText(temp[4].replace(" ",""));
                bit28.setText(temp[3].replace(" ",""));
                bit29.setText(temp[2].replace("  ","")+" ");
                bit30.setText(temp[1].replace(" ",""));
                bit31.setText(temp[0].replace(" ",""));
             
             String tempString = "";
            
              for(int h = 0; h<temp.length-1;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
             
              if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt*2;
             output.setText(Integer.toString(tempInt));
             }//else
            
          }//handle
        });//btnL
        
         // shifts binary to Right
        btnR.setOnAction(new EventHandler<ActionEvent>(){
          public void handle(ActionEvent e){
          
            for(int i =0;i<temp.length-1;i++){
             temp[i+1] = bitLabels[i].getText();
             } //for
             temp[0] = "0";
            
                bit1.setText(temp[30].replace(" ",""));
                bit2.setText(temp[29].replace(" ",""));
                bit3.setText(temp[28].replace(" ",""));
                bit4.setText(temp[27].replace(" ",""));
                bit5.setText(temp[26].replace(" ","")+" ");
                bit6.setText(temp[25].replace(" ",""));
                bit7.setText(temp[24].replace(" ",""));
                bit8.setText(temp[23].replace(" ",""));
                bit9.setText(temp[22].replace("  ","")+" ");
                bit10.setText(temp[21].replace(" ",""));
                bit11.setText(temp[20].replace(" ",""));
                bit12.setText(temp[19].replace(" ",""));
                bit13.setText(temp[18].replace("  ","")+" ");
                bit14.setText(temp[17].replace(" ",""));
                bit15.setText(temp[16].replace(" ",""));
                bit16.setText(temp[15].replace(" ",""));
                bit17.setText(temp[14].replace("  ","")+" ");
                bit18.setText(temp[13].replace(" ",""));
                bit19.setText(temp[12].replace(" ",""));
                bit20.setText(temp[11].replace(" ",""));
                bit21.setText(temp[10].replace("  ","")+" ");
                bit22.setText(temp[9].replace(" ",""));
                bit23.setText(temp[8].replace(" ",""));
                bit24.setText(temp[7].replace(" ",""));
                bit25.setText(temp[6].replace("  ","")+" ");
                bit26.setText(temp[5].replace(" ",""));
                bit27.setText(temp[4].replace(" ",""));
                bit28.setText(temp[3].replace(" ",""));
                bit29.setText(temp[2].replace("  ","")+" ");
                bit30.setText(temp[1].replace(" ",""));
                bit31.setText(temp[0].replace(" ",""));
             
             String tempString = "";
            
              for(int h = 0; h<temp.length-1;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt*2;
             output.setText(Integer.toString(tempInt));
             }//else
             
            
          }//handle
        });//btnR
 
        // toggles bit1 
        bit1.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit1.getText().equals("0")){
           bit1.setText("1");
           }//if
           else if (bit1.getText().equals("1")){
           bit1.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
             
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit1 toggle 
        
        // toggles bit2 
        bit2.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit2.getText().equals("0")){
           bit2.setText("1");
           }//if
           else if (bit2.getText().equals("1")){
           bit2.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
             
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit2 toggle 
        
      // toggles bit3 
        bit3.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit3.getText().equals("0")){
           bit3.setText("1");
           }//if
           else if (bit3.getText().equals("1")){
           bit3.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
             
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit3 toggle 
        
        // toggles bit4 
        bit4.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit4.getText().equals(" 0")){
           bit4.setText(" 1");
           }//if
           else if (bit4.getText().equals(" 1")){
           bit4.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit4 toggle 
        
        // toggles bit5 
        bit5.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit5.getText().equals("0")){
           bit5.setText("1");
           }//if
           else if (bit5.getText().equals("1")){
           bit5.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit5 toggle 
        
        // toggles bit6 
        bit6.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit6.getText().equals("0")){
           bit6.setText("1");
           }//if
           else if (bit6.getText().equals("1")){
           bit6.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit6 toggle 
        
        // toggles bit7 
        bit7.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit7.getText().equals("0")){
           bit7.setText("1");
           }//if
           else if (bit7.getText().equals("1")){
           bit7.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit7 toggle 
        
        // toggles bit8 
        bit8.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit8.getText().equals(" 0")){
           bit8.setText(" 1");
           }//if
           else if (bit8.getText().equals(" 1")){
           bit8.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit8 toggle 
        
        // toggles bit9 
        bit9.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit9.getText().equals("0")){
           bit9.setText("1");
           }//if
           else if (bit9.getText().equals("1")){
           bit9.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit9 toggle 
        
        // toggles bit10 
        bit10.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit10.getText().equals("0")){
           bit10.setText("1");
           }//if
           else if (bit10.getText().equals("1")){
           bit10.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit10 toggle 
        
        // toggles bit11 
        bit11.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit11.getText().equals("0")){
           bit11.setText("1");
           }//if
           else if (bit11.getText().equals("1")){
           bit11.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit11 toggle 
        
        // toggles bit12 
        bit12.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit12.getText().equals(" 0")){
           bit12.setText(" 1");
           }//if
           else if (bit12.getText().equals(" 1")){
           bit12.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit12 toggle 
        
        // toggles bit13 
        bit13.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit13.getText().equals("0")){
           bit13.setText("1");
           }//if
           else if (bit13.getText().equals("1")){
           bit13.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit13 toggle 
        
        // toggles bit14 
        bit14.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit14.getText().equals("0")){
           bit14.setText("1");
           }//if
           else if (bit14.getText().equals("1")){
           bit14.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit14 toggle 
        
        // toggles bit15 
        bit15.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit15.getText().equals("0")){
           bit15.setText("1");
           }//if
           else if (bit15.getText().equals("1")){
           bit15.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit15 toggle 
        
        // toggles bit16 
        bit16.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit16.getText().equals(" 0")){
           bit16.setText(" 1");
           }//if
           else if (bit16.getText().equals(" 1")){
           bit16.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit16 toggle 
        
        // toggles bit17 
        bit17.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit17.getText().equals("0")){
           bit17.setText("1");
           }//if
           else if (bit17.getText().equals("1")){
           bit17.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit17 toggle 
        
        // toggles bit18 
        bit18.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit18.getText().equals("0")){
           bit18.setText("1");
           }//if
           else if (bit18.getText().equals("1")){
           bit18.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit18 toggle 
        
         // toggles bit19 
        bit19.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit19.getText().equals("0")){
           bit19.setText("1");
           }//if
           else if (bit19.getText().equals("1")){
           bit19.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit19 toggle 
        
         // toggles bit20 
        bit20.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit20.getText().equals(" 0")){
           bit20.setText(" 1");
           }//if
           else if (bit20.getText().equals(" 1")){
           bit20.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit20 toggle 
        
         // toggles bit21 
        bit21.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit21.getText().equals("0")){
           bit21.setText("1");
           }//if
           else if (bit21.getText().equals("1")){
           bit21.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit21 toggle 
        
         // toggles bit22 
        bit22.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit22.getText().equals("0")){
           bit22.setText("1");
           }//if
           else if (bit22.getText().equals("1")){
           bit22.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit22 toggle 
        
         // toggles bit23 
        bit23.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit23.getText().equals("0")){
           bit23.setText("1");
           }//if
           else if (bit23.getText().equals("1")){
           bit23.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit23 toggle 
        
         // toggles bit24 
        bit24.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit24.getText().equals(" 0")){
           bit24.setText(" 1");
           }//if
           else if (bit24.getText().equals(" 1")){
           bit24.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit24 toggle 
        
         // toggles bit25 
        bit25.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit25.getText().equals("0")){
           bit25.setText("1");
           }//if
           else if (bit25.getText().equals("1")){
           bit25.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit25 toggle 
        
         // toggles bit26 
        bit26.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit26.getText().equals("0")){
           bit26.setText("1");
           }//if
           else if (bit26.getText().equals("1")){
           bit26.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit26 toggle 
        
         // toggles bit27 
        bit27.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit27.getText().equals("0")){
           bit27.setText("1");
           }//if
           else if (bit27.getText().equals("1")){
           bit27.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit27 toggle 
        
         // toggles bit28 
        bit28.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit28.getText().equals(" 0")){
           bit28.setText(" 1");
           }//if
           else if (bit28.getText().equals(" 1")){
           bit28.setText(" 0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit28 toggle 
        
         // toggles bit29 
        bit29.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit29.getText().equals("0")){
           bit29.setText("1");
           }//if
           else if (bit29.getText().equals("1"+" ")){
           bit29.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
             
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit29 toggle 
        
         // toggles bit30 
        bit30.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit30.getText().equals("0")){
           bit30.setText("1");
           }//if
           else if (bit30.getText().equals("1")){
           bit30.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit30 toggle 
        
         // toggles bit31 
        bit31.setOnMouseClicked((mouseEvent) -> {
           String s = output.getText();
           if(bit31.getText().equals("0")){
           bit31.setText("1");
           }//if
           else if (bit31.getText().equals("1")){
           bit31.setText("0");
           }//if 
           
           for (int i =0 ; i<bitLabels.length; i++) {
                  temp[i] =bitLabels[i].getText();
                }//for
            String tempString = "";
            
              for(int h = 0; h<temp.length;h++){
               
               tempString += temp[h].replaceAll("\\s+","");
             }
              tempString.replaceAll("\\s+","");
             
             int tempInt = Integer.parseInt(tempString, 2);
            
             if(tempString.equals("000000000000000000000000000000")){
             output.setText("1");
             }//if
             else{
              tempInt = tempInt;
             output.setText(Integer.toString(tempInt));
             }//else
        });// bit31 toggle 
        
  hbI.getChildren().addAll(input);
  hbO.getChildren().addAll(output);
  hbB.getChildren().addAll(bit31,bit30,bit29,bit28,bit27,bit26,bit25,bit24,bit23,bit22,bit21,bit20,bit19,bit18,bit17,bit16,bit15,bit14,bit13,bit12,bit11,bit10,bit9,bit8,bit7,bit6,bit5,bit4,bit3,bit2,bit1);
  hb.getChildren().addAll(btn7,btn8,btn9,btnDiv);
  hb2.getChildren().addAll(btn4,btn5,btn6,btnMul);
  hb3.getChildren().addAll(btn1,btn2,btn3,btnSub);
  hb4.getChildren().addAll(btn0,btnEqu,btnAdd);
  hb21.getChildren().addAll(btnFac,btnDel,btnClr);
  hb22.getChildren().addAll(btnEx,btnL,btnR);
  hb23.getChildren().addAll(btnRec);
  hb24.getChildren().addAll(btnBi);
  vb.getChildren().addAll(hb,hb2,hb3,hb4);
  vb2.getChildren().addAll(hb21,hb22,hb23,hb24);
  
  fp.getChildren().addAll(hbI,hbO,hbB,vb,vb2);
  
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(600);
        primaryStage.setMinHeight(500);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("CalcFX!");
        primaryStage.show();

    } // start

} // Driver


