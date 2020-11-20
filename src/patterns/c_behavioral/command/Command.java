package patterns.c_behavioral.command;

public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public abstract boolean execute();

    public void undo() {
        editor.textField.setText(backup);
    }

    void backup() {
        backup = editor.textField.getText();
    }
}
