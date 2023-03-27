package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriGainCrystalExpUpdateNotify {
    public enum MichiaeMatsuriGainCrystalExpUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8794) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer gainCrystalExp = null;
    @Tag(tag=4) public Integer activityId = null;
}
