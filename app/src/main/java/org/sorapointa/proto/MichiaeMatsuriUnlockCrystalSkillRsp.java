package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriUnlockCrystalSkillRsp {
    public enum MichiaeMatsuriUnlockCrystalSkillRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8889) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer crystalSkillId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
