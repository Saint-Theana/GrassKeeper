package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SignatureAuditConfigNotify {
    public enum SignatureAuditConfigNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4034) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Boolean isOpen = null;
    @Tag(tag=13) public Integer submitLimit = null;
}
