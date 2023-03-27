package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MpPlayPrepareNotify {
    public enum MpPlayPrepareNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1822) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer prepareEndTime = null;
    @Tag(tag=1) public Integer mpPlayId = null;
}
