package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGOperationRsp {
    public enum ILJPBGCIOBB {
        @Tag(tag=0) None ,
        @Tag(tag=7651) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer opSeq = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
