package Lesson8.listeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFieldButtonListener implements ActionListener {
    private JTextField inputField;  //Чтобы ActionListener можно было прикреплять к кнопке,необходимо имплементировать/присвоить специальный интерфейс
    //Интерфейс - некоторый контракт на исполнение, очень похож на абстрактный класс где есть только лишь абстрактные методы. Alt+Enter по ActionListener и вызываем метод

    public ClearFieldButtonListener(JTextField inputField) { //Alt+Enter по inputField создадим поле для него
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     inputField.setText("");
    }
}
