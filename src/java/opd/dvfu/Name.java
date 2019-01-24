package opd.dvfu;

public abstract class Name {

    protected static int getMinViewLength() {
        // TODO: add logic
        return 20;
    }

    public abstract String minView();

    public abstract String maxView();
}
