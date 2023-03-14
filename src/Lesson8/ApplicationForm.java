package Lesson8;

import Lesson8.Components.DigitsJButton;
import Lesson8.Components.OperatorJButton;
import Lesson8.listeners.ButtonListener;
import Lesson8.listeners.ClearFieldButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApplicationForm extends JFrame {

    private JTextField inputField;

    public ApplicationForm(String title) {
        super(title);
        setBounds(1200, 350, 250, 370); //устанавливает размещение графического объекта в пространстве (координату x/y) и задает размеры самого объекта (окна)

        setDefaultCloseOperation(EXIT_ON_CLOSE); //По умолчанию, при нажатии на кнопку закрыть срабатывает дефолтный оператор. Ctrl+Space и можно выбрать вариант дефолтной работы оператора, т.к. при закрытии приложения (окна калькулятора) оно продолжало работать

        setAlwaysOnTop(true); //Приложение будет всегда поверх других окон

        setLayout(new BorderLayout());

        add(createTopPanel(), BorderLayout.NORTH); //Создаем метод для самой верхней панели

        setJMenuBar(createMenu());

        add(createCenterPanel(), BorderLayout.CENTER); //Метод для центральной панели

      //  add(new Button("Кнопка"), BorderLayout.EAST); //Добавляет кнопку справа
      //  add(new Button("Toje knopka"), BorderLayout.WEST); //Добавляет кнопку слева

        setVisible(true);
    }

    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar(); //Создает меню
        JMenu menuFile = new JMenu("File"); //Создает объекты в меню
        JMenuItem clear = new JMenuItem("Clear"); // вынесли в отдельную переменную
        clear.addActionListener(new ClearFieldButtonListener(inputField)); // добавили слушателя
        menuFile.add(clear);                                                //добавили к меню
        menuFile.add(new JMenuItem("Exit")); //Добавит подпункты меню в File


        menuBar.add(menuFile); //Добавляет меню File в наше меню Bar

        menuBar.add(new JMenuItem("Help")); //Создает новый объект в меню
        menuBar.add(new JMenuItem("About")); //Создает новый объект в меню
        menuBar.add(new JMenuItem("Exit")); //Создает новый объект в меню

        return menuBar;
    }

    private JPanel createTopPanel() {       //Будет содержать поле ввода для примеров
        JPanel top = new JPanel();          //Создаем саму панель где будем вводить цифры
        top.setLayout(new BorderLayout());  //указываем для этой панели setLayout в виде самого простого BorderLayout - 5 сторон
        //Создаем поле для ввода
        inputField = new JTextField();
        inputField.setEditable(false);          //ставим запрет на изменения, чтобы цифры вводились только с кнопок
        top.add(inputField);   //добавляем к панели данный inputField

        inputField.setFont(new Font("Arial", Font.PLAIN, 25));    //указываем стиль и расзмер шрифта в окне ввода
        inputField.setMargin(new Insets(8, 0, 8, 0));                 //устанавливаем отступы снаружи, величина отступов это тоже экземпляр
        inputField.setBackground(new Color(250, 220, 204));    //устанавливаем цвет фона rgb

//        inputField.setText("1+2=3");

        return top;
    }

    private JPanel createCenterPanel() {          //Выводит все содержимое панели состоящей из кнопок (и цифры и операторы вычисления)
        JPanel centerPanel = new JPanel(); //Создаем эту самую центральную панель
        centerPanel.setLayout(new BorderLayout());


        ActionListener buttonListener = new ButtonListener(inputField);

        centerPanel.add(createDigitsPanel(buttonListener), BorderLayout.CENTER); //Кнопки - цифры
        centerPanel.add(createOperatorPanel(buttonListener), BorderLayout.WEST); //Кнопки - операторы вычисления

        return centerPanel; //Эту панель возвращам обратно чтобы прикрепить к главному JFrame-у
    }

    private JPanel createDigitsPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();

        digitsPanel.setLayout(new GridLayout(4, 3));  // Устанавливаем сетку из чисел (количество строк, количество колонок)
        for (int i = 0; i < 10; i++) {                //Цикл. Набираем for и выбираем значения от 0 до 10
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i+1); //Цикл. Переменная String которая называется buttonTitle. Начинаем номерацио с i+1, т.е (0+1)=1, когда доходит до 9, превращается в 0. В этом поможет .
            //“Тернарный” в переводе означает “тройной”. Это альтернатива условному оператору if-else.
            //Вначале в коде записывается условие, после которого ставится вопросительный знак. Далее следует первый результат. Он срабатывает в случае, если условие возвращает true, то есть является истинным.
            //Далее следует оператор “:” , после которого записывается второй результат. Он срабатывает в случае, если условие возвращает false, то есть является ложным.
            JButton btn = new DigitsJButton(buttonTitle);
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);
        }
            JButton calc = new OperatorJButton("=");    //Добавляем новую кнопку "="
            digitsPanel.add(calc);                      //добавляем на панель с операторами новую кнопку "="
            calc.setEnabled(false);                     //Пока на время отключим кнопку

            JButton clear = new OperatorJButton("C");    //Добавляем новую кнопку "C"
            clear.addActionListener(new ClearFieldButtonListener(inputField));
            digitsPanel.add(clear);                      //добавляем на панель с операторами новую кнопку "C"


//        JButton btn = new JButton();
//        digitsPanel.add(btn);
        return digitsPanel;
    }

    private JPanel createOperatorPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton minus = new OperatorJButton("-");    //Добавляем новую кнопку "-"
        minus.addActionListener(buttonListener);
        panel.add(minus);                            //добавляем на панель с операторами новую кнопку "-"

        JButton plus = new OperatorJButton("+");     //Добавляем новую кнопку "+"
        plus.addActionListener(buttonListener);
        panel.add(plus);                             //добавляем на панель с операторами новую кнопку "+"

        JButton multiply = new OperatorJButton("x");     //Добавляем новую кнопку "x"
        multiply.addActionListener(buttonListener);
        panel.add(multiply);                             //добавляем на панель с операторами новую кнопку "x"

        JButton divide = new OperatorJButton("/");     //Добавляем новую кнопку "/"
        divide.addActionListener(buttonListener);
        panel.add(divide);                             //добавляем на панель с операторами новую кнопку "/"

        return panel;                                  //после Alt+Enter по 'createOperatorsPanel() строка 51' когда создается метод, нажимаем еще раз Enter чтобы создалась эта строка
    }
}
