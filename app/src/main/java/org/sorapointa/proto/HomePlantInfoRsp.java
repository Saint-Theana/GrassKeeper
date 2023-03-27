package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomePlantInfoRsp {
    public enum HomePlantInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4512) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<HomePlantFieldData> fieldList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
