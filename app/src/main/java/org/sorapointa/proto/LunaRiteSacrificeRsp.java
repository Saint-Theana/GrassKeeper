package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LunaRiteSacrificeRsp {
    public enum LunaRiteSacrificeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8324) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer areaId = null;
    @Tag(tag=7) public Integer index = null;
    @Tag(tag=9) public List<Integer> sacrificeList = new ArrayList<>();
}
