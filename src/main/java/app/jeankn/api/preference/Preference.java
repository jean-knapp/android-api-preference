package app.jeankn.api.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Preference {
    public static String read(Context context, String key) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return sharedPreferences.getString(key, "");
    }

    public static void write(Context context , String key, String value) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        sharedPreferences.edit().putString(key, value).apply();
    }
}
