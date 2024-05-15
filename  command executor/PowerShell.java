public class PowerShell implements Terminal {

    @Override
    public void execute(String command, String currentUser) {  
        System.out.println(command + " executed as " + currentUser + " successfully");
    }

}