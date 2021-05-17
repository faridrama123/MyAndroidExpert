package com.faridrama123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.security.SecureRandom
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val iv: ByteArray = ByteArray(16)
        val secureRandom = SecureRandom()
        secureRandom.nextBytes(iv)

        val data = "Menjadi Android Developer Expert"

        val keyGenerator = KeyGenerator.getInstance("AES")
        keyGenerator.init(256)
        val secretKey: SecretKey = keyGenerator.generateKey()
        Log.d("Encryption", "Random Key : ${secretKey.encoded}")

        val encryptedText = AESEncryption.encrypt(
                data = data,
                secretKey = secretKey,
                iv = secureRandom.generateSeed(16)
        )

        Log.d("Encryption", "Encrypted : $encryptedText")

        val decryptedText = AESEncryption.decrypt(
                encryptedText = encryptedText,
                secretKey = secretKey,
                iv = secureRandom.generateSeed(16)
        )

        Log.d("Encryption", "Decrypted : $decryptedText")

    }
}