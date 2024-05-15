public class Window implements GUIComponent {
    private List<GUIComponent> components;

    public Window() {
        components = new ArrayList<>();
    }

    public void add(GUIComponent component) {
        components.add(component);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Window:");
        for (GUIComponent component : components) {
            component.draw();
        }
    }
}
