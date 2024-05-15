public class Client {
    public static void main(String[] args) {

        CommandShell shell = new CommandShell();  
        shell.execute("mkdir design pattern", "user");
        shell.execute("rm -rf", "user");   
        shell.execute("rm -rf", "admin");   
        
    }
}
