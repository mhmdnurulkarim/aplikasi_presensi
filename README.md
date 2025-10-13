# Attendly App 📱

An Android application for managing employee attendance, data, and reports. This app streamlines the attendance process, allowing employees to mark their arrival and departure times, and provides administrators with tools to manage employee data and generate attendance reports. It leverages Firebase Firestore for data synchronization and a local SQLite database for offline functionality.

## 🚀 Key Features

- **Attendance Tracking:** Employees can easily mark their arrival ("datang") and departure ("pulang") times. ⏰
- **Employee Data Management:** Administrators can add, update, and delete employee records. 🧑‍💼
- **Attendance Reporting:** Generate detailed attendance reports for specific users and periods, exportable to PDF. 📊
- **User Authentication:** Secure login system to protect sensitive data. 🔒
- **Role-Based Access Control:** Different features are available based on the user's role (e.g., admin, employee). 🛡️
- **Offline Functionality:** Utilizes a local SQLite database to ensure functionality even without an internet connection. 📶
- **Data Synchronization:** Synchronizes data between the local database and Firebase Firestore. ☁️

## 🛠️ Tech Stack

- **Frontend:**
  - Kotlin
  - Android SDK
  - AndroidX AppCompat
  - AndroidX RecyclerView
  - Material Design Components
  - View Binding
  - Data Binding
- **Backend:**
  - Firebase Firestore
- **Database:**
  - SQLite
- **Libraries:**
  - iTextpdf (for PDF generation)
  - JUnit (for testing)
  - Kotlin BOM
- **Build Tool:**
  - Gradle (with Kotlin DSL)

## 📦 Getting Started

Follow these instructions to get the project up and running on your local machine.

### Prerequisites

- Android Studio installed
- Basic knowledge of Android development
- Firebase project set up with Firestore enabled
- iText PDF library

### Installation

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/mhmdnurulkarim/Attendly.git
    cd Attendly
    ```

2.  **Open the project in Android Studio.**

3.  **Configure Firebase:**

    - Download the `google-services.json` file from your Firebase project.
    - Place the `google-services.json` file in the `app/` directory.

4.  **Add Firebase configuration in `app/build.gradle.kts`:**

    ```kotlin
    plugins {
        id("com.android.application")
        id("com.google.gms.google-services")
        kotlin("android")
    }
    ```

5.  **Sync Gradle:** Click "Sync Now" in the Android Studio notification bar.

6.  **Install iText PDF library:**
    Add the following dependency to your `app/build.gradle.kts` file:
    ```kotlin
       dependencies {
           implementation("com.itextpdf:itext7-core:7.2.5")
       }
    ```

### Running Locally

1.  **Connect an Android device or emulator.**
2.  **Build and run the application in Android Studio.** (Run -> Run 'app')

## 📂 Project Structure

```
Presensi App/
├── app/
│   ├── build.gradle.kts          # Gradle build script for the app module
│   ├── src/main/
│   │   ├── AndroidManifest.xml   # Android manifest file
│   │   ├── java/com/oci/presensi/
│   │   │   ├── AbsensiActivity.java                # Attendance marking activity
│   │   │   ├── DataAbsensiHarianActivity.java      # Daily attendance records activity
│   │   │   ├── DataKaryawanActivity.java           # Employee data management activity
│   │   │   ├── DataRekapAbsensiActivity.java       # Attendance summary activity
│   │   │   ├── DataRekapAbsensiDetailActivity.java # Detailed attendance report activity
│   │   │   ├── DetailKaryawanActivity.java         # Employee details activity
│   │   │   ├── HomeActivity.java                   # Main landing page after login
│   │   │   ├── LoginActivity.java                  # User login activity
│   │   │   ├── SplashActivity.java                  # Splash screen activity
│   │   │   ├── adapter/                          # RecyclerView adapters
│   │   │   │   ├── AdapterDataAbsensiHarian.java
│   │   │   │   ├── AdapterDataKaryawan.java
│   │   │   │   ├── AdapterDataRekapAbsensi.java
│   │   │   │   ├── AdapterDataRekapAbsensiDetail.java
│   │   │   ├── helper/                           # Helper classes
│   │   │   │   ├── DataHelper.java               # Database helper
│   │   │   ├── model/                            # Data models
│   │   │   │   ├── ModelAbsensi.java
│   │   │   │   ├── ModelAkun.java
│   │   │   ├── util/                             # Utility classes
│   │   │   │   ├── Constants.java                # Constants for SharedPreferences keys
│   │   │   │   ├── PreferenceUtils.java          # SharedPreferences utility
│   │   │   │   ├── Utils.java                    # Date and time utility
│   │   ├── res/                    # Resources (layouts, drawables, etc.)
│   │   │   ├── layout/
│   │   │   │   ├── activity_absensi.xml
│   │   │   │   ├── activity_data_absensi_harian.xml
│   │   │   │   ├── activity_data_karyawan.xml
│   │   │   │   ├── activity_data_rekap_absensi.xml
│   │   │   │   ├── activity_data_rekap_absensi_detail.xml
│   │   │   │   ├── activity_detail_karyawan.xml
│   │   │   │   ├── activity_home.xml
│   │   │   │   ├── activity_login.xml
│   │   │   │   ├── activity_splash.xml
│   │   │   │   ├── item_data_absensi_harian.xml
│   │   │   │   ├── item_data_karyawan.xml
│   │   │   │   ├── item_data_rekap_absensi.xml
│   │   │   │   ├── item_data_rekap_absensi_detail.xml
├── build.gradle.kts              # Top-level Gradle build script
├── settings.gradle.kts           # Gradle settings file
```

## 📸 Screenshots

(Screenshots will be added here)

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them with descriptive messages.
4.  Push your changes to your fork.
5.  Submit a pull request.

## 📬 Contact

If you have any questions or suggestions, feel free to contact me at [mhmdnurulkarim@gmail.com](mailto:mhmdnurulkarim@gmail.com).

## 💖 Thanks Message

Thank you for checking out the Restaurant App! We hope you find it useful and enjoyable. Your feedback and contributions are greatly appreciated.
