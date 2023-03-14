package Lesson8.Components;

import javax.swing.*;
import java.awt.*;

//копируем класс DigitsJButton и на его основе делаем OperatorJButton. Меняем цвет и размер текста
public class OperatorJButton extends JButton { // В этой кнопке наследуемся от обычной JButton
    public OperatorJButton(String text) {        //создавая экземпляр JButton расшарим конструктор с текстом (левый Alt+insert) и в нем будем указывать различные свойства для кнопки
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 30)); //Задаем шрифт и размер
        setBackground(new Color(241, 219, 219));          //Задаем цвет кнопок

    }


}
