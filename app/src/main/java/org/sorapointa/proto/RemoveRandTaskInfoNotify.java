package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RemoveRandTaskInfoNotify {
    public enum FinishReason {
        @Tag(tag=0) FINISH_REASON_DEFAULT ,
        @Tag(tag=1) FINISH_REASON_CLEAR ,
        @Tag(tag=2) FINISH_REASON_DISTANCE ,
        @Tag(tag=3) FINISH_REASON_FINISH ;
    }

    @Tag(tag=9) public Boolean isSucc = null;
    @Tag(tag=10) public FinishReason reason = null;
    @Tag(tag=13) public Integer randTaskId = null;
}
