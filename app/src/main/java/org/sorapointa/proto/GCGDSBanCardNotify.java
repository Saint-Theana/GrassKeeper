package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSBanCardNotify {
    public enum IHPPDDIPNOD {
        @Tag(tag=0) None ,
        @Tag(tag=7734) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<Integer> cardList = new ArrayList<>();
}
