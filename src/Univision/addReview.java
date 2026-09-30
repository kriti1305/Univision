package Univision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addReview extends JFrame implements ActionListener {

    JTextField collegeField;
    JComboBox<Integer> infraRating, acadRating, placeRating;
    JTextArea infraReview, acadReview, placeReview;
    JButton submit;

    public addReview() {
        setTitle("Add College Review");
        setBounds(350, 100, 700, 550);
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);

        JLabel titleLabel = new JLabel("Add College Review");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(230, 10, 300, 30);
        add(titleLabel);

        int y = 60;

        addLabel("College Name:", 50, y);
        collegeField = new JTextField();
        collegeField.setBounds(200, y, 500, 25);
        add(collegeField);
        y += 40;

        addLabel("Infrastructure Rating (1-5):", 50, y);
        infraRating = ratingBox();
        infraRating.setBounds(250, y, 50, 25);
        add(infraRating);
        y += 35;

        addLabel("Infrastructure Review (min 200 chars):", 50, y);
        infraReview = createTextArea();
        infraReview.setBounds(50, y + 25, 600, 50);
        add(infraReview);
        y += 90;

        addLabel("Academics Rating (1-5):", 50, y);
        acadRating = ratingBox();
        acadRating.setBounds(250, y, 50, 25);
        add(acadRating);
        y += 35;

        addLabel("Academics Review (min 200 chars):", 50, y);
        acadReview = createTextArea();
        acadReview.setBounds(50, y + 25, 600, 50);
        add(acadReview);
        y += 90;

        addLabel("Placements Rating (1-5):", 50, y);
        placeRating = ratingBox();
        placeRating.setBounds(250, y, 50, 25);
        add(placeRating);
        y += 35;

        addLabel("Placements Review (min 200 chars):", 50, y);
        placeReview = createTextArea();
        placeReview.setBounds(50, y + 25, 600, 50);
        add(placeReview);
        y += 90;

        submit = new JButton("Submit Review");
        submit.setBounds(270, y, 160, 30);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    private void addLabel(String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, 14));
        label.setBounds(x, y, 400, 20);
        add(label);
    }

    private JComboBox<Integer> ratingBox() {
        return new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
    }

    private JTextArea createTextArea() {
        JTextArea area = new JTextArea();
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        return area;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String collegeName = collegeField.getText();
            int infra = (int) infraRating.getSelectedItem();
            int acad = (int) acadRating.getSelectedItem();
            int place = (int) placeRating.getSelectedItem();
            String infraRev = infraReview.getText();
            String acadRev = acadReview.getText();
            String placeRev = placeReview.getText();

            try {
                Conn c = new Conn();
                String query = "INSERT INTO college_reviews (college_name, infrastructure_rating, infrastructure_review, academics_rating, academics_review, placements_rating, placements_review) " +
                        "VALUES ('" + collegeName + "', " + infra + ", '" + infraRev + "', " + acad + ", '" + acadRev + "', " + place + ", '" + placeRev + "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Review Submitted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to submit review");
            }
        }
    }

    public static void main(String[] args) {
        new addReview();
    }
}

