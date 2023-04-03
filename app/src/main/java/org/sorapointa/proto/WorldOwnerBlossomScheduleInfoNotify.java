package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BlossomScheduleInfo.*;
import org.sorapointa.proto.BlossomScheduleInfo;

public class WorldOwnerBlossomScheduleInfoNotify {
    public enum WorldOwnerBlossomScheduleInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2720) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public BlossomScheduleInfo scheduleInfo = null;
}
