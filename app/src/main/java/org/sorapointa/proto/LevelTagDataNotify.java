package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LevelTagDataNotify {
    @Tag(tag=9) public List<Integer> levelTagIdList = new ArrayList<>();
}
