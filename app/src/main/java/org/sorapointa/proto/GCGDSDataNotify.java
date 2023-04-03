package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDSCardData.*;
import org.sorapointa.proto.GCGDSCardData;
import org.sorapointa.proto.GCGDSDeckData.*;
import org.sorapointa.proto.GCGDSDeckData;

public class GCGDSDataNotify {
    public enum EGDHDJOMKPG {
        @Tag(tag=0) None ,
        @Tag(tag=7558) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<Integer> unlockCardBackIdList = new ArrayList<>();
    @Tag(tag=7) public List<GCGDSCardData> cardList = new ArrayList<>();
    @Tag(tag=2) public Integer curDeckId = null;
    @Tag(tag=13) public List<Integer> unlockDeckIdList = new ArrayList<>();
    @Tag(tag=11) public List<GCGDSDeckData> deckList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> unlockFieldIdList = new ArrayList<>();
}
