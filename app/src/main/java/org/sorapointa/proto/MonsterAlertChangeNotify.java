package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MonsterAlertChangeNotify {
    @Tag(tag=15) public Integer avatarEntityId = null;
    @Tag(tag=5) public List<Integer> monsterEntityList = new ArrayList<>();
    @Tag(tag=13) public Integer isAlert = null;
}
