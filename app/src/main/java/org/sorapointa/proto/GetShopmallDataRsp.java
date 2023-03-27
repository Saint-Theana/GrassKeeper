package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetShopmallDataRsp {
    public enum GetShopmallDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=774) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public List<Integer> shopTypeList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
