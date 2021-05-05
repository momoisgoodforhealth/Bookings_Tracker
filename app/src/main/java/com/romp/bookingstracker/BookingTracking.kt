package com.romp.bookingstracker

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.*

class BookingTracking : Fragment() {

    lateinit var checkbox1: CheckBox
    lateinit var checkbox2: CheckBox
    lateinit var checkbox3: CheckBox
    lateinit var checkbox4: CheckBox
    lateinit var checkbox5: CheckBox
    lateinit var checkbox6: CheckBox
    lateinit var checkbox7: CheckBox
    lateinit var checkbox8: CheckBox
    lateinit var checkbox9: CheckBox
    lateinit var checkbox10: CheckBox
    lateinit var checkbox11: CheckBox
    lateinit var checkbox12: CheckBox
    lateinit var checkbox13: CheckBox

    lateinit var price1: TextView
    lateinit var price2: TextView
    lateinit var price3: TextView
    lateinit var price4: TextView
    lateinit var price5: TextView
    lateinit var price6: TextView
    lateinit var price7: TextView
    lateinit var price8: TextView
    lateinit var price9: TextView
    lateinit var price10: TextView
    lateinit var price11: TextView
    lateinit var price12: TextView
    lateinit var price13: TextView

    lateinit var uploadbutton: Button
    lateinit var resetbutton: Button
    lateinit var datebutton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_booking_tracking, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var database = FirebaseDatabase.getInstance().getReference()
        var main: DatabaseReference =database.child("bookingstracking").child("mahalaxmistan").child("1")
        var conditionref: DatabaseReference = main.child("remarks")
        var ref:DatabaseReference = main.child("check")
        var dheba:DatabaseReference=main.child("price")

        checkbox1=view.findViewById(R.id.checkBox1)
        checkbox2=view.findViewById(R.id.checkBox3)
        checkbox3=view.findViewById(R.id.checkBox2)
        checkbox4=view.findViewById(R.id.checkBox4)
        checkbox5=view.findViewById(R.id.checkBox5)
        checkbox6=view.findViewById(R.id.checkBox6)
        checkbox7=view.findViewById(R.id.checkBox7)
        checkbox8=view.findViewById(R.id.checkBox9)
        checkbox9=view.findViewById(R.id.checkBox8)
        checkbox10=view.findViewById(R.id.checkBox10)
        checkbox11=view.findViewById(R.id.checkBox11)
        checkbox12=view.findViewById(R.id.checkBox12)
        checkbox13=view.findViewById(R.id.checkBox13)

        price1=view.findViewById(R.id.price1)
        price2=view.findViewById(R.id.price2)
        price3=view.findViewById(R.id.price3)
        price4=view.findViewById(R.id.price4)
        price5=view.findViewById(R.id.price5)
        price6=view.findViewById(R.id.price6)
        price7=view.findViewById(R.id.price7)
        price8=view.findViewById(R.id.price8)
        price9=view.findViewById(R.id.price9)
        price10=view.findViewById(R.id.price10)
        price11=view.findViewById(R.id.price11)
        price12=view.findViewById(R.id.price12)
        price13=view.findViewById(R.id.price13)

        uploadbutton=view.findViewById(R.id.upload_button)
        resetbutton=view.findViewById(R.id.reset_button)
        datebutton=view.findViewById(R.id.date_button)


