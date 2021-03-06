package io.github.kenneycode.funrenderer.common

/**
 *
 *      Coded by kenney
 *
 *      http://www.github.com/kenneycode
 *
 **/

class Constants {

    companion object {

        val COMMON_VERTEX_SHADER =
                "#version 300 es\n" +
                "precision mediump float;\n" +
                "in vec4 a_position;\n" +
                "in vec2 a_textureCoordinate;\n" +
                "out vec2 v_textureCoordinate;\n" +
                "void main() {\n" +
                "    v_textureCoordinate = a_textureCoordinate;\n" +
                "    gl_Position = a_position;\n" +
                "}"

        val COMMON_FRAGMENT_SHADER =
                "#version 300 es\n" +
                "precision mediump float;\n" +
                "in vec2 v_textureCoordinate;\n" +
                "layout(location = 0) out vec4 fragColor;\n" +
                "uniform sampler2D u_texture;\n" +
                "void main() {\n" +
                "    fragColor = texture(u_texture, v_textureCoordinate);\n" +
                "}"

        val OES_VERTEX_SHADER =
                "#version 300 es\n" +
                "precision mediump float;\n" +
                "in vec4 a_position;\n" +
                "in vec4 a_textureCoordinate;\n" +
                "uniform mat4 u_stMatrix;\n" +
                "out vec2 v_textureCoordinate;\n" +
                "void main() {\n" +
                "    v_textureCoordinate = (u_stMatrix * a_textureCoordinate).xy;\n" +
                "    gl_Position = a_position;\n" +
                "}"

        val OES_FRAGMENT_SHADER =
                "#version 300 es\n" +
                "#extension GL_OES_EGL_image_external_essl3 : require\n" +
                "precision mediump float;\n" +
                "uniform samplerExternalOES u_texture;\n" +
                "in vec2 v_textureCoordinate;\n" +
                "layout(location = 0) out vec4 fragColor;\n" +
                "void main() {\n" +
                "    fragColor = texture(u_texture, v_textureCoordinate);\n" +
                "}"

        val COMMON_VERTEX = floatArrayOf(-1f, -1f, -1f, 1f, 1f, 1f, -1f, -1f, 1f, 1f, 1f, -1f)
        val COMMON_TEXTURE_COORDINATE = floatArrayOf(0f, 0f, 0f, 1f, 1f, 1f, 0f, 0f, 1f, 1f, 1f, 0f)
        val COMMON_VERTEX_FLIPY = floatArrayOf(-1f, 1f, -1f, -1f, 1f, -1f, -1f, 1f, 1f, -1f, 1f, 1f)

    }

}