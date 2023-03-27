package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerPropChangeNotify {
    public enum PlayerPropChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=146) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer propDelta = null;
    @Tag(tag=12) public Integer propType = null;
}
