package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CanUseSkillNotify {
    public enum CanUseSkillNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1069) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Boolean isCanUseSkill = null;
}
