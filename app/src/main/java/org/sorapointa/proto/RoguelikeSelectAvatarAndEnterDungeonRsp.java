package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeSelectAvatarAndEnterDungeonRsp {
    public enum RoguelikeSelectAvatarAndEnterDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8932) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer stageId = null;
}
