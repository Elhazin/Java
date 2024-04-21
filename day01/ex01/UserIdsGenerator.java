import java.util.UUID;

class UserIdsGenerator
{
    private static long id = 0;
    private static UUID buildUUIDFromLong(long value) {
        long mostSignificantBits = value << 32;
        long leastSignificantBits = value & 0xFFFFFFFFL;
        return new UUID(mostSignificantBits, leastSignificantBits);
    }
    public static UUID generateId() {
        id++;
        return buildUUIDFromLong(id);
    }
}