package com.example.usershopsmart

import android.content.Context
import android.widget.Toast
import androidx.core.app.NotificationCompat.MessagingStyle.Message

object Utils {

    fun showToast(context: Context, message: String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
}