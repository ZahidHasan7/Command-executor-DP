public class TextField implements GUIComponent {
    private String text;

    public TextField(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("Drawing TextField: " + text);
    }
}
