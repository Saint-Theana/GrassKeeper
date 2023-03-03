package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeEffectViewReq {
    @Tag(tag=10) public List<Integer> viewCurseList = new ArrayList<>();
    @Tag(tag=2) public List<Integer> viewCardList = new ArrayList<>();
}
