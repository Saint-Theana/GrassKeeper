package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteSacrificeReq {
    public enum LunaRiteSacrificeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8743) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer index = null;
    @Tag(tag=2) public Integer areaId = null;
}
