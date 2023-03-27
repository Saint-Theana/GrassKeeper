package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MarkTargetInvestigationMonsterNotify {
    public enum MarkTargetInvestigationMonsterNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1913) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer groupId = null;
    @Tag(tag=12) public Integer monsterId = null;
    @Tag(tag=14) public Integer sceneId = null;
    @Tag(tag=2) public Integer investigationMonsterId = null;
}
