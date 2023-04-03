package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionWatcherInfo.*;
import org.sorapointa.proto.ReunionWatcherInfo;

public class UpdateReunionWatcherNotify {
    public enum UpdateReunionWatcherNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5087) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer missionId = null;
    @Tag(tag=14) public ReunionWatcherInfo watcherInfo = null;
}
