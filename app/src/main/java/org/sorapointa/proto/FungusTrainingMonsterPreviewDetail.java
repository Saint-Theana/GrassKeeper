package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FungusTrainingMonsterPreviewDetail {
    @Tag(tag=3) public Integer monsterId = null;
    @Tag(tag=5) public Integer level = null;
    @Tag(tag=11) public List<Integer> affixList = new ArrayList<>();
}
