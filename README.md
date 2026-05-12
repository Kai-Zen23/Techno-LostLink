# LoFo - Lost and Found App

### About the project :  
"LOFO" is an innovative android application designed to streamline the process of reuniting individuals with their lost belongings, addressing a common problem faced in our college community. Lost and found items are managed through a manual and time-consuming email system, resulting in a cluttered and inefficient process.  
Our project aims to simplify this ordeal by creating a user-friendly, intuitive app that centralizes the lost and found experience. Users can easily report lost items, providing essential details and descriptions, while those who have found items can upload information about the discovered belongings.  
LOFO promotes a more organized and accessible way of managing lost items, reducing the clutter in email inboxes, and fostering community by reuniting individuals with their cherished belongings. This project intends to enhance the college experience by providing a reliable and user-friendly platform for lost and found items.  

### Tech Stack:
Android Studio (Java)
Backend: Firebase (Auth, Firestore, Storage, Realtime Database)
Local Development: Firebase Local Emulator Suite

### Recent Updates:
- **Package Migration**: Successfully migrated the application package to `com.fourj.lofo`.
- **Open Registration**: Removed the hardcoded college email domain restriction. Users can now register using any valid email address format.
- **Local Testing Environment**: Integrated the Firebase Local Emulator Suite. The app uses `LofoApplication.java` to automatically route traffic to local emulators (`127.0.0.1` via `adb reverse` or `10.0.2.2` on AVD) during `Debug` builds, allowing for safe, offline testing without incurring cloud costs or modifying production data.

### Prerequisites & Tools Needed:
- **Android Studio** (Electric Eel or newer recommended)
- **Java Development Kit (JDK) 17** (Bundled with modern Android Studio)
- **Node.js & npm** (Required to install Firebase CLI)
- **Firebase CLI** (`npm install -g firebase-tools`)

### Installation & Setup:
1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd Lost-and-Found-App
   ```
2. **Open in Android Studio:** Open the `Lost-and-Found-App` folder in Android Studio and let the initial Gradle Sync complete.
3. **Connect to Firebase (Production):** Replace the `app/google-services.json` file with your own Firebase project credentials if you wish to deploy to live servers.
4. **Build & Run:** Hit the 'Run' button in Android Studio to deploy the application to your emulator or physical device.

### How to Run Locally with Firebase Emulator:
1. Ensure you have the Firebase CLI installed (`npm install -g firebase-tools`).
2. Run `firebase emulators:start` in the project directory.
3. If testing on a physical device, run `adb reverse tcp:9099 tcp:9099`, `adb reverse tcp:8080 tcp:8080`, and `adb reverse tcp:9199 tcp:9199` to forward the emulator ports.
4. Build and run the app in Debug mode via Android Studio.

### Module Wise Scope :
User Registration and Authentication:  
● Module Scope: Implement a secure user registration and authentication system to ensure only authorized users can access the app.  
● Features: User authentication and authorization.  

Lost Item Reporting:  
● Module Scope: Allow users to report lost items, providing essential details and descriptions.  
● Features: Form for entering item details, including category, description, date, time, and location of loss.  

Found Item Submission:  
● Module Scope: Enable users to upload information about found items.  
● Features: Form for entering item details, including category, description, date, time, and discovery location.  

Item Listings and Search:  
● Module Scope: Create a searchable database of lost and found items for users to browse.  
● Features: Search by category, date, and location, and view item details.  

Messaging and Communication:  
● Module Scope: Enable users to communicate with each other to arrange item retrieval through call or SMS.  
● Features: Call and SMS to connect with other people 

### [Link to view Screenshots and User Manual](https://github.com/shruti-2412/Lost-and-Found-App/blob/master/User%20Manual-%20Lost%20and%20Found%20App.pdf)
