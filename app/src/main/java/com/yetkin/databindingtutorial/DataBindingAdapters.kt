package com.yetkin.databindingtutorial

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("name")
fun TextView.myName(name: String) {
    this.text = "My name is $name"
}


@BindingAdapter("name", "age")
fun TextView.myNameAndAge(name: String, age: Int) {
    this.text = "My name is $name and I'm $age years old"
}