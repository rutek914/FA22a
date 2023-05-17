package Szkola.Feuerwehr;

public class CommandWasserMarsch implements ICommand {
    private String rozkaz;

    public CommandWasserMarsch(String s) {
        rozkaz = s;
    }

    @Override
    public void execute() {
        System.out.println(rozkaz);
    }

}