        fun dataupdate() {
            ref.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    for (postSnapshot in dataSnapshot.children) {
                        if (postSnapshot.key == "check1" && postSnapshot.getValue().toString() == "1") {
                            checkbox1.setChecked(true)
                        }
                        if (postSnapshot.key == "check1" && postSnapshot.getValue().toString() == "0") {
                            checkbox1.setChecked(false)
                        }
                        if (postSnapshot.key == "check2" && postSnapshot.getValue().toString() == "1") {
                            checkbox2.setChecked(true)
                        }
                        if (postSnapshot.key == "check2" && postSnapshot.getValue().toString() == "0") {
                            checkbox2.setChecked(false)
                        }
                        if (postSnapshot.key == "check3" && postSnapshot.getValue().toString() == "1") {
                            checkbox3.setChecked(true)
                        }
                        if (postSnapshot.key == "check3" && postSnapshot.getValue().toString() == "0") {
                            checkbox3.setChecked(false)
                        }
                        if (postSnapshot.key == "check4" && postSnapshot.getValue().toString() == "1") {
                            checkbox4.setChecked(true)
                        }
                        if (postSnapshot.key == "check4" && postSnapshot.getValue().toString() == "0") {
                            checkbox4.setChecked(false)
                        }
                        if (postSnapshot.key == "check5" && postSnapshot.getValue().toString() == "1") {
                            checkbox5.setChecked(true)
                        }
                        if (postSnapshot.key == "check5" && postSnapshot.getValue().toString() == "0") {
                            checkbox5.setChecked(false)
                        }
                        if (postSnapshot.key == "check6" && postSnapshot.getValue().toString() == "1") {
                            checkbox6.setChecked(true)
                        }
                        if (postSnapshot.key == "check6" && postSnapshot.getValue().toString() == "0") {
                            checkbox6.setChecked(false)
                        }
                        if (postSnapshot.key == "check7" && postSnapshot.getValue().toString() == "1") {
                            checkbox7.setChecked(true)
                        }
                        if (postSnapshot.key == "check7" && postSnapshot.getValue().toString() == "0") {
                            checkbox7.setChecked(false)
                        }
                        if (postSnapshot.key == "check8" && postSnapshot.getValue().toString() == "1") {
                            checkbox8.setChecked(true)
                        }
                        if (postSnapshot.key == "check8" && postSnapshot.getValue().toString() == "0") {
                            checkbox8.setChecked(false)
                        }
                        if (postSnapshot.key == "check9" && postSnapshot.getValue().toString() == "1") {
                            checkbox9.setChecked(true)
                        }
                        if (postSnapshot.key == "check9" && postSnapshot.getValue().toString() == "0") {
                            checkbox9.setChecked(false)
                        }
                        if (postSnapshot.key == "check10" && postSnapshot.getValue().toString() == "1") {
                            checkbox10.setChecked(true)
                        }
                        if (postSnapshot.key == "check10" && postSnapshot.getValue().toString() == "0") {
                            checkbox10.setChecked(false)
                        }
                        if (postSnapshot.key == "check11" && postSnapshot.getValue().toString() == "1") {
                            checkbox11.setChecked(true)
                        }
                        if (postSnapshot.key == "check11" && postSnapshot.getValue().toString() == "0") {
                            checkbox11.setChecked(false)
                        }
                        if (postSnapshot.key == "check12" && postSnapshot.getValue().toString() == "1") {
                            checkbox12.setChecked(true)
                        }
                        if (postSnapshot.key == "check12" && postSnapshot.getValue().toString() == "0") {
                            checkbox12.setChecked(false)
                        }
                        if (postSnapshot.key == "check13" && postSnapshot.getValue().toString() == "1") {
                            checkbox13.setChecked(true)
                        }
                        if (postSnapshot.key == "check13" && postSnapshot.getValue().toString() == "0") {
                            checkbox13.setChecked(false)
                        }
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                }
            })



            dheba.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    for (postSnapshot in dataSnapshot.children) {
                        if (postSnapshot.key == "price1") {
                            price1.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price2") {
                            price2.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price3") {
                            price3.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price4") {
                            price4.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price5") {
                            price5.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price6") {
                            price6.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price7") {
                            price7.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price8") {
                            price8.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price9") {
                            price9.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price10") {
                            price10.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price11") {
                            price11.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price12") {
                            price12.text = postSnapshot.getValue().toString()
                        }
                        if (postSnapshot.key == "price13") {
                            price13.text = postSnapshot.getValue().toString()
                        }
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                }
            })
        }
        dataupdate()

        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Select Date")
        val  datebutton:Button=view.findViewById(R.id.date_button)
        val day = arrayOf("Today","Tommorrow", "2 Days Later","3 Days Later", "4 Days Later", "5 Days Later", "6 Days Later", "7 Days Later")
        builder.setItems(day) { dialog, which ->
            when (which) {
                0 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("1") ; conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price") ; dataupdate()}
                1 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("2") ; conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price") ; dataupdate()}
                2 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("3") ; conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
                3 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("4"); conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
                4 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("5"); conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
                5 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("6"); conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
                6 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("7"); conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
                7 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("8"); conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
                8 -> {main=database.child("bookingstracking").child("mahalaxmistan").child("9"); conditionref=main.child("remarks") ; ref = main.child("check") ; dheba=main.child("price"); dataupdate()}
            }
        }

        datebutton.setOnClickListener {
            val dialog = builder.create()
            dialog.show()
        }

        uploadbutton.setOnClickListener {
            var toaster=false

            if (price1.text.toString().isNotBlank()) {
                dheba.child("price1").setValue(price1.text.toString()).addOnSuccessListener {
                    toaster=true
                }
            }

            if (price2.text.toString().isNotBlank()) {
                dheba.child("price2").setValue(price2.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price3.text.toString().isNotBlank()) {
                dheba.child("price3").setValue(price3.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price4.text.toString().isNotBlank()) {
                dheba.child("price4").setValue(price4.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price5.text.toString().isNotBlank()) {
                dheba.child("price5").setValue(price5.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price6.text.toString().isNotBlank()) {
                dheba.child("price6").setValue(price6.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price7.text.toString().isNotBlank()) {
                dheba.child("price7").setValue(price7.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price8.text.toString().isNotBlank()) {
                dheba.child("price8").setValue(price8.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price9.text.toString().isNotBlank()) {
                dheba.child("price9").setValue(price9.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price10.text.toString().isNotBlank()) {
                dheba.child("price10").setValue(price10.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price11.text.toString().isNotBlank()) {
                dheba.child("price11").setValue(price11.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price12.text.toString().isNotBlank()) {
                dheba.child("price12").setValue(price12.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (price13.text.toString().isNotBlank()) {
                dheba.child("price13").setValue(price13.text.toString())
                        .addOnSuccessListener {
                            toaster=true
                        }
            }

            if (checkbox1.isChecked) {
                ref.child("check1").setValue("1") .addOnSuccessListener {
                    toaster=true
                }
            }
            else {ref.child("check1").setValue("0")}

            checkbox2.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check2").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check2").setValue("0")}
            }

            checkbox3.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check3").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check3").setValue("0")}
            }

            checkbox4.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check4").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check4").setValue("0")}
            }

            checkbox5.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check5").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check5").setValue("0")}
            }

            checkbox6.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check6").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check6").setValue("0")}
            }

            checkbox7.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check7").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check7").setValue("0")}
            }

            checkbox8.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check8").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check8").setValue("0")}
            }

            checkbox9.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check9").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check9").setValue("0")}
            }

            checkbox10.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check10").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check10").setValue("0")}
            }

            checkbox11.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check11").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check11").setValue("0")}
            }

            checkbox12.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check12").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check12").setValue("0")}
            }

            checkbox13.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true) { ref.child("check13").setValue("1") .addOnSuccessListener {
                    Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
                }}
                else {ref.child("check13").setValue("0")}
            }


            if (toaster==true) {
                Toast.makeText(activity,"Update Successful", Toast.LENGTH_LONG).show()
            }
            //  Toast.makeText(this, "$toaster",Toast.LENGTH_LONG).show()

        }


        resetbutton.setOnClickListener {
            conditionref.child("remark1").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark2").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark3").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark4").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark5").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark6").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark7").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark8").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark9").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark10").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark11").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark12").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            conditionref.child("remark13").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check1").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check2").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check3").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check4").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check5").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check6").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check7").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check8").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check9").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check10").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check11").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check12").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            ref.child("check13").setValue("0")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }

            dheba.child("price1").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }

            dheba.child("price2").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price3").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price4").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price5").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price6").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price7").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price8").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price9").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price10").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price11").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price12").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
            dheba.child("price13").setValue(" ")
                    .addOnSuccessListener {
                        Toast.makeText(activity, "Reset Successful", Toast.LENGTH_LONG).show()
                    }
        }




    }
}