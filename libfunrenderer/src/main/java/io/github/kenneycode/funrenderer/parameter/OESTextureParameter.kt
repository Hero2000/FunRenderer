package io.github.kenneycode.funrenderer.parameter

import android.opengl.GLES11Ext
import android.opengl.GLES30

/**
 *
 *      Coded by kenney
 *
 *      http://www.github.com/kenneycode
 *
 **/

class OESTextureParameter(key : String, private val value : Int) : Parameter(key) {

    override fun bindUniform(program: Int) {
        if (location < 0) {
            location = GLES30.glGetUniformLocation(program, key)
        }
        GLES30.glActiveTexture(GLES30.GL_TEXTURE0)
        GLES30.glBindTexture(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, value)
        GLES30.glUniform1i(location, 0)
    }
}