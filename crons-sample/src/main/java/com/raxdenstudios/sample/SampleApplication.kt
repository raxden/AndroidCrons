package com.raxdenstudios.sample

import android.app.Application
import com.raxdenstudios.cron.CronManager

/**
 * Created by agomez on 26/02/2016.
 */
class SampleApplication : Application() {

    companion object {
        private val TAG = SampleApplication::class.java.simpleName
    }

    override fun onCreate() {
        super.onCreate()

        CronManager.Builder()
                .build()
                .init(this)

        //        Realm.init(this);
        //        RealmConfiguration config = new RealmConfiguration.Builder()
        //                .name(Utils.getPackageName(this))
        //                .modules(Realm.getDefaultModule(), new CronRealmModule())
        //                .migration(new CronRealmMigration())
        //                .schemaVersion(1)
        //                .build();
        //        Realm.setDefaultConfiguration(config);
    }

}
