package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoLeaveDungeonNotify {
    public enum SumoLeaveDungeonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8842) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

}
