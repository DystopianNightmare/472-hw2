import java.util.List;

public abstract class Embellishment extends Composition{

    public Embellishment(Compositor compositor) {
        super(compositor);
    }

    @Override
    void draw(Window window) {
        for (Glyph child : children) {
            child.draw(window);
        }
    }

    void insert(Glyph glyph, int position) throws NoChildOperationsException {
        super.insert(glyph,position);
    }

    void remove(Glyph glyph) {
        super.remove(glyph);
    }
}
