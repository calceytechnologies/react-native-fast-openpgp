// automatically generated by the FlatBuffers compiler, do not modify

package com.reactnativefastopenpgp.model

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
@ExperimentalUnsignedTypes
class BoolResponse : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : BoolResponse {
        __init(_i, _bb)
        return this
    }
    val output : Boolean
        get() {
            val o = __offset(4)
            return if(o != 0) 0.toByte() != bb.get(o + bb_pos) else false
        }
    fun mutateOutput(output: Boolean) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.put(o + bb_pos, (if(output) 1 else 0).toByte())
            true
        } else {
            false
        }
    }
    val error : String?
        get() {
            val o = __offset(6)
            return if (o != 0) __string(o + bb_pos) else null
        }
    val errorAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(6, 1)
    fun errorInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 6, 1)
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_1_12_0()
        fun getRootAsBoolResponse(_bb: ByteBuffer): BoolResponse = getRootAsBoolResponse(_bb, BoolResponse())
        fun getRootAsBoolResponse(_bb: ByteBuffer, obj: BoolResponse): BoolResponse {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun createBoolResponse(builder: FlatBufferBuilder, output: Boolean, errorOffset: Int) : Int {
            builder.startTable(2)
            addError(builder, errorOffset)
            addOutput(builder, output)
            return endBoolResponse(builder)
        }
        fun startBoolResponse(builder: FlatBufferBuilder) = builder.startTable(2)
        fun addOutput(builder: FlatBufferBuilder, output: Boolean) = builder.addBoolean(0, output, false)
        fun addError(builder: FlatBufferBuilder, error: Int) = builder.addOffset(1, error, 0)
        fun endBoolResponse(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
    }
}
