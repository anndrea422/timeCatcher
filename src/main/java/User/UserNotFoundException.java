package User;

import java.util.function.Supplier;

public class UserNotFoundException<X> implements Supplier<X> {
    @Override
    public X get() {
        return null;
    }
}
