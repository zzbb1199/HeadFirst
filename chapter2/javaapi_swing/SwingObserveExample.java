package observe.javaapi_swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserveExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserveExample example = new SwingObserveExample();
        example.go();
    }
    public void go(){
        frame = new JFrame();

        JButton button = new JButton("should I do it?");
        button.addActionListener(new Angellistener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER,button);
    }

    class Angellistener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it");
        }
    }

    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, do it");
        }
    }
}
