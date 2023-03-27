package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class JoinHomeWorldFailNotify {
    public enum JoinHomeWorldFailNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4567) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer targetUid = null;
}
