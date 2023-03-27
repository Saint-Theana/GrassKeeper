package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientNewMailNotify {
    public enum ClientNewMailNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1414) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer notReadNum = null;
    @Tag(tag=11) public Integer notGotAttachmentNum = null;
}
