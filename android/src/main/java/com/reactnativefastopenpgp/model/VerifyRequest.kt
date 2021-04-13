// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class VerifyRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : VerifyRequest {
        __init(_i, _bb)
        return this
    }
    val signature : String?
        get() {
            val o = __offset(4)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val signatureAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(4, 1)
    fun signatureInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 4, 1)
    val message : String?
        get() {
            val o = __offset(6)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val messageAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun messageInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    val publicKey : String?
        get() {
            val o = __offset(8)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val publicKeyAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(8, 1)
    fun publicKeyInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 8, 1)
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsVerifyRequest(_bb: ByteBuffer): VerifyRequest = getRootAsVerifyRequest(_bb, VerifyRequest())
        fun getRootAsVerifyRequest(_bb: ByteBuffer, obj: VerifyRequest): VerifyRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createVerifyRequest(builder: FlatBufferBuilder, signatureOffset: Int, messageOffset: Int, publicKeyOffset: Int) : Int {
            builder.startTable(3)
            addPublicKey(builder, publicKeyOffset)
            addMessage(builder, messageOffset)
            addSignature(builder, signatureOffset)
            return endVerifyRequest(builder)
        }
        fun startVerifyRequest(builder: FlatBufferBuilder) = builder.startTable(3)
        fun addSignature(builder: FlatBufferBuilder, signature: Int) = builder.addOffset(0, signature, 0)
        fun addMessage(builder: FlatBufferBuilder, message: Int) = builder.addOffset(1, message, 0)
        fun addPublicKey(builder: FlatBufferBuilder, publicKey: Int) = builder.addOffset(2, publicKey, 0)
        fun endVerifyRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
