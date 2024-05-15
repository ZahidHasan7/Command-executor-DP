import java.util.ArrayList;
import java.util.List;

public class CommandShell implements Terminal {
    private PowerShell powerShell;   
    private List<String> disallowedCommands;   

    public CommandShell() {
        powerShell = new PowerShell();
        disallowedCommands = new ArrayList<>();
        disallowedCommands.add("rm -rf");
    }

    @Override
    public void execute(String command, String currentUser) {
        if(disallowedCommands.contains(command) && !currentUser.equals("admin")){
            System.out.println("Cannot run command: " + command);
        }
        else{
            powerShell.execute(command,currentUser);
        }
    }
}