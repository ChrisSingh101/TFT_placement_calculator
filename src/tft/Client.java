
package tft;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Client extends JFrame{
    
    JLabel game1 = new JLabel("Enter game 1 placement");
        JLabel game2 = new JLabel("Enter game 2 placement");
        JLabel game3 = new JLabel("Enter game 3 placement");
        JLabel game4 = new JLabel("Enter game 4 placement");
        JLabel game5 = new JLabel("Enter game 5 placement");
        JTextField placement1 = new JTextField (10);
        JTextField placement2 = new JTextField (10);
        JTextField placement3 = new JTextField (10);
        JTextField placement4 = new JTextField (10);
        JTextField placement5 = new JTextField (10);
        JTextField result = new JTextField (10);
        
       
    
    public Client(){
        JLabel game1 = new JLabel("Enter game 1 placement");
        JLabel game2 = new JLabel("Enter game 2 placement");
        JLabel game3 = new JLabel("Enter game 3 placement");
        JLabel game4 = new JLabel("Enter game 4 placement");
        JLabel game5 = new JLabel("Enter game 5 placement");
        JLabel resultLabel = new JLabel("Average placement:");
        JTextField placement1 = new JTextField (10);
        JTextField placement2 = new JTextField (10);
        JTextField placement3 = new JTextField (10);
        JTextField placement4 = new JTextField (10);
        JTextField placement5 = new JTextField (10);
        JTextField result = new JTextField (10);
        
               
        
        JPanel flow1Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow2Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow3Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow4Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow5Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel flow6Panel = new JPanel (new FlowLayout (FlowLayout.CENTER));
        JPanel gridPanel  = new JPanel (new GridLayout (6, 0));
        
        flow1Panel.add(game1);
        flow1Panel.add(placement1);
        flow2Panel.add(game2);
        flow2Panel.add(placement2);
        flow3Panel.add(game3);
        flow3Panel.add(placement3);
        flow4Panel.add(game4);
        flow4Panel.add(placement4);
        flow5Panel.add(game5);
        flow5Panel.add(placement5);
        flow6Panel.add(resultLabel);
        flow6Panel.add(result);
        
        gridPanel.add (flow1Panel);
        gridPanel.add (flow2Panel);
        gridPanel.add (flow3Panel);
        gridPanel.add (flow4Panel);
        gridPanel.add (flow5Panel);
        gridPanel.add (flow6Panel);

        add (gridPanel, BorderLayout.NORTH);
        
        
        placement1.addActionListener((ActionEvent ae) -> {
            int input1 = Integer.parseInt(placement1.getText());
            double output = input1;
            result.setText(String.valueOf(output));   
            if(output<4.01){
            flow1Panel.setBackground(Color.green);
            flow2Panel.setBackground(Color.green);
            flow3Panel.setBackground(Color.green);
            flow4Panel.setBackground(Color.green);
            flow5Panel.setBackground(Color.green);
            flow6Panel.setBackground(Color.green);
        }
            else{
            flow1Panel.setBackground(Color.red);
            flow2Panel.setBackground(Color.red);
            flow3Panel.setBackground(Color.red);
            flow4Panel.setBackground(Color.red);
            flow5Panel.setBackground(Color.red);
            flow6Panel.setBackground(Color.red);
                
            }
        });
        

        
         placement2.addActionListener((ActionEvent ae) -> {
            double input1 = Integer.parseInt(placement1.getText());
            double input2 = Integer.parseInt(placement2.getText());
            double output = (input1 + input2)/2;
            Math.round((output * 1000d) / 1000d);
            result.setText(String.valueOf(output));
            if(output<4.01){
            flow1Panel.setBackground(Color.green);
            flow2Panel.setBackground(Color.green);
            flow3Panel.setBackground(Color.green);
            flow4Panel.setBackground(Color.green);
            flow5Panel.setBackground(Color.green);
            flow6Panel.setBackground(Color.green);
        }
            else{
            flow1Panel.setBackground(Color.red);
            flow2Panel.setBackground(Color.red);
            flow3Panel.setBackground(Color.red);
            flow4Panel.setBackground(Color.red);
            flow5Panel.setBackground(Color.red);
            flow6Panel.setBackground(Color.red);
                
            }
        });
         
         placement3.addActionListener((ActionEvent ae) -> {
            double input1 = Integer.parseInt(placement1.getText());
            double input2 = Integer.parseInt(placement2.getText());
            double input3 = Integer.parseInt(placement3.getText());
            double output = (input1 + input2 + input3)/3;
            output = Math.round(output * 1000d) / 1000d;
            result.setText(String.valueOf(output));
            if(output<4.01){
            flow1Panel.setBackground(Color.green);
            flow2Panel.setBackground(Color.green);
            flow3Panel.setBackground(Color.green);
            flow4Panel.setBackground(Color.green);
            flow5Panel.setBackground(Color.green);
            flow6Panel.setBackground(Color.green);
        }
            else{
            flow1Panel.setBackground(Color.red);
            flow2Panel.setBackground(Color.red);
            flow3Panel.setBackground(Color.red);
            flow4Panel.setBackground(Color.red);
            flow5Panel.setBackground(Color.red);
            flow6Panel.setBackground(Color.red);
                
            }
            
        });
         
         placement4.addActionListener((ActionEvent ae) -> {
            double input1 = Integer.parseInt(placement1.getText());
            double input2 = Integer.parseInt(placement2.getText());
            double input3 = Integer.parseInt(placement3.getText());
            double input4 = Integer.parseInt(placement4.getText());
            double output = (input1 + input2 + input3 + input4)/4;
            output = Math.round(output * 1000d) / 1000d;
            result.setText(String.valueOf(output));
            if(output<4.01){
            flow1Panel.setBackground(Color.green);
            flow2Panel.setBackground(Color.green);
            flow3Panel.setBackground(Color.green);
            flow4Panel.setBackground(Color.green);
            flow5Panel.setBackground(Color.green);
            flow6Panel.setBackground(Color.green);
        }
            else{
            flow1Panel.setBackground(Color.red);
            flow2Panel.setBackground(Color.red);
            flow3Panel.setBackground(Color.red);
            flow4Panel.setBackground(Color.red);
            flow5Panel.setBackground(Color.red);
            flow6Panel.setBackground(Color.red);
                
            }
        });
         
         placement5.addActionListener((ActionEvent ae) -> {
            double input1 = Integer.parseInt(placement1.getText());
            double input2 = Integer.parseInt(placement2.getText());
            double input3 = Integer.parseInt(placement3.getText());
            double input4 = Integer.parseInt(placement4.getText());
            double input5 = Integer.parseInt(placement5.getText());
            double output = (input1 + input2 + input3 + input4 + input5)/5;
            output = Math.round(output * 1000d) / 1000d;
            result.setText(String.valueOf(output));
            if(output<4.01){
            flow1Panel.setBackground(Color.green);
            flow2Panel.setBackground(Color.green);
            flow3Panel.setBackground(Color.green);
            flow4Panel.setBackground(Color.green);
            flow5Panel.setBackground(Color.green);
            flow6Panel.setBackground(Color.green);
        }
            else{
            flow1Panel.setBackground(Color.red);
            flow2Panel.setBackground(Color.red);
            flow3Panel.setBackground(Color.red);
            flow4Panel.setBackground(Color.red);
            flow5Panel.setBackground(Color.red);
            flow6Panel.setBackground(Color.red);
                
            }
        });
        
        
        
        
        }
       
        
    }
    
  

