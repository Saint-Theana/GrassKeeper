package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AddSeenMonsterNotify {
    @Tag(tag=12) public List<Integer> monsterIdList = new ArrayList<>();
}
