package me.foji.anko

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

/**
 * Created by Administrator on 2017/2/13.
 */

/**
 * 显示键盘
 */
fun EditText.showSoftKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(this, InputMethodManager.RESULT_SHOWN)
    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
}

/**
 * 隐藏键盘
 */
fun EditText.hideSoftKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}