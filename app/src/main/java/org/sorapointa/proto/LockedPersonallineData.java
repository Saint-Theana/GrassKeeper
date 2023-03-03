package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LockedPersonallineData {
    public enum LockReason {
        @Tag(tag=0) LOCK_REASON_LEVEL ,
        @Tag(tag=1) LOCK_REASON_QUEST ;
    }

    @Tag(tag=2) public LockReason lockReason = null;
    @Tag(tag=13) public Integer personalLineId = null;
    @Tag(tag=3) public Integer chapterId = null;
    @Tag(tag=1) public Integer level = null;
}
