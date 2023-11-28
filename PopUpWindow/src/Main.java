import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
    }
}
class Kalkulator implements ActionListener {

    final JFrame okienko = new JFrame();
    JPanel panel = new JPanel();
    JLabel wys = new JLabel("Wpisz działanie", SwingConstants.CENTER);
    JButton p1 = new JButton();
    JButton p2 = new JButton();
    JButton p3 = new JButton();
    JButton p4 = new JButton();
    JButton pDEL = new JButton();
    JButton p5 = new JButton();
    JButton p6 = new JButton();
    JButton p7 = new JButton();
    JButton p8 = new JButton();
    JButton pSUB = new JButton();
    JButton p9 = new JButton();
    JButton pPLUS = new JButton();
    JButton pDIV = new JButton();
    JButton p0 = new JButton();
    JButton pMULT = new JButton();
    JButton pEQ = new JButton();
    String wynik = String.valueOf(0);
    int a = 0;
    int rownanie = 0;
    int wynikRownania = 0;

    Kalkulator() {
        okienko.setTitle("Kalkulator");
        okienko.setPreferredSize(new Dimension(380, 410));
        okienko.add(panel);
        okienko.pack();
        okienko.setVisible(true);
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(wys);
        wys.setPreferredSize(new Dimension(360, 50));
        wys.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        panel.add(p1);
        p1.setText("1");
        p1.addActionListener(this);
        p1.setPreferredSize(new Dimension(70,70));

        panel.add(p2);
        p2.setText("2");
        p2.addActionListener(this);
        p2.setPreferredSize(new Dimension(70,70));

        panel.add(p3);
        p3.setText("3");
        p3.addActionListener(this);
        p3.setPreferredSize(new Dimension(70,70));

        panel.add(pDEL);
        pDEL.setText("DEL");
        pDEL.addActionListener(this);
        pDEL.setPreferredSize(new Dimension(70,70));

        panel.add(p4);
        p4.setText("4");
        p4.addActionListener(this);
        p4.setPreferredSize(new Dimension(70,70));

        panel.add(p5);
        p5.setText("5");
        p5.addActionListener(this);
        p5.setPreferredSize(new Dimension(70,70));

        panel.add(p6);
        p6.setText("6");
        p6.addActionListener(this);
        p6.setPreferredSize(new Dimension(70,70));

        panel.add(pSUB);
        pSUB.setText("-");
        pSUB.addActionListener(this);
        pSUB.setPreferredSize(new Dimension(70,70));

        panel.add(p7);
        p7.setText("7");
        p7.addActionListener(this);
        p7.setPreferredSize(new Dimension(70,70));

        panel.add(p8);
        p8.setText("8");
        p8.addActionListener(this);
        p8.setPreferredSize(new Dimension(70,70));

        panel.add(p9);
        p9.setText("9");
        p9.addActionListener(this);
        p9.setPreferredSize(new Dimension(70,70));

        panel.add(pPLUS);
        pPLUS.setText("+");
        pPLUS.addActionListener(this);
        pPLUS.setPreferredSize(new Dimension(70,70));

        panel.add(pDIV);
        pDIV.setText("➗");
        pDIV.addActionListener(this);
        pDIV.setPreferredSize(new Dimension(70,70));

        panel.add(p0);
        p0.setText("0");
        p0.addActionListener(this);
        p0.setPreferredSize(new Dimension(70,70));

        panel.add(pMULT);
        pMULT.setText("×");
        pMULT.addActionListener(this);
        pMULT.setPreferredSize(new Dimension(70,70));

        panel.add(pEQ);
        pEQ.setText("=");
        pEQ.addActionListener(this);
        pEQ.setPreferredSize(new Dimension(70,70));
    }

    @Override
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == p1) {
            if(Integer.parseInt(wynik) == 0) {
                wynik = "1";
            }else {
                wynik = wynik + "1";
            }
            wys.setText(wynik);
        } else if (e.getSource() == p2) {
            if(Integer.parseInt(wynik) == 0) {
                wynik = "2";
            }else {
                wynik = wynik + "2";
            }
            wys.setText(wynik);

        } else if (e.getSource() == p3) {
            if(Integer.parseInt(wynik) == 0) {
                wynik = "3";
            }else {
                wynik = wynik + "3";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p4) {
            if (Integer.parseInt(wynik) == 0) {
                wynik = "4";
            } else {
                wynik = wynik + "4";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p5) {
            if (Integer.parseInt(wynik) == 0) {
                wynik = "5";
            } else {
                wynik = wynik + "5";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p6) {
            if (Integer.parseUnsignedInt(wynik) == 0) {
                wynik = "6";
            } else {
                wynik = wynik + "6";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p7) {
            if (Integer.parseUnsignedInt(wynik) == 0) {
                wynik = "7";
            } else {
                wynik = wynik + "7";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p8) {
            if (Integer.parseUnsignedInt(wynik) == 0) {
                wynik = "8";
            } else {
                wynik = wynik + "8";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p9) {
            if (Integer.parseUnsignedInt(wynik) == 0) {
                wynik = "9";
            } else {
                wynik = wynik + "9";
            }
            wys.setText(wynik);
        }else if (e.getSource() == p0) {
            if (Integer.parseInt(wynik) == 0) {
                wynik = "0";
            } else {
                wynik = wynik + "0";
            }
            wys.setText(wynik);
        }else if (e.getSource() == pDEL) {
            wynik = String.valueOf(0);
            wys.setText(wynik);
            rownanie = 0;
        }else if (e.getSource() == pSUB) {
            a = Integer.parseInt(wynik);
            wynik = String.valueOf(0);
            rownanie = 1;
            wys.setText(wynik);
        }else if (e.getSource() == pPLUS) {
            a = Integer.parseInt(wynik);
            wynik = String.valueOf(0);
            rownanie = 2;
            wys.setText(wynik);
        }else if (e.getSource() == pDIV) {
            a = Integer.parseInt(wynik);
            wynik = String.valueOf(0);
            rownanie = 3;
            wys.setText(wynik);
        }else if (e.getSource() == pMULT) {
            a = Integer.parseInt(wynik);
            wynik = String.valueOf(0);
            rownanie = 4;
            wys.setText(wynik);
        }else if (e.getSource() == pEQ) {
            switch(rownanie){
                case 1:
                    wynikRownania = a - Integer.parseUnsignedInt(wynik);
                    wys.setText(String.valueOf(wynikRownania));
                    wynik = String.valueOf(wynikRownania);
                    rownanie = 0;
                    break;
                case 2:
                    wynikRownania = a + Integer.parseUnsignedInt(wynik);
                    wys.setText(String.valueOf(wynikRownania));
                    wynik = String.valueOf(wynikRownania);
                    rownanie = 0;
                    break;
                case 3:
                    wynikRownania = a / Integer.parseUnsignedInt(wynik);
                    wys.setText(String.valueOf(wynikRownania));
                    wynik = String.valueOf(wynikRownania);
                    rownanie = 0;
                    break;
                case 4:
                    wynikRownania = a * Integer.parseUnsignedInt(wynik);
                    wys.setText(String.valueOf(wynikRownania));
                    wynik = String.valueOf(wynikRownania);
                    rownanie = 0;
                    break;
            }
        }
    }
}