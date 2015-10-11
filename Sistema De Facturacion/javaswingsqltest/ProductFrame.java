package javaswingsqltest;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProductFrame extends JFrame{

    JMenuBar menuBar;
    JMenu main,client,sales;

    public ProductFrame(){

        main = new JMenu("Main");
        client = new JMenu("Client");
        sales = new JMenu("Sales");
        menuBar = new JMenuBar();

        menuBar.add(main);
        menuBar.add(client);
        menuBar.add(sales);

        setJMenuBar(menuBar);
        setTitle("Products");
        setSize(600, 400);
        setVisible(true);

        main.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                MainFrame main = new MainFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        client.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                ClientFrame client = new ClientFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        sales.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                SalesFrame product = new SalesFrame();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

}
