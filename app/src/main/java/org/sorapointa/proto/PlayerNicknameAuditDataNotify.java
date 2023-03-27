package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerNicknameAuditDataNotify {
    public enum PlayerNicknameAuditDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=168) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public ContentAuditInfo info = null;
}
