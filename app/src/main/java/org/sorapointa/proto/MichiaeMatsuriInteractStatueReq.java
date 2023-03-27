package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriInteractStatueReq {
    public enum MichiaeMatsuriInteractStatueReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8553) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer statueEntityId = null;
}
