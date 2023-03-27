package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InteractDailyDungeonInfoNotify {
    public enum InteractDailyDungeonInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=923) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

}
