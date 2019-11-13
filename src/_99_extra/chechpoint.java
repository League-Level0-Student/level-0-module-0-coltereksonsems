package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class chechpoint {
public static void main(String[] args) {
String color = JOptionPane.showInputDialog("what is your favorite color?");
 JOptionPane.showMessageDialog(null,  color + "my favorite color too!");
 Robot PTT = new Robot();
 PTT.penDown();
 PTT.setSpeed(100);
 PTT.move(100);
 PTT.turn(120);
 PTT.move(100);
 PTT.turn(120);
 PTT.move(100);
}
}
