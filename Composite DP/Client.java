public class Client {
    public static void main(String[] args) {
       
        Button button1 = new Button("Submit");
        Button button2 = new Button("Cancel");
        TextField textField1 = new TextField("Enter your name");

         
        Panel panel1 = new Panel();
        panel1.add(button1);
        panel1.add(button2);
 
        Window mainWindow = new Window();
        mainWindow.add(panel1);
        mainWindow.add(textField1);

       
        mainWindow.draw();
    }
}
