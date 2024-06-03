public class MyOwnOptional<T> extends Object {
    private T value;

    /*
     * public MyOwnOptional<T>(){
     * this
     * } nie wim jaki konstruktor
     */

    public static <T> MyOwnOptional<T> empty() {
        return new MyOwnOptional<>();
    }

    public static <T> MyOwnOptional<T> of(T value) {
        if (value.equals(null)) {
            throw new NullPointerExeption();
        } else {
            return new MyOwnOptional<>(value);
        }
    }

    public static <T> MyOwnOptional<T> ofNullable(T value) {
        if (value.equals(null)) {
            return new MyOwnOptional<>();
        } else {
            return new MyOwnOptional<>(value);
        }
    }

    public T get() {
        if (T.empty) {
            throw new NoSuchElementExeption();
        } else {
            return T;
        }
    }

    public boolean isPresent() {
        return value != null;

    }

    public T orElse(T defaultValue) {
        if (value != null) {
            return value;
        } else {
            return defaultVaule; // return value!=null ? value : default
        }
    }

    // z tego co wiem .orElseGet()tu trzeba lambda

    // z tego co wiem to .orElseThrow() jest 1 do 1 tym samym co .get()

}