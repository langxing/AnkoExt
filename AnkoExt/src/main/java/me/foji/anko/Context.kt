package me.foji.anko

import android.app.AlarmManager
import android.app.Fragment
import android.app.NotificationManager
import android.content.Context
import android.content.SharedPreferences
import android.net.wifi.WifiManager
import android.preference.PreferenceManager
import android.support.annotation.LayoutRes
import android.view.*
import android.widget.Toast

/**
 * 该文件主要增加一些Context便捷方法，简化Context部分操作
 *
 * @author Scott Smith
 */
/**
 * 获取NotificationManager
 */
fun Context.notificationManager(): NotificationManager {
    return getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
}

/**
 * 获取WindowManager
 */
fun Context.windowManager(): WindowManager {
    return getSystemService(Context.WINDOW_SERVICE) as WindowManager
}

/**
 * 获取AlarmManager
 */
fun Context.alarmManager(): AlarmManager {
    return getSystemService(Context.ALARM_SERVICE) as AlarmManager
}

/**
 * 获取WifiManager
 */
fun Context.wifiManager(): WifiManager {
    return getSystemService(Context.WIFI_SERVICE) as WifiManager
}

/**
 * 获取Default SharedPreferences
 */
fun Context.defaultSharedPreferences(): SharedPreferences {
    return PreferenceManager.getDefaultSharedPreferences(this)
}

/**
 * 在中间显示Tost
 */
fun Context.showCenterToast(message : String) {
    val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
    toast.setGravity(Gravity.CENTER, 0, 0)
    toast.show()
}

/**
 * 获取屏幕宽度
 */
fun Context.screenWidth() = resources.displayMetrics.widthPixels

/**
 * 获取屏幕高度
 */
fun Context.screenHeight() = resources.displayMetrics.heightPixels

@Suppress("UNCHECKED_CAST")
fun <V: View> Context.inflate(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): V {
    return LayoutInflater.from(this).inflate(layoutId , parent , attachToRoot) as V
}

@Suppress("UNCHECKED_CAST")
fun <V: View> Fragment.inflate(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): V {
    return LayoutInflater.from(activity).inflate(layoutId , parent , attachToRoot) as V
}

@Suppress("UNCHECKED_CAST")
fun <V: View> android.support.v4.app.Fragment.inflate(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): V {
    return LayoutInflater.from(activity).inflate(layoutId , parent , attachToRoot) as V
}