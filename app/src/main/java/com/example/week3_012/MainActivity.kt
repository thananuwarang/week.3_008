package com.example.week3_012

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_FNAME = "FNAME"
    public  final var TAG_LNAME = "LNAME"
    public  final var TAG_AGE = "AGE"
    public  final var TAG_BIRTHDAY = "BIRTHDAY"
    public  final var TAG_NUMBER = "NUMBER"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("WTF!!")

        btn_sender.setOnClickListener {
            // ดึงค่าจาก edittext
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var age = et_age.text.toString()
            var birthday = et_birthday.text.toString()
            var number = et_number.text.toString()

            //เรียกใช้ method senderFun เพื่อ ฝาก และ ส่งค่าไปยังหน้าที่ 2
            senderFun(fname,lname,age,birthday,number)

        }

        btn_clear.setOnClickListener {

            // ล้างข้อมูล
            et_fname.setText("")
            et_lname.setText("")
            et_age.setText("")
            et_birthday.setText("")
            et_number.setText("")

        }

        btn_close.setOnClickListener {

            //ปิด app
            finish()

        }
    }

    fun senderFun(str1 : String ,str2 : String ,str3 : String ,str4 : String , str5 : String){
        //กำหนดค่าเริ่มต้น (ตัวมันเอง,class ปลายทาง)
        var goPageSecond = Intent(this,SecoundAcitivity ::class.java)

        //กำหนดข้อมูลและส่งข้อมูล (ชื่อของข้อมูล,ข้อมูล)
        goPageSecond.putExtra(TAG_FNAME,str1)
        goPageSecond.putExtra(TAG_LNAME,str2)
        goPageSecond.putExtra(TAG_AGE,str3)
        goPageSecond.putExtra(TAG_BIRTHDAY,str4)
        goPageSecond.putExtra(TAG_NUMBER,str5)

        //เริ่มต้นเข้าสู่ activity second
        startActivity(goPageSecond)

    }
}
