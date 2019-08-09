package javarush.java_collections_4.level8.lecture6.task2;

public class ExceptionFactory {
    public static Throwable getException(Enum type) {
        if (type == null)
            return new IllegalArgumentException();

        String message = type.name().charAt(0) + type.name().substring(1).toLowerCase().replace("_", " ");

        if (type instanceof ApplicationExceptionMessage)
            return new Exception(message);

        if (type instanceof DatabaseExceptionMessage)
            return new RuntimeException(message);

        if (type instanceof UserExceptionMessage)
            return new Error(message);

        return new IllegalArgumentException();
    }
}
