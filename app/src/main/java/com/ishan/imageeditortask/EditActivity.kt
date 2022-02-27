package com.ishan.imageeditortask

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import com.canhub.cropper.CropImage
import com.canhub.cropper.CropImageActivity
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.appcompat.app.AppCompatActivity


class EditActivity : AppCompatActivity() {

    //launches a crop activity
//    private val cropActivityResultContrats = object : ActivityResultContract<Any?, Uri?>() {
//        override fun createIntent(context: Context, input: Any?): Intent {
//            return CropImage.activity()
//                .setAspectRatio(16, 9)
//                .getIntent(this@EditActivity)
//        }
//
//        override fun parseResult(resultCode: Int, intent: Intent?): Uri? {
//            return CropImage.getActivityResult(intent)?.uriContent
//        }
//
//    }

    //private varibales used in the activity
    private lateinit var cropImage: Button
    private lateinit var editPreview: ImageView
    private lateinit var cropActivityResultLauncher:  ActivityResultLauncher<Any?>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        //get the data from the intent
        if (intent.hasExtra("byteArray")) {
            //getting the data in  editPreview
            editPreview = findViewById<ImageView>(R.id.edit_preview)
            val getbitmap = BitmapFactory.decodeByteArray(
                intent.getByteArrayExtra("byteArray"),
                0,
                intent.getByteArrayExtra("byteArray")!!.size
            )
            //set the image on the image View
            editPreview.setImageBitmap(getbitmap)
        }
        //adding the crop functionality to the app
//        cropImage = findViewById<Button>(R.id.crop_image)
//
//        cropActivityResultLauncher=registerForActivityResult(cropActivityResultContrats){
//            it?.let {
//                editPreview.setImageURI(it)
//            }
//        }
//        cropImage.setOnClickListener {
//            cropActivityResultLauncher.launch(null)
//        }

    }


}