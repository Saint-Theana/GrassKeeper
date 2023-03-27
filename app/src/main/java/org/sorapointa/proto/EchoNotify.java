package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EchoNotify {
    public enum EchoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=88) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public String content = null;
    @Tag(tag=3) public Integer seqId = null;
}
