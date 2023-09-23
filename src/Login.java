import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Log extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   Log() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      //b=new JButton("START");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
     // panel.add(b);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(450,350);
      setVisible(true);
      
   }  
      
      public void actionPerformed(ActionEvent ae) {
          String userName = userName_text.getText();
          String password = password_text.getText();
          if (userName.trim().equals("afreen") && password.trim().equals("180422")) {
             message.setText(" Hello " + userName + "Now you can Write the Exam   ALL THE BEST!!!");
            
            
             OnlineQuiz a = new OnlineQuiz("");
			a.setVisible(true);}
          
            
           
          else {
             message.setText(" Invalid user.. ");
          }
      
   }
}

class Login{
   public static void main(String[] args) {
      new Log();
      
   }
   
  
}