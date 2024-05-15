public class Button implements GUIComponent {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button: " + label);
    }
}
