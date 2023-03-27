package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckSaveReq {
    public enum ICKJBGMKFAN {
        @Tag(tag=0) None ,
        @Tag(tag=7478) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public String name = null;
    @Tag(tag=14) public Integer deckId = null;
    @Tag(tag=13) public List<Integer> cardList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> characterCardList = new ArrayList<>();
}
