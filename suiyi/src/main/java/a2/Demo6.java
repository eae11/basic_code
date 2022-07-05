package a2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class DateTest extends JFrame {

    private final JPanel contentPane;
    private final JTextField textField;
    private final JTextField textField_1;
    private final JTextField textField_2;
    private final JTextField textField_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DateTest frame = new DateTest();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public DateTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("\u5E74\uFF1A");
        lblNewLabel.setBounds(27, 50, 54, 15);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("\u6708\uFF1A");
        lblNewLabel_1.setBounds(27, 92, 54, 15);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("\u65E5\uFF1A");
        lblNewLabel_2.setBounds(27, 143, 54, 15);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("\u8D2D\u4E70\u65E5\u671F");
        lblNewLabel_3.setBounds(27, 7, 54, 15);
        contentPane.add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(53, 47, 66, 21);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(53, 89, 66, 21);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(53, 140, 66, 21);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewLabel_4 = new JLabel("\u5C0A\u656C\u7684\u987E\u5BA2,\u672C\u5E97\u627F\u8BFA\u552E\u51FA\u5546\u54C1\u4E24\u5929\u5185\u65E0\u7406\u7531\u9000\u6362,");
        lblNewLabel_4.setBounds(140, 44, 284, 21);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("\u8BF7\u4FDD\u5B58\u597D\u5305\u88C5\u548C\u53D1\u7968\u3002\u5982\u679C\u786E\u9700\u9000\u6362,\u8BF7\u4E8E");
        lblNewLabel_5.setBounds(139, 65, 274, 15);
        contentPane.add(lblNewLabel_5);

        textField_3 = new JTextField();
        textField_3.setEnabled(false);
        textField_3.setEditable(false);
        textField_3.setBounds(137, 89, 76, 21);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("\u524D\u8FDB\u884C\u3002");
        lblNewLabel_6.setBounds(223, 92, 54, 15);
        contentPane.add(lblNewLabel_6);

        JButton btnNewButton = new JButton("\u63D0\u4EA4");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int year = Integer.parseInt(textField.getText());
                int month = Integer.parseInt(textField_1.getText());
                int day = Integer.parseInt(textField_2.getText());

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    if (month == 2) {
                        if (1 <= day && day <= 29) {
                            check(year, month, day);
                        } else {
                            JOptionPane.showMessageDialog(null, "输入的日期不正确", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        if (1 <= day && day <= 31) {
                            check(year, month, day);
                        } else {
                            JOptionPane.showMessageDialog(null, "输入的日期不正确", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (1 <= day && day <= 30) {
                            check(year, month, day);
                        } else {
                            JOptionPane.showMessageDialog(null, "输入的日期不正确", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "输入的月份不正确", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    if (month == 2) {
                        if (1 <= day && day <= 28) {
                            check(year, month, day);
                        } else {
                            JOptionPane.showMessageDialog(null, "输入的日期不正确", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                        if (1 <= day && day <= 31) {
                            check(year, month, day);
                        } else {
                            JOptionPane.showMessageDialog(null, "输入的日期不正确", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (1 <= day && day <= 30) {
                            check(year, month, day);
                        } else {
                            JOptionPane.showMessageDialog(null, "输入的日期不正确", "", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "输入的月份不正确", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });
        btnNewButton.setBounds(26, 184, 93, 23);
        contentPane.add(btnNewButton);
    }

    public void check(int year, int month, int day) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        calendar.add(Calendar.DATE, 2);
        String s = simpleDateFormat.format(calendar.getTime());
        textField_3.setText(s);
    }
}
