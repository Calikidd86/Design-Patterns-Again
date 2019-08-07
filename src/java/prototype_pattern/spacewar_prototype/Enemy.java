package prototype_pattern.spacewar_prototype;

abstract class Enemy implements Cloneable {

    private String enemyName;

    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}
