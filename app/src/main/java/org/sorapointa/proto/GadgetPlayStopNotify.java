package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GadgetPlayUidInfo.*;
import org.sorapointa.proto.GadgetPlayUidInfo;

public class GadgetPlayStopNotify {
    public enum GadgetPlayStopNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=814) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<GadgetPlayUidInfo> uidInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer costTime = null;
    @Tag(tag=14) public Integer score = null;
    @Tag(tag=7) public Boolean isWin = null;
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=11) public Integer playType = null;
}
