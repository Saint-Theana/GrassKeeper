package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RemoveRandTaskInfoNotify {
    public enum RemoveRandTaskInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=115) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer randTaskId = null;
    @Tag(tag=7) public Boolean isSucc = null;
    @Tag(tag=2) public Integer reason = null;
}
