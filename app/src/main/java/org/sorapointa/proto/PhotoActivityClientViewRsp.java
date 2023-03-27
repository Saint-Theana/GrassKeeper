package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PhotoActivityClientViewRsp {
    public enum PhotoActivityClientViewRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8441) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer posId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
