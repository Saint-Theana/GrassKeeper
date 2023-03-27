package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeCardGachaNotify {
    public enum RoguelikeCardGachaNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8033) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Boolean isCanRefresh = null;
    @Tag(tag=5) public List<Integer> cardList = new ArrayList<>();
}
