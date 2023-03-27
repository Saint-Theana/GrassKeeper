package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DropItemRsp {
    public enum DropItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=624) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer storeType = null;
    @Tag(tag=9) public Long guid = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
