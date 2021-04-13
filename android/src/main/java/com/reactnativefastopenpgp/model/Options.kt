// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class Options : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : Options {
        __init(_i, _bb)
        return this
    }
    val name : String?
        get() {
            val o = __offset(4)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val nameAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(4, 1)
    fun nameInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 4, 1)
    val comment : String?
        get() {
            val o = __offset(6)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val commentAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun commentInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    val email : String?
        get() {
            val o = __offset(8)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val emailAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(8, 1)
    fun emailInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 8, 1)
    val passphrase : String?
        get() {
            val o = __offset(10)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val passphraseAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(10, 1)
    fun passphraseInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 10, 1)
    val keyOptions : KeyOptions? get() = keyOptions(KeyOptions())
    fun keyOptions(obj: KeyOptions) : KeyOptions? {
        val o = __offset(12)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsOptions(_bb: ByteBuffer): Options = getRootAsOptions(_bb, Options())
        fun getRootAsOptions(_bb: ByteBuffer, obj: Options): Options {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createOptions(builder: FlatBufferBuilder, nameOffset: Int, commentOffset: Int, emailOffset: Int, passphraseOffset: Int, keyOptionsOffset: Int) : Int {
            builder.startTable(5)
            addKeyOptions(builder, keyOptionsOffset)
            addPassphrase(builder, passphraseOffset)
            addEmail(builder, emailOffset)
            addComment(builder, commentOffset)
            addName(builder, nameOffset)
            return endOptions(builder)
        }
        fun startOptions(builder: FlatBufferBuilder) = builder.startTable(5)
        fun addName(builder: FlatBufferBuilder, name: Int) = builder.addOffset(0, name, 0)
        fun addComment(builder: FlatBufferBuilder, comment: Int) = builder.addOffset(1, comment, 0)
        fun addEmail(builder: FlatBufferBuilder, email: Int) = builder.addOffset(2, email, 0)
        fun addPassphrase(builder: FlatBufferBuilder, passphrase: Int) = builder.addOffset(3, passphrase, 0)
        fun addKeyOptions(builder: FlatBufferBuilder, keyOptions: Int) = builder.addOffset(4, keyOptions, 0)
        fun endOptions(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
