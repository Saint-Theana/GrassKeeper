package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AsterProgressInfoNotify {
    public enum AsterProgressInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2091) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public AsterProgressDetailInfo info = null;
}
