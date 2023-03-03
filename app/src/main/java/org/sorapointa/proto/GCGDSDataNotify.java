package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGDSCardData.*;
import org.sorapointa.proto.GCGDSCardData;
import org.sorapointa.proto.GCGDSDeckData.*;
import org.sorapointa.proto.GCGDSDeckData;

public class GCGDSDataNotify {
    @Tag(tag=4) public List<GCGDSDeckData> deckList = new ArrayList<>();
    @Tag(tag=5) public List<Integer> unlockCardBackIdList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> unlockFieldIdList = new ArrayList<>();
    @Tag(tag=10) public Integer curDeckId = null;
    @Tag(tag=3) public List<GCGDSCardData> cardList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> unlockDeckIdList = new ArrayList<>();
}
