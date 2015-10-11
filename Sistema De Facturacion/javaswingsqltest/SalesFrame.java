package javaswingsqltest;


import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SalesFrame extends JFrame{

    JMenuBar menuBar;
    JMenu main,client,product;

    public SalesFrame(){

        main = new JMenu("Main");
        client = new JMenu("Client");
        product = new JMenu("Product");
        menuBar = new JMenuBar();

        menuBar.add(main);
        menuBar.add(client);
        menuBar.add(product);

        setJMenuBar(menuBar);
        setTitle("Sales");
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

        product.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                ProductFrame product = new ProductFrame();
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
