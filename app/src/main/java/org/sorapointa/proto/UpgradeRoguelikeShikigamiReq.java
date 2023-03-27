package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UpgradeRoguelikeShikigamiReq {
    public enum UpgradeRoguelikeShikigamiReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8153) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer shikigamiGroupId = null;
    @Tag(tag=6) public Integer upgradeLevel = null;
}
