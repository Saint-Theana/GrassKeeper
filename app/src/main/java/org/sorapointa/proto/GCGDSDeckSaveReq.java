package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSDeckSaveReq {
    @Tag(tag=1) public Integer deckId = null;
    @Tag(tag=4) public List<Integer> cardList = new ArrayList<>();
    @Tag(tag=9) public List<Integer> characterCardList = new ArrayList<>();
    @Tag(tag=14) public String name = null;
}
