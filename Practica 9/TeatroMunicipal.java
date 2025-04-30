package Practica9;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;


public class TeatroMunicipal {

    private JFrame frame;
    private JTextField txtNumero;
    private JTextField txtDias;
    private JLabel lblResultado;
    private JRadioButton rdbtnPalco, rdbtnPlatea, rdbtnGaleria;
    private ButtonGroup grupoOpciones;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TeatroMunicipal window = new TeatroMunicipal();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TeatroMunicipal() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame("Teatro Municipal");
        frame.setBounds(100, 100, 450, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblTitulo = new JLabel("Teatro Municipal");
        lblTitulo.setForeground(Color.BLUE);
        lblTitulo.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 27));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(91, 11, 255, 30);
        frame.getContentPane().add(lblTitulo);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Datos del Boleto"));
        panel.setBounds(20, 39, 400, 150);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        rdbtnPalco = new JRadioButton("Palco");
        rdbtnPalco.setBounds(30, 20, 70, 23);
        rdbtnPalco.setSelected(true);
        panel.add(rdbtnPalco);

        rdbtnPlatea = new JRadioButton("Platea");
        rdbtnPlatea.setBounds(152, 20, 70, 23);
        panel.add(rdbtnPlatea);

        rdbtnGaleria = new JRadioButton("Galería");
        rdbtnGaleria.setBounds(270, 20, 80, 23);
        panel.add(rdbtnGaleria);

        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(rdbtnPalco);
        grupoOpciones.add(rdbtnPlatea);
        grupoOpciones.add(rdbtnGaleria);

        JLabel lblNumero = new JLabel("Número:");
        lblNumero.setBounds(30, 60, 60, 20);
        panel.add(lblNumero);

        txtNumero = new JTextField("1");
        txtNumero.setBounds(200, 60, 60, 20);
        panel.add(txtNumero);
        txtNumero.setColumns(10);

        JLabel lblDias = new JLabel("Cant. Días para el Evento:");
        lblDias.setBounds(30, 90, 180, 20);
        panel.add(lblDias);

        txtDias = new JTextField();
        txtDias.setBounds(200, 90, 60, 20);
        panel.add(txtDias);
        txtDias.setColumns(10);

        JButton btnVender = new JButton("Vende");
        btnVender.setBackground(SystemColor.textHighlight);
        btnVender.setBounds(90, 114, 100, 25);
        panel.add(btnVender);
        
                JButton btnSalir = new JButton("Salir");
                btnSalir.setBackground(new Color(255, 0, 0));
                btnSalir.setBounds(248, 114, 100, 25);
                panel.add(btnSalir);
                
                        btnSalir.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.dispose();
                            }
                        });
        
                // Eventos
                        btnVender.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int numero = Integer.parseInt(txtNumero.getText());
                                    int diasAnticipacion = 0;
                                    if (!txtDias.getText().isEmpty()) {
                                        diasAnticipacion = Integer.parseInt(txtDias.getText());
                                    }

                                    Boleto boleto = null;

                                    if (rdbtnPalco.isSelected()) {
                                        boleto = new Palco(numero);
                                    } else if (rdbtnPlatea.isSelected()) {
                                        boleto = new Platea(numero, diasAnticipacion);
                                    } else if (rdbtnGaleria.isSelected()) {
                                        boleto = new Galeria(numero, diasAnticipacion);
                                    }

                                    lblResultado.setText(boleto.toString());

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(frame, "Datos inválidos");
                                }
                            }
                        });

        lblResultado = new JLabel(" ");
        lblResultado.setFont(new Font("Perpetua Titling MT", Font.BOLD, 15));
        lblResultado.setBackground(Color.BLUE);
        lblResultado.setBounds(116, 218, 275, 69);
        frame.getContentPane().add(lblResultado);
    }
}
