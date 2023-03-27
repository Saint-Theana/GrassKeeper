package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AsterLittleInfoNotify {
    public enum AsterLittleInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2063) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public AsterLittleDetailInfo info = null;
}
