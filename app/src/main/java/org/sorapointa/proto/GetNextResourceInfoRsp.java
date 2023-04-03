package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ResVersionConfig.*;
import org.sorapointa.proto.ResVersionConfig;

public class GetNextResourceInfoRsp {
    public enum GetNextResourceInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=189) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public ResVersionConfig nextResVersionConfig = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public String nextResourceUrl = null;
}
