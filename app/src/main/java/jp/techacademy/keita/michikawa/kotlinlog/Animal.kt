package jp.techacademy.keita.michikawa.kotlinlog

abstract open class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}