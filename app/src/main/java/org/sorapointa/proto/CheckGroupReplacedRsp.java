package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CheckGroupReplacedRsp {
    public enum FJMGJMAPMLK {
        @Tag(tag=0) None ,
        @Tag(tag=3117) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<Integer> replacedGroupIdList = new ArrayList<>();
}
