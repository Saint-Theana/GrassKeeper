package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriDarkPressureLevelUpdateNotify {
    public enum MichiaeMatsuriDarkPressureLevelUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8618) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer darkPressureLevel = null;
}
