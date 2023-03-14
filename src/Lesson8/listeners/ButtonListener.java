package Lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField inputField;  //Чтобы ActionListener можно было прикреплять к кнопке,необходимо имплементировать/присвоить специальный интерфейс
    //Интерфейс - некоторый контракт на исполнение, очень похож на абстрактный класс где есть только лишь абстрактные методы. Alt+Enter по ActionListener и вызываем метод

    public ButtonListener(JTextField inputField) { //Alt+Enter по inputField создадим поле для него
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {        // при нажатии на кнопку должен сработать слушатель и на поле ввода разместить текст, который находится в самой кнопке
    JButton btn = (JButton) e.getSource();
    inputField.setText(inputField.getText() + " " + btn.getText());
    }

}
