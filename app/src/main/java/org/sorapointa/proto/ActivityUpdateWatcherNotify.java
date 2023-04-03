package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityWatcherInfo.*;
import org.sorapointa.proto.ActivityWatcherInfo;

public class ActivityUpdateWatcherNotify {
    public enum ActivityUpdateWatcherNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2079) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public ActivityWatcherInfo watcherInfo = null;
    @Tag(tag=3) public Integer activityId = null;
}
