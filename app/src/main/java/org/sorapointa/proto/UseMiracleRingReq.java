package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class UseMiracleRingReq {
    public enum MiracleRingOpType {
        @Tag(tag=0) MIRACLE_RING_OP_TYPE_NONE ,
        @Tag(tag=1) MIRACLE_RING_OP_TYPE_PLACE ,
        @Tag(tag=2) MIRACLE_RING_OP_TYPE_RETRACT ;
    }

    @Tag(tag=13) public Integer miracleRingOpType = null;
    @Tag(tag=8) public Vector pos = null;
    @Tag(tag=7) public Vector rot = null;
}
