package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GmTalkNotify {
    public enum GmTalkNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=75) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public String msg = null;
}
