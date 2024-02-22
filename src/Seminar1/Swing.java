package Seminar1;

import javax.swing.*;

public class Swing {

    static void SwingDemo(){
        JFrame jfrm = new JFrame("Простое приложение Swing"); //Создание контейнера.
        jfrm.setSize(350,100); //Настройка размеров контейнера.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Прекращение выполнения программы при её закрытии.

        jfrm.setLocationRelativeTo(null); //Оасположение окна программы по центру экранна.
        JLabel jlab = new JLabel("Программирование интерфейса с помощью Swing"); //Добавление метки Swing.
        jfrm.add(jlab); //Добавление метки на панель содержимого.
        jfrm.setVisible(true); //Отобразить фрейм

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //Создаем фрейм в потоке диспетчеризации событий.
            @Override
            public void run() {
                SwingDemo();
            }
        });

    }
}
