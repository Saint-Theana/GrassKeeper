package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterWorldAreaRsp {
    public enum EnterWorldAreaRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=250) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer areaType = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer areaId = null;
}
