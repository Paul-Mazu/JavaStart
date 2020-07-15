package enumy.training;

public enum Size {
    SMALL("Mały"), MEDIUM("Średni"), LARGE("Duży");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return ordinal() + ", " + description;
    }

    public static Size fromDescription(String description) {
//        switch (description) {
//            case "Mały":
//                return SMALL;
//            case "Średni":
//                return MEDIUM;
//            case "Duży":
//                return LARGE;
//            default: return null
//            }
        for (int i = 0; i < Size.values().length; i++) {
            if (Size.values()[i].getDescription().equals(description)) return Size.values()[i];
        }
        return null;
    }
}
