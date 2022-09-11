package jp.techacademy.keita.michikawa.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {
    var hobby: String = ""

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + this.name + "について考える")
    }
}