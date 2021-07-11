// automatically generated by the FlatBuffers compiler, do not modify

import * as flatbuffers from 'flatbuffers';

import { Options } from '../model/options';


export class GenerateRequest {
  bb: flatbuffers.ByteBuffer|null = null;
  bb_pos = 0;
__init(i:number, bb:flatbuffers.ByteBuffer):GenerateRequest {
  this.bb_pos = i;
  this.bb = bb;
  return this;
}

static getRootAsGenerateRequest(bb:flatbuffers.ByteBuffer, obj?:GenerateRequest):GenerateRequest {
  return (obj || new GenerateRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

static getSizePrefixedRootAsGenerateRequest(bb:flatbuffers.ByteBuffer, obj?:GenerateRequest):GenerateRequest {
  bb.setPosition(bb.position() + flatbuffers.SIZE_PREFIX_LENGTH);
  return (obj || new GenerateRequest()).__init(bb.readInt32(bb.position()) + bb.position(), bb);
}

options(obj?:Options):Options|null {
  const offset = this.bb!.__offset(this.bb_pos, 4);
  return offset ? (obj || new Options()).__init(this.bb!.__indirect(this.bb_pos + offset), this.bb!) : null;
}

static startGenerateRequest(builder:flatbuffers.Builder) {
  builder.startObject(1);
}

static addOptions(builder:flatbuffers.Builder, optionsOffset:flatbuffers.Offset) {
  builder.addFieldOffset(0, optionsOffset, 0);
}

static endGenerateRequest(builder:flatbuffers.Builder):flatbuffers.Offset {
  const offset = builder.endObject();
  return offset;
}

static createGenerateRequest(builder:flatbuffers.Builder, optionsOffset:flatbuffers.Offset):flatbuffers.Offset {
  GenerateRequest.startGenerateRequest(builder);
  GenerateRequest.addOptions(builder, optionsOffset);
  return GenerateRequest.endGenerateRequest(builder);
}
}
