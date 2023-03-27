package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGSettleOptionRsp {
    public enum GDGKDAPJIME {
        @Tag(tag=0) None ,
        @Tag(tag=7222) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer option = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
