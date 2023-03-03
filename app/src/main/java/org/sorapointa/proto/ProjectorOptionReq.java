package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProjectorOptionReq {
    public enum ProjectorOpType {
        @Tag(tag=0) PROJECTOR_OP_TYPE_NONE ,
        @Tag(tag=1) PROJECTOR_OP_TYPE_CREATE ,
        @Tag(tag=2) PROJECTOR_OP_TYPE_DESTROY ;
    }

    @Tag(tag=7) public Integer opType = null;
    @Tag(tag=10) public Integer entityId = null;
}
