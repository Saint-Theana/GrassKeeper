package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RogueEffectRecord {
    @Tag(tag=3) public Boolean isNew = null;
    @Tag(tag=5) public Integer sourceId = null;
    @Tag(tag=1) public Integer count = null;
    @Tag(tag=9) public List<Integer> extraParamList = new ArrayList<>();
}
