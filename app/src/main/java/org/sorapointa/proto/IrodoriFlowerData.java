package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriFlowerData {
    @Tag(tag=5) public List<Integer> finishedThemeList = new ArrayList<>();
    @Tag(tag=12) public List<ItemParam> usedFlowerList = new ArrayList<>();
}
