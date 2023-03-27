package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DragonSpineCoinChangeNotify {
    public enum DragonSpineCoinChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2067) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer shimmeringEssence = null;
    @Tag(tag=14) public Integer scheduleId = null;
    @Tag(tag=1) public Integer wondrousEssence = null;
    @Tag(tag=5) public Integer warmEssence = null;
}
