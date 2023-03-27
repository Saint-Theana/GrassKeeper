package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RegionalPlayInfoNotify {
    public enum RegionalPlayInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6288) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public String playName = null;
    @Tag(tag=11) public List<RegionalPlayVar> varList = new ArrayList<>();
    @Tag(tag=14) public Integer playType = null;
    @Tag(tag=2) public Boolean isEnabled = null;
    @Tag(tag=7) public Boolean isInRegion = null;
}
