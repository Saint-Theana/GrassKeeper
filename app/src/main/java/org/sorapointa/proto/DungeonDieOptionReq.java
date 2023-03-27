package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonDieOptionReq {
    public enum DungeonDieOptionReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=929) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer dieOption = null;
    @Tag(tag=11) public Boolean isQuitImmediately = null;
}
