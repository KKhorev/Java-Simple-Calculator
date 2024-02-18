
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //a+b
        JFrame window = new JFrame("a+b");
        window.setBounds(2250,650,400,300);
        window.setLayout(null);
        //поля ввода
        JTextField a_Field = new JTextField();
        JTextField b_Field = new JTextField();
        a_Field.setBounds(10,0,150,50);
        b_Field.setBounds(10,70,150,50);
        window.add(a_Field);
        window.add(b_Field);
        //конпка
        JButton button = new JButton("Сумма 😊");
        button.setBounds(10,140,150,50);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        window.add(button);

        button.setVisible(true);
        //Надпись
        JLabel label = new JLabel("Здесь будет сумма! ");
        label.setBounds(5,200,150,50);
        window.add(label);
        //Обработка нажатия
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = 0,b = 0;
                boolean a_ok = false, b_ok = false;
                try {
                    a = Integer.parseInt(a_Field.getText());
                    a_ok = true;
                }
                catch (Exception err){
                  JOptionPane.showMessageDialog(null,"В поле введено некорректное значение");
                };
                try {
                    b = Integer.parseInt(b_Field.getText());
                    b_ok = true;
                }
                catch (Exception err){
                    JOptionPane.showMessageDialog(null,"В поле введено некорректное значение");
                };
                if (a_ok && b_ok) label.setText(a + b + "👍");
                else label.setText("Сложение не удалось😢");

            }
        };
        button.addActionListener(actionListener);

        window.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("icon.png")));
        window.setVisible(true);
        window.setResizable(false);
    }
}