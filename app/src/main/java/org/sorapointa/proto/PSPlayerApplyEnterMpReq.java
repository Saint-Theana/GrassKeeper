package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PSPlayerApplyEnterMpReq {
    public enum PSPlayerApplyEnterMpReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1837) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public String targetPsnId = null;
}
