package opd.dvfu;

public interface Name {
    static int getMinViewLength() {
        // TODO: add logic
        return 20;
    }

    String minView();

    String maxView();
}
