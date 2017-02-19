package com.akexorcist.deviceinformation.collector.feature.model;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.os.Build;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Akexorcist on 2/18/2017 AD.
 */

public class Feature {
    @SuppressLint("InlinedApi")
    public static List<Data> getAllFeatureList() {
        return Arrays.asList(
                new Data("App Widgets", PackageManager.FEATURE_APP_WIDGETS, Build.VERSION_CODES.JELLY_BEAN_MR2),
                new Data("Audio Low Latency", PackageManager.FEATURE_AUDIO_LOW_LATENCY, Build.VERSION_CODES.GINGERBREAD),
                new Data("Audio Output", PackageManager.FEATURE_AUDIO_OUTPUT, Build.VERSION_CODES.LOLLIPOP),
                new Data("Audio Pro", PackageManager.FEATURE_AUDIO_PRO, Build.VERSION_CODES.M),
                new Data("Automotive", PackageManager.FEATURE_AUTOMOTIVE, Build.VERSION_CODES.M),
                new Data("Backup", PackageManager.FEATURE_BACKUP, Build.VERSION_CODES.KITKAT_WATCH),
                new Data("Bluetooth", PackageManager.FEATURE_BLUETOOTH, Build.VERSION_CODES.FROYO),
                new Data("Bluetooth Low Energy", PackageManager.FEATURE_BLUETOOTH_LE, Build.VERSION_CODES.JELLY_BEAN_MR2),
                new Data("Camera", PackageManager.FEATURE_CAMERA, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Camera Any", PackageManager.FEATURE_CAMERA_ANY, Build.VERSION_CODES.JELLY_BEAN_MR1),
                new Data("Camera Autofocus", PackageManager.FEATURE_CAMERA_AUTOFOCUS, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Camera Capability Manual Post Processing", PackageManager.FEATURE_CAMERA_CAPABILITY_MANUAL_POST_PROCESSING, Build.VERSION_CODES.LOLLIPOP),
                new Data("Camera Capability Manual Sensor", PackageManager.FEATURE_CAMERA_CAPABILITY_MANUAL_SENSOR, Build.VERSION_CODES.LOLLIPOP),
                new Data("Camera Capability RAW", PackageManager.FEATURE_CAMERA_CAPABILITY_RAW, Build.VERSION_CODES.LOLLIPOP),
                new Data("Camera External", PackageManager.FEATURE_CAMERA_EXTERNAL, Build.VERSION_CODES.KITKAT_WATCH),
                new Data("Camera Flash", PackageManager.FEATURE_CAMERA_FLASH, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Camera Front", PackageManager.FEATURE_CAMERA_FRONT, Build.VERSION_CODES.GINGERBREAD),
                new Data("Camera Level Full", PackageManager.FEATURE_CAMERA_LEVEL_FULL, Build.VERSION_CODES.LOLLIPOP),
                new Data("Connection Service", PackageManager.FEATURE_CONNECTION_SERVICE, Build.VERSION_CODES.LOLLIPOP),
                new Data("Consumer IR", PackageManager.FEATURE_CONSUMER_IR, Build.VERSION_CODES.KITKAT),
                new Data("Device Admin", PackageManager.FEATURE_DEVICE_ADMIN, Build.VERSION_CODES.KITKAT),
                new Data("Ethernet", PackageManager.FEATURE_ETHERNET, Build.VERSION_CODES.N),
                new Data("Faketouch", PackageManager.FEATURE_FAKETOUCH, Build.VERSION_CODES.HONEYCOMB),
                new Data("Faketouch Multitouch Distinct", PackageManager.FEATURE_FAKETOUCH_MULTITOUCH_DISTINCT, Build.VERSION_CODES.HONEYCOMB_MR2),
                new Data("Faketouch Multitouch Jazzhand", PackageManager.FEATURE_FAKETOUCH_MULTITOUCH_JAZZHAND, Build.VERSION_CODES.HONEYCOMB_MR2),
                new Data("Fingerprint", PackageManager.FEATURE_FINGERPRINT, Build.VERSION_CODES.M),
                new Data("Freeform Window Management", PackageManager.FEATURE_FREEFORM_WINDOW_MANAGEMENT, Build.VERSION_CODES.N),
                new Data("Gamepad", PackageManager.FEATURE_GAMEPAD, Build.VERSION_CODES.LOLLIPOP),
                new Data("High Fidelity Sensors", PackageManager.FEATURE_HIFI_SENSORS, Build.VERSION_CODES.M),
                new Data("Home Screen", PackageManager.FEATURE_HOME_SCREEN, Build.VERSION_CODES.JELLY_BEAN_MR2),
                new Data("Input Methods", PackageManager.FEATURE_INPUT_METHODS, Build.VERSION_CODES.JELLY_BEAN_MR2),
                new Data("Leanback", PackageManager.FEATURE_LEANBACK, Build.VERSION_CODES.LOLLIPOP),
                new Data("Live TV", PackageManager.FEATURE_LIVE_TV, Build.VERSION_CODES.LOLLIPOP),
                new Data("Live Wallpaper", PackageManager.FEATURE_LIVE_WALLPAPER, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Location", PackageManager.FEATURE_LOCATION, Build.VERSION_CODES.FROYO),
                new Data("Location GPS", PackageManager.FEATURE_LOCATION_GPS, Build.VERSION_CODES.FROYO),
                new Data("Location Network", PackageManager.FEATURE_LOCATION_NETWORK, Build.VERSION_CODES.FROYO),
                new Data("Managed Users", PackageManager.FEATURE_MANAGED_USERS, Build.VERSION_CODES.LOLLIPOP),
                new Data("Microphone", PackageManager.FEATURE_MICROPHONE, Build.VERSION_CODES.FROYO),
                new Data("MIDI", PackageManager.FEATURE_MIDI, Build.VERSION_CODES.M),
                new Data("NFC", PackageManager.FEATURE_NFC, Build.VERSION_CODES.GINGERBREAD),
                new Data("NFC Host Card Emulation", PackageManager.FEATURE_NFC_HOST_CARD_EMULATION, Build.VERSION_CODES.KITKAT),
                new Data("NFC-F Host Card Emulation", PackageManager.FEATURE_NFC_HOST_CARD_EMULATION_NFCF, Build.VERSION_CODES.N),
                new Data("OpenGL ES Extension Pack", PackageManager.FEATURE_OPENGLES_EXTENSION_PACK, Build.VERSION_CODES.LOLLIPOP),
                new Data("Picture In Picture", PackageManager.FEATURE_PICTURE_IN_PICTURE, Build.VERSION_CODES.N),
                new Data("Printing", PackageManager.FEATURE_PRINTING, Build.VERSION_CODES.KITKAT_WATCH),
                new Data("Screen Landscape", PackageManager.FEATURE_SCREEN_LANDSCAPE, Build.VERSION_CODES.HONEYCOMB_MR2),
                new Data("Screen Portrait", PackageManager.FEATURE_SCREEN_PORTRAIT, Build.VERSION_CODES.HONEYCOMB_MR2),
                new Data("Securely Removes Users", PackageManager.FEATURE_SECURELY_REMOVES_USERS, Build.VERSION_CODES.LOLLIPOP),
                new Data("Sensor Accelerometer", PackageManager.FEATURE_SENSOR_ACCELEROMETER, Build.VERSION_CODES.FROYO),
                new Data("Sensor Ambient Temperature", PackageManager.FEATURE_SENSOR_AMBIENT_TEMPERATURE, Build.VERSION_CODES.LOLLIPOP),
                new Data("Sensor Barometer", PackageManager.FEATURE_SENSOR_BAROMETER, Build.VERSION_CODES.GINGERBREAD),
                new Data("Sensor Compass", PackageManager.FEATURE_SENSOR_COMPASS, Build.VERSION_CODES.FROYO),
                new Data("Sensor Gyroscope", PackageManager.FEATURE_SENSOR_GYROSCOPE, Build.VERSION_CODES.GINGERBREAD),
                new Data("Sensor Heart Rate", PackageManager.FEATURE_SENSOR_HEART_RATE, Build.VERSION_CODES.KITKAT_WATCH),
                new Data("Sensor Heart Rate ECG", PackageManager.FEATURE_SENSOR_HEART_RATE_ECG, Build.VERSION_CODES.LOLLIPOP),
                new Data("Sensor Light", PackageManager.FEATURE_SENSOR_LIGHT, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Sensor Proximity", PackageManager.FEATURE_SENSOR_PROXIMITY, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Sensor Relative Humidity", PackageManager.FEATURE_SENSOR_RELATIVE_HUMIDITY, Build.VERSION_CODES.LOLLIPOP),
                new Data("Sensor Step Counter", PackageManager.FEATURE_SENSOR_STEP_COUNTER, Build.VERSION_CODES.KITKAT),
                new Data("Sensor Step Detector", PackageManager.FEATURE_SENSOR_STEP_DETECTOR, Build.VERSION_CODES.KITKAT),
                new Data("SIP", PackageManager.FEATURE_SIP, Build.VERSION_CODES.GINGERBREAD),
                new Data("SIP VOIP", PackageManager.FEATURE_SIP_VOIP, Build.VERSION_CODES.GINGERBREAD),
                new Data("Telephony", PackageManager.FEATURE_TELEPHONY, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Telephony CDMA", PackageManager.FEATURE_TELEPHONY_CDMA, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Telephony GSM", PackageManager.FEATURE_TELEPHONY_GSM, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Television", PackageManager.FEATURE_TELEVISION, Build.VERSION_CODES.JELLY_BEAN),
                new Data("Touchscreen", PackageManager.FEATURE_TOUCHSCREEN, Build.VERSION_CODES.FROYO),
                new Data("Touchscreen Multitouch", PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Touchscreen Multitouch Distinct", PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH_DISTINCT, Build.VERSION_CODES.ECLAIR_MR1),
                new Data("Touchscreen Multitouch Jazzhand", PackageManager.FEATURE_TOUCHSCREEN_MULTITOUCH_JAZZHAND, Build.VERSION_CODES.FROYO),
                new Data("USB Accessory", PackageManager.FEATURE_USB_ACCESSORY, Build.VERSION_CODES.HONEYCOMB_MR1),
                new Data("USB Host", PackageManager.FEATURE_USB_HOST, Build.VERSION_CODES.HONEYCOMB_MR1),
                new Data("Verified Boot", PackageManager.FEATURE_VERIFIED_BOOT, Build.VERSION_CODES.LOLLIPOP),
                new Data("VR Mode", PackageManager.FEATURE_VR_MODE, Build.VERSION_CODES.N),
                new Data("VR Mode High Performance", PackageManager.FEATURE_VR_MODE_HIGH_PERFORMANCE, Build.VERSION_CODES.N),
                new Data("Vulkan Hardware Level", PackageManager.FEATURE_VULKAN_HARDWARE_LEVEL, Build.VERSION_CODES.N),
                new Data("Vulkan Hardware Version", PackageManager.FEATURE_VULKAN_HARDWARE_VERSION, Build.VERSION_CODES.N),
                new Data("Watch", PackageManager.FEATURE_WATCH, Build.VERSION_CODES.KITKAT_WATCH),
                new Data("WebView", PackageManager.FEATURE_WEBVIEW, Build.VERSION_CODES.KITKAT_WATCH),
                new Data("WiFi", PackageManager.FEATURE_WIFI, Build.VERSION_CODES.FROYO),
                new Data("WiFi Direct", PackageManager.FEATURE_WIFI_DIRECT, Build.VERSION_CODES.ICE_CREAM_SANDWICH));
    }

    public static class Data {
        private String name;
        private String packageName;
        private int minimumSdk;

        public Data() {
        }

        public Data(String name, String packageName, int minimumSdk) {
            this.name = name;
            this.packageName = packageName;
            this.minimumSdk = minimumSdk;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }

        public int getMinimumSdk() {
            return minimumSdk;
        }

        public void setMinimumSdk(int minimumSdk) {
            this.minimumSdk = minimumSdk;
        }
    }
}