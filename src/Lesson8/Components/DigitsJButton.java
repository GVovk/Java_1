package Lesson8.Components;

import javax.swing.*;
import java.awt.*;

public class DigitsJButton extends JButton { // В этой кнопке наследуемся от обычной JButton
    public DigitsJButton(String text) {        //создавая экземпляр JButton расшарим конструктор с текстом (левый Alt+insert) и в нем будем указывать различные свойства для кнопки
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 25)); //Задаем шрифт и размер
        setBackground(new Color(190, 189, 189));          //Задаем цвет кнопок

    }


}
