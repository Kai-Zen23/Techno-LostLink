package com.fourj.lofo;

import android.app.Application;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

public class LofoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize Firebase
        FirebaseApp.initializeApp(this);

        // Connect to the local Firebase Emulator only during Debug builds
        if (BuildConfig.DEBUG) {
            try {
                // We use 127.0.0.1 because we will use adb reverse to map the device ports to the host ports
                FirebaseAuth.getInstance().useEmulator("127.0.0.1", 9099);
                FirebaseFirestore.getInstance().useEmulator("127.0.0.1", 8080);
                FirebaseStorage.getInstance().useEmulator("127.0.0.1", 9199);
            } catch (IllegalStateException e) {
                // Ignore if it's already initialized
            }
        }
    }
}
