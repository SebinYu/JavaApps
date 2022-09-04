package counter;

import javax.swing.*;
import java.awt.event.*;

public class Counter implements ActionListener{

    JFrame frame;
    JTextField textField;
    JButton buttonPlus;
    JButton buttonMin;


    public int count = 0;

    Counter(){
        frame = new JFrame("counter.Counter App");
        frame.setSize(420,250);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(195, 25, 100, 60);
        textField.setBorder(null);
        textField.setEditable(false);

        buttonPlus = new JButton("UP");
        buttonPlus.setBounds(120,80,80,50);
        buttonPlus.addActionListener(this);

        buttonMin = new JButton("DOWN");
        buttonMin.setBounds(200,80,80,50);
        buttonMin.addActionListener(this);


        frame.add(textField);
        frame.add(buttonPlus);
        frame.add(buttonMin);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==buttonPlus) {
            count += 1;
            textField.setText(count+"");
        }
        if(e.getSource()==buttonMin)
            count -= 1;
            textField.setText(count+"");
    }



    public static void main(String[] args) {
        Counter counter = new Counter();
    }
}
