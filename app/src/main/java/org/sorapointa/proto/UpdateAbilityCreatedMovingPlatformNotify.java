package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpdateAbilityCreatedMovingPlatformNotify {
    public enum OpType {
        @Tag(tag=0) OP_TYPE_NONE ,
        @Tag(tag=1) OP_TYPE_ACTIVATE ,
        @Tag(tag=2) OP_TYPE_DEACTIVATE ;
    }

    @Tag(tag=4) public Integer entityId = null;
    @Tag(tag=3) public OpType opType = null;
}
