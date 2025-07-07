import javax.swing.*;

public class NotepadApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Notepad");
        JTextArea area = new JTextArea();
        frame.add(area);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}