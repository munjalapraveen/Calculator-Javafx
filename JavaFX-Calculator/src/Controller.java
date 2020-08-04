
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.lang.Math;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

    int data = 0;
    int operation = -1;
    ArrayList<Integer>inp=new ArrayList<>();

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mult;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button AC;

    @FXML
    private Button seven;

    @FXML
    private Label label;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;
    @FXML
    private Button cube;


    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button Sin;
    @FXML
    private Button Cos;
    @FXML
    private Button Tan;
    @FXML
    private Button Log;
    @FXML
    private Button Sinh;
    @FXML
    private Button Cosh;
    @FXML
    private Button Tanh;
    @FXML
    private Button x2;
    @FXML
    private Button x3;
    @FXML
    private Button Log10;

    @FXML
    private Button mod;
    @FXML
    private Button sqrt;
    @FXML
    private Button inv;

    @FXML
    void handleButtonAction(ActionEvent event)
    {
        if (event.getSource() == one)
        {
            display.setText(display.getText() + "1");
        }
        else if (event.getSource() == two)
        {
            display.setText(display.getText() + "2");
        }
        else if (event.getSource() == three)
        {
            display.setText(display.getText() + "3");
        }
        else if (event.getSource() == four)
        {
            display.setText(display.getText() + "4");
        }
        else if (event.getSource() == five)
        {
            display.setText(display.getText() + "5");
        }
        else if (event.getSource() == six)
        {
            display.setText(display.getText() + "6");
        }
        else if (event.getSource() == seven)
        {
            display.setText(display.getText() + "7");
        }
        else if (event.getSource() == eight)
        {
            display.setText(display.getText() + "8");
        }
        else if (event.getSource() == nine)
        {
            display.setText(display.getText() + "9");
        }
        else if (event.getSource() == zero)
        {
            display.setText(display.getText() + "0");
        }
        else if (event.getSource() == AC)
        {
            display.setText(" git");
        }
        else if (event.getSource() == plus)
        {
            data = Integer.parseInt(display.getText());
            operation = 1; //Addition
            display.setText("");
        }
        else if (event.getSource() == minus)
        {
            data = Integer.parseInt(display.getText());
            operation = 2; //Substraction
           display.setText("");
        }
        else if (event.getSource() == mult)
        {
            data = Integer.parseInt(display.getText());
            operation = 3; //Mul
            display.setText("");
        }
        else if (event.getSource() == div)
        {
            data = Integer.parseInt(display.getText());
            operation = 4; //Division
            display.setText("");
        }
        else if(event.getSource()==Sin){
           double data1=Double.parseDouble (display.getText());
            double rad=Math.toRadians(data1);
            display.setText(String.valueOf(Math.sin(rad)));

        }
        else if(event.getSource()==Cos){
            double data1=Double.parseDouble (display.getText());
            double rad=Math.toRadians(data1);
            display.setText(String.valueOf(Math.cos(rad)));
        }
        else if(event.getSource()==Tan){
            double data1=Double.parseDouble (display.getText());
            double rad=Math.toRadians(data1);
            display.setText(String.valueOf(Math.tan(rad)));
        }
        else if(event.getSource()==Sinh){
            double data1=Double.parseDouble (display.getText());
            double rad=Math.toRadians(data1);
            display.setText(String.valueOf(Math.sinh(rad)));

        }
        else if(event.getSource()==Cosh){
            double data1=Double.parseDouble (display.getText());
            double rad=Math.toRadians(data1);
            display.setText(String.valueOf(Math.cosh(rad)));
        }
        else if(event.getSource()==Tanh){
            double data1=Double.parseDouble (display.getText());
            double rad=Math.toRadians(data1);
            display.setText(String.valueOf(Math.tanh(rad)));
        }
        else if(event.getSource()==Log){
            // data=Integer.parseInt (display.getText());
            display.setText(String.valueOf(Math.log(Double.valueOf(display.getText()).doubleValue())));
        }

        else if(event.getSource()==Log10){
            // data=Integer.parseInt (display.getText());
            display.setText(String.valueOf(Math.log10(Double.valueOf(display.getText()).doubleValue())));
        }
        else if(event.getSource()==sqrt){

            display.setText(String.valueOf(Math.sqrt(Double.valueOf(display.getText()).doubleValue())));
        }
        else if(event.getSource()==inv){
            display.setText(String.valueOf(Math.pow(Double.valueOf(display.getText()).doubleValue(),-1)));
        }
        else if(event.getSource()==mod){
            data = Integer.parseInt(display.getText());
           operation=5;
            display.setText("");
        }
        else if(event.getSource()==x2){

            display.setText(String.valueOf(Math.pow(Double.valueOf(display.getText()).doubleValue(),2)));
        }
        else if(event.getSource()==x3){

            display.setText(String.valueOf(Math.pow(Double.valueOf(display.getText()).doubleValue(),3)));
        }
        else if(event.getSource()==cube){
            display.setText(String.valueOf(Math.cbrt(Double.valueOf(display.getText()).doubleValue())));
        }
        else if (event.getSource() == equals)
        {
            int secondOperand = Integer.parseInt(display.getText());

            switch (operation) {
                case 1: //Addition
                    int ans = data + secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 2: //Subtraction
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 3: //Mul
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
                case 4: //Div
                    ans = 0;
                    try {
                        ans = data / secondOperand;
                    } catch (Exception e) {
                        display.setText("Error");
                    }
                    display.setText(String.valueOf(ans));
                    break;
                case 5:
                    ans =data%secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
      //
    }
}
