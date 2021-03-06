package io.github.kenneycode.funrenderer.io

import io.github.kenneycode.funrenderer.common.Ref

/**
 *
 *      Coded by kenney
 *
 *      http://www.github.com/kenneycode
 *
 **/

abstract class Input(var width: Int = 0, var height: Int = 0) : Ref() {

    abstract fun getInput(): IntArray
    open fun release() {}

}