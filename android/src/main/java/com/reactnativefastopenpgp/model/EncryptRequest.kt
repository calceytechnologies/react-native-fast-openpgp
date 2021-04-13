// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class EncryptRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : EncryptRequest {
        __init(_i, _bb)
        return this
    }
    val message : String?
        get() {
            val o = __offset(4)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val messageAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(4, 1)
    fun messageInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 4, 1)
    val publicKey : String?
        get() {
            val o = __offset(6)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val publicKeyAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun publicKeyInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    val options : KeyOptions? get() = options(KeyOptions())
    fun options(obj: KeyOptions) : KeyOptions? {
        val o = __offset(8)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val signed : Entity? get() = signed(Entity())
    fun signed(obj: Entity) : Entity? {
        val o = __offset(10)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    val fileHints : FileHints? get() = fileHints(FileHints())
    fun fileHints(obj: FileHints) : FileHints? {
        val o = __offset(12)
        return if (o != 0) {
            obj.__assign(__indirect(o + bb_pos), bb)
        } else {
            null
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsEncryptRequest(_bb: ByteBuffer): EncryptRequest = getRootAsEncryptRequest(_bb, EncryptRequest())
        fun getRootAsEncryptRequest(_bb: ByteBuffer, obj: EncryptRequest): EncryptRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createEncryptRequest(builder: FlatBufferBuilder, messageOffset: Int, publicKeyOffset: Int, optionsOffset: Int, signedOffset: Int, fileHintsOffset: Int) : Int {
            builder.startTable(5)
            addFileHints(builder, fileHintsOffset)
            addSigned(builder, signedOffset)
            addOptions(builder, optionsOffset)
            addPublicKey(builder, publicKeyOffset)
            addMessage(builder, messageOffset)
            return endEncryptRequest(builder)
        }
        fun startEncryptRequest(builder: FlatBufferBuilder) = builder.startTable(5)
        fun addMessage(builder: FlatBufferBuilder, message: Int) = builder.addOffset(0, message, 0)
        fun addPublicKey(builder: FlatBufferBuilder, publicKey: Int) = builder.addOffset(1, publicKey, 0)
        fun addOptions(builder: FlatBufferBuilder, options: Int) = builder.addOffset(2, options, 0)
        fun addSigned(builder: FlatBufferBuilder, signed: Int) = builder.addOffset(3, signed, 0)
        fun addFileHints(builder: FlatBufferBuilder, fileHints: Int) = builder.addOffset(4, fileHints, 0)
        fun endEncryptRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
