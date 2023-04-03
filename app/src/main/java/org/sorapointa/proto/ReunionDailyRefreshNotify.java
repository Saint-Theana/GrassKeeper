package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionBriefInfo.*;
import org.sorapointa.proto.ReunionBriefInfo;

public class ReunionDailyRefreshNotify {
    public enum ReunionDailyRefreshNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5098) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public ReunionBriefInfo reunionBriefInfo = null;
}
