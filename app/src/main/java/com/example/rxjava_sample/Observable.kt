package com.example.rxjava_sample

import android.util.Log
import com.example.rxjava_sample.MainActivity.Companion.TAG
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable
import java.lang.Exception

fun createObservable() : Observable<Int> {
    return Observable.create { emitter ->
        try {
            // isDisposed : 購読を解除している場合はtrue、解除していない場合はfalseを返す
            if (!emitter.isDisposed) {
                for (i in 0..100) {
                    emitter.onNext(i)
                }
            }
            emitter.onComplete()
        }
        catch(e:Exception) {
            emitter.onError(e)
        }
    }
}

fun observer(): Observer<Int> {
    return object: Observer<Int> {
        override fun onSubscribe(d: Disposable) {
            Log.d(TAG, "Subscribe")

        }

        override fun onNext(t: Int) {
            Log.d(TAG, "onNext : $t")
        }

        override fun onError(e: Throwable) {
            Log.d(TAG, "onError")
        }

        override fun onComplete() {
            Log.d(TAG, "onComplete")
        }
    }
}


fun createSingleObservable() : Single<Int> {
    return Single.create { emitter ->
        try {
            if (!emitter.isDisposed) {
                for (i in 1..100) {
//                    emitter.onNext(i)
                    emitter.onSuccess(i)
                }
//                emitter.onComplete()
            }
        }
        catch (e: Exception) {
            emitter.onError(e)
        }

    }
}

fun singleObservable() : SingleObserver<Int> {
    return object : SingleObserver<Int> {
        override fun onSubscribe(d: Disposable) {
            Log.d(TAG, "onSubscribe")
        }

        override fun onSuccess(t: Int) {
            Log.d(TAG, "onSuccess : $t")

        }

        override fun onError(e: Throwable) {
            Log.d(TAG, "onError : $e")
        }

    }
}