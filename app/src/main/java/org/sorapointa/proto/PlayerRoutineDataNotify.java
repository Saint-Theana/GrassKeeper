package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerRoutineInfo.*;
import org.sorapointa.proto.PlayerRoutineInfo;

public class PlayerRoutineDataNotify {
    public enum PlayerRoutineDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3538) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<PlayerRoutineInfo> routineInfoList = new ArrayList<>();
}
