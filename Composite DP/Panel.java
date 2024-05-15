import java.util.ArrayList;
import java.util.List;

public class Panel implements GUIComponent {
    private List<GUIComponent> components;

    public Panel() {
        components = new ArrayList<>();
    }

    public void add(GUIComponent component) {
        components.add(component);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Panel:");
        for (GUIComponent component : components) {
            component.draw();
        }
    }
}
