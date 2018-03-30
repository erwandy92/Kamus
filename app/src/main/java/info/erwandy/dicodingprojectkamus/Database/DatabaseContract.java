package info.erwandy.dicodingprojectkamus.Database;

import android.provider.BaseColumns;

/**
 * Created by Nursing Bank IT Dept on 3/29/2018.
 */

public class DatabaseContract {

    public static String TABLE_IND_TO_ENG  = "ind_to_eng";
    public static String TABLE_ENG_TO_IND  = "eng_to_ind";

    public static final class KamusColumns implements BaseColumns {
        public static String FIELD_KATA     = "kata";
        public static String FIELD_ARTI     = "arti";
    }

}
