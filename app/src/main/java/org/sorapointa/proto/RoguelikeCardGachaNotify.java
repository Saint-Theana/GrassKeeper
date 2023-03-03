package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeCardGachaNotify {
    @Tag(tag=10) public List<Integer> cardList = new ArrayList<>();
    @Tag(tag=11) public Boolean isCanRefresh = null;
}
