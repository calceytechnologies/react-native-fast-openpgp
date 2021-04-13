// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class VerifyBytesRequest : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : VerifyBytesRequest {
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
    fun message(j: Int) : UByte {
        val o = __offset(6)
        return if (o != 0) {
            bb.get(__vector(o) + j * 1).toUByte()
        } else {
            0u
        }
    }
    val messageLength : Int
        get() {
            val o = __offset(6); return if (o != 0) __vector_len(o) else 0
        }
    val messageAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun messageInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    fun mutateMessage(j: Int, message: UByte) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.put(__vector(o) + j * 1, message.toByte())
            true
        } else {
            false
        }
    }
    val publicKey : String?
        get() {
            val o = __offset(8)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val publicKeyAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(8, 1)
    fun publicKeyInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 8, 1)
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsVerifyBytesRequest(_bb: ByteBuffer): VerifyBytesRequest = getRootAsVerifyBytesRequest(_bb, VerifyBytesRequest())
        fun getRootAsVerifyBytesRequest(_bb: ByteBuffer, obj: VerifyBytesRequest): VerifyBytesRequest {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createVerifyBytesRequest(builder: FlatBufferBuilder, signatureOffset: Int, messageOffset: Int, publicKeyOffset: Int) : Int {
            builder.startTable(3)
            addPublicKey(builder, publicKeyOffset)
            addMessage(builder, messageOffset)
            addSignature(builder, signatureOffset)
            return endVerifyBytesRequest(builder)
        }
        fun startVerifyBytesRequest(builder: FlatBufferBuilder) = builder.startTable(3)
        fun addSignature(builder: FlatBufferBuilder, signature: Int) = builder.addOffset(0, signature, 0)
        fun addMessage(builder: FlatBufferBuilder, message: Int) = builder.addOffset(1, message, 0)
        fun createMessageVector(builder: FlatBufferBuilder, data: UByteArray) : Int {
            builder.startVector(1, data.size, 1)
            for (i in data.size - 1 downTo 0) {
                builder.addByte(data[i].toByte())
            }
            return builder.endVector()
        }
        fun startMessageVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(1, numElems, 1)
        fun addPublicKey(builder: FlatBufferBuilder, publicKey: Int) = builder.addOffset(2, publicKey, 0)
        fun endVerifyBytesRequest(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
