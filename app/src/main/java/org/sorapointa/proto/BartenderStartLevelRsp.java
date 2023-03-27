package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BartenderStartLevelRsp {
    public enum BartenderStartLevelRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8495) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<Integer> orderList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer levelId = null;
    @Tag(tag=6) public Integer time = null;
}
