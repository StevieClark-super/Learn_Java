package AlarmRinging;

public class AlarmRinging {
    public static boolean shouldWakeUp (boolean ringing, int hourOfDay) {
        if (ringing) {
            if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay >= 22 && hourOfDay <= 23) {
                return true;
            }
        }
        return false;
    }
}
