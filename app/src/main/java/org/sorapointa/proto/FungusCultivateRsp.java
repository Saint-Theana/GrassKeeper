package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusCultivateRsp {
    public enum FLGGLCPECFO {
        @Tag(tag=0) None ,
        @Tag(tag=23930) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer cultivateId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
}
