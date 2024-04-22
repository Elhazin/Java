
class UserIdsGenerator
{
    private static long id = 0;
    // private static UUID buildUUIDFromLong(long value) {
    //     long mostSignificantBits = value << 32;
    //     long leastSignificantBits = value & 0xFFFFFFFFL;
    //     return new UUID(mostSignificantBits, leastSignificantBits);
    // }
    public static long generateId() {
        id++;
        return id;
    }
}