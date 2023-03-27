package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGBasicDataNotify {
    public enum EKNAAOCIFJJ {
        @Tag(tag=0) None ,
        @Tag(tag=7017) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<Integer> levelRewardTakenList = new ArrayList<>();
    @Tag(tag=11) public Integer exp = null;
    @Tag(tag=1) public Integer level = null;
}
