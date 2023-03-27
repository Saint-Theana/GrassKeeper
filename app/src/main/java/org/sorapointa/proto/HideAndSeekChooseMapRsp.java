package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekChooseMapRsp {
    public enum BLGFBBFCKJP {
        @Tag(tag=0) None ,
        @Tag(tag=8321) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<Integer> mapList = new ArrayList<>();
}
