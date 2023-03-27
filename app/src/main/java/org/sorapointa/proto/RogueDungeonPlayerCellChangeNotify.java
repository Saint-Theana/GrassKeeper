package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueDungeonPlayerCellChangeNotify {
    public enum RogueDungeonPlayerCellChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8954) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer cellId = null;
    @Tag(tag=1) public Integer oldCellId = null;
}
