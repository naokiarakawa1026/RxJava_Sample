package com.example.rxjava_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        // Observable, Observer
//        createObservable().subscribe(
//            {
//                Log.d(TAG, "onNext : $it")
//            },
//            {
//                Log.d(TAG, "onError : $it")
//            },
//            {
//                Log.d(TAG, "onComplete")
//            }
//        )
//
//        createObservable().subscribe(observer())


//        // Single
//        createSingleObservable().subscribe(singleObservable())
//
//        createSingleObservable().subscribe(
//            {
//                Log.d(TAG, "onSuccess : $it")
//            },
//            {
//                Log.d(TAG, "onError : $it")
//            }
//        )

        // Maybe
//        createMaybeObservable().subscribe(observableMaybeObservable())




    }



    companion object {
        const val TAG = "MainActivityRxJava"
    }
}