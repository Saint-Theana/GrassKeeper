package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpgradeRoguelikeShikigamiRsp {
    public enum UpgradeRoguelikeShikigamiRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8113) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer curLevel = null;
    @Tag(tag=5) public Integer shikigamiGroupId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
