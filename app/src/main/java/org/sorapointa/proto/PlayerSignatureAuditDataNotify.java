package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerSignatureAuditDataNotify {
    public enum PlayerSignatureAuditDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4077) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public ContentAuditInfo info = null;
}
