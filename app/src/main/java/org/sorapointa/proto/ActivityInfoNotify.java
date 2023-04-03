package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityInfo.*;
import org.sorapointa.proto.ActivityInfo;

public class ActivityInfoNotify {
    public enum ActivityInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2136) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public ActivityInfo activityInfo = null;
}
