package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SaveMainCoopRsp {
    public enum SaveMainCoopRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1991) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<Integer> savePointIdList = new ArrayList<>();
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer id = null;
}
