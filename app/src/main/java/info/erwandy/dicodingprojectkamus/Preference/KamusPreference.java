package info.erwandy.dicodingprojectkamus.Preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import info.erwandy.dicodingprojectkamus.R;

/**
 * Created by Nursing Bank IT Dept on 3/29/2018.
 */

public class KamusPreference {

    SharedPreferences prefs;
    Context context;

    public KamusPreference(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
        this.context = context;
    }

    public void setFirstRun(Boolean input){

        SharedPreferences.Editor editor = prefs.edit();
        String key = context.getResources().getString(R.string.kamus_pref);
        editor.putBoolean(key,input);
        editor.commit();
    }

    public Boolean getFirstRun(){
        String key = context.getResources().getString(R.string.kamus_pref);
        return prefs.getBoolean(key, true);
    }

}
