package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBrief.*;
import org.sorapointa.proto.CustomDungeonBrief;

public class CustomDungeonUpdateNotify {
    public enum CustomDungeonUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6203) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public CustomDungeonBrief dungeonBrief = null;
}
