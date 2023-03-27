package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CloseCommonTipsNotify {
    public enum CloseCommonTipsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3010) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

}
