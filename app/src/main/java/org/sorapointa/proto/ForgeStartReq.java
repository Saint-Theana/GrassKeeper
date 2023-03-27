package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeStartReq {
    public enum ForgeStartReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=652) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer avatarId = null;
    @Tag(tag=6) public Integer forgeCount = null;
    @Tag(tag=3) public Integer forgeId = null;
}
