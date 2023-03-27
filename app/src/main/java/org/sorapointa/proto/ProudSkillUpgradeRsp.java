package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillUpgradeRsp {
    public enum ProudSkillUpgradeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1014) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer proudSkillId = null;
    @Tag(tag=11) public Long avatarGuid = null;
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
}
