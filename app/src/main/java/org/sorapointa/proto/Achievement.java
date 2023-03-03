package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Achievement {
    public enum Status {
        @Tag(tag=0) STATUS_INVALID ,
        @Tag(tag=1) STATUS_UNFINISHED ,
        @Tag(tag=2) STATUS_FINISHED ,
        @Tag(tag=3) STATUS_REWARD_TAKEN ;
    }

    @Tag(tag=11) public Integer finishTimestamp = null;
    @Tag(tag=13) public Status status = null;
    @Tag(tag=12) public Integer curProgress = null;
    @Tag(tag=14) public Integer id = null;
    @Tag(tag=8) public Integer totalProgress = null;
}
