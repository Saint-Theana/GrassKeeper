package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SpringUseRsp {
    public enum SpringUseRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1677) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Long guid = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
