import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForms extends JFrame  {
    private JPanel panel1;
    private JButton mojeKontoButton;
    private JButton wsteczButton;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JList list1;
    private JList list2;
    private JPanel zdj;

    public static void main(String[] args) {
        MainForms form = new MainForms();
        form.setVisible(true);
}
    public MainForms() {

        super("Wypo\u017Cczalnia Sprz\u0119tu elektronicznego");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(1000, 900);
        //JFrame MainForms = new JFrame();
        //JDialog MainFormsLogowanie = new JDialog();
        //Image getIconImage(thumbnail_logotyp.png);

        //MainFormsLogowanie.setContentPane(MainForms);

//setLayout((MainForms)mojeKontoButton);
        mojeKontoButton.addActionListener(new ActionListener() {
            private void actionPerformed2(ActionEvent k) {

                //mojeKontoButton.setText("logowanie ");

                //JOptionPane.showInputDialog(MainFormsLogowanie);
                JOptionPane.showMessageDialog(null,"Logowanie");

                    //Object MainFormsLogowanie = new Object();
                    //getContentPane(MainFormsLogowanie);

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.printf("Logowanie");
                mojeKontoButton.addActionListener(this::actionPerformed2);
                class logowanie extends MainFormsLogowanie{
                    private String login;
                    private String password;
                }
            }
        });
        //zdj.addComponentListener(new ComponentAdapter() {
           // @Override
           // public void componentShown(ComponentEvent e) {
            //    super.componentShown(e);
            //    labelFoto.setIcon(thumbnail_logotyp.png)
         //   }
      //  });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mojeKontoButton.setText("produkty ");
                JOptionPane.showMessageDialog(null,"Produkty"+"\nPiotr"+"\n2"+"\ntrue");

               class Equipment extends MainFormsLogowanie {
                    private String name;
                    private String id;
                    private boolean available;

                    public Equipment(String name, String id) {
                        this.name = name;
                        this.id = id;
                        this.available = true;
                    }
                public String getName() {
                    return name;
                }

                public String getId() {
                    return id;
                }

                public boolean isAvailable() {
                    return available;
                }
                   public void setAvailability(boolean available) {
                       this.available = available;
                   }
               }
            }

        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mojeKontoButton.setText("logowanie ");
                JOptionPane.showMessageDialog(null,"Kontakt");
                class odzil extends MainFormsLogowanie{
                    private String City;
                    private String phone_number;
                    private String adress_email;

                    public String getCity() {
                        return City;
                    }

                    public void setCity(String city) {
                        City = city;
                    }

                    public String getPhone_number() {
                        return phone_number;
                    }

                    public void setPhone_number(String phone_number) {
                        this.phone_number = phone_number;
                    }

                    public String getAdress_email() {
                        return adress_email;
                    }

                    public void setAdress_email(String adress_email) {
                        this.adress_email = adress_email;
                    }
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mojeKontoButton.setText("logowanie ");
                JOptionPane.showMessageDialog(null,"KLienci");
                class customers extends MainFormsLogowanie{
                    private String name;
                    private String lastname;

                    public String getPhone_number() {
                        return phone_number;
                    }

                    public void setPhone_number(String phone_number) {
                        this.phone_number = phone_number;
                    }

                    public String getAdress() {
                        return adress;
                    }

                    public void setAdress(String adress) {
                        this.adress = adress;
                    }

                    public String getLastname() {
                        return lastname;
                    }

                    public void setLastname(String lastname) {
                        this.lastname = lastname;
                    }

                    @Override
                    public String getName() {
                        return name;
                    }

                    @Override
                    public void setName(String name) {
                        this.name = name;
                    }

                    private String adress;
                    private String phone_number;
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mojeKontoButton.setText("logowanie ");
                JOptionPane.showMessageDialog(null,"Cennik");
                class price extends MainFormsLogowanie{
                    private String name1;

                    public void setName1(String name1) {
                        this.name1 = name1;
                    }

                    public String getName1() {
                        return name1;
                    }

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }

                    private String price;

                    public String getPrice() {
                        return price;
                    }

                    public void setPrice(String price) {
                        this.price = price;
                    }

                    public price(String name1) {
                        this.name1 = name1;
                    }
                }
            }
        });
    }


}
